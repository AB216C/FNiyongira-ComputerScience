from fastapi import status

API_PREFIX = "/v1"  # from api_router prefix


def sample_user_create_payload(email="user1@example.com"):
    return {
        "email": email,
        "first_name": "User",
        "last_name": "One",
    }


def sample_user_update_payload():
    return {
        "first_name": "Updated",
        "last_name": "Name",
        "email": "updated@example.com",
    }


def test_create_user(client):
    payload = sample_user_create_payload()
    resp = client.post(f"{API_PREFIX}/users", json=payload)

    assert resp.status_code == status.HTTP_201_CREATED
    data = resp.json()

    assert isinstance(data["id"], int)
    assert data["email"] == payload["email"]
    assert data["first_name"] == payload["first_name"]
    assert data["last_name"] == payload["last_name"]

    assert "created_at" in data
    assert "updated_at" in data
    assert data.get("is_active", True) is True


def test_list_users(client):
    client.post(
        f"{API_PREFIX}/users",
        json=sample_user_create_payload(email="user1@example.com"),
    )
    client.post(
        f"{API_PREFIX}/users",
        json=sample_user_create_payload(email="user2@example.com"),
    )

    resp = client.get(f"{API_PREFIX}/users")
    assert resp.status_code == status.HTTP_200_OK

    data = resp.json()
    assert isinstance(data, list)
    emails = {u["email"] for u in data}
    assert "user1@example.com" in emails
    assert "user2@example.com" in emails


def test_get_user(client):
    create_resp = client.post(f"{API_PREFIX}/users", json=sample_user_create_payload())
    assert create_resp.status_code == status.HTTP_201_CREATED
    created = create_resp.json()
    user_id = created["id"]

    resp = client.get(f"{API_PREFIX}/users/{user_id}")
    assert resp.status_code == status.HTTP_200_OK

    data = resp.json()
    assert data["id"] == user_id
    assert data["email"] == created["email"]


def test_update_user(client):
    create_resp = client.post(f"{API_PREFIX}/users", json=sample_user_create_payload())
    assert create_resp.status_code == status.HTTP_201_CREATED
    user_id = create_resp.json()["id"]

    update_payload = sample_user_update_payload()
    resp = client.put(f"{API_PREFIX}/users/{user_id}", json=update_payload)
    assert resp.status_code == status.HTTP_200_OK

    data = resp.json()
    assert data["id"] == user_id
    assert data["first_name"] == update_payload["first_name"]
    assert data["last_name"] == update_payload["last_name"]
    assert data["email"] == update_payload["email"]


def test_delete_user(client):
    create_resp = client.post(f"{API_PREFIX}/users", json=sample_user_create_payload())
    assert create_resp.status_code == status.HTTP_201_CREATED
    user_id = create_resp.json()["id"]

    delete_resp = client.delete(f"{API_PREFIX}/users/{user_id}")
    assert delete_resp.status_code == status.HTTP_204_NO_CONTENT

    get_resp = client.get(f"{API_PREFIX}/users/{user_id}")
    if get_resp.status_code == status.HTTP_200_OK:
        body = get_resp.json()
        assert body.get("is_active") is False
    else:
        assert get_resp.status_code in {
            status.HTTP_404_NOT_FOUND,
            status.HTTP_410_GONE,
        }
