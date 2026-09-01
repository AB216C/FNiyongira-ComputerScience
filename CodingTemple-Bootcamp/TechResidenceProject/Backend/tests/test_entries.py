from datetime import datetime, timezone
from fastapi import status

API_PREFIX = "/v1"  # from api_router = APIRouter(prefix="/v1")


def sample_entry_create_payload(text="hello world", lang="en", with_captured_at=True):
    payload = {
        "text": text,
        "lang": lang,
    }
    if with_captured_at:
        payload["captured_at"] = datetime(2024, 1, 1, tzinfo=timezone.utc).isoformat()
    return payload


def test_list_entries_initially_empty(client):
    resp = client.get(f"{API_PREFIX}/entries")
    assert resp.status_code == status.HTTP_200_OK
    data = resp.json()
    assert isinstance(data, list)
    assert data == []


def test_create_entry_with_defaults(client):
    resp = client.post(f"{API_PREFIX}/entries", json={})
    assert resp.status_code == status.HTTP_201_CREATED

    data = resp.json()
    assert "id" in data
    assert data["user_id"] == "usr_1"            # from router hard-coded value
    assert isinstance(data["captured_at"], str)  # JSON datetime
    assert data["text"] == ""                    # body.text or ""
    assert data["lang"] == "en"                  # body.lang or "en"
    assert data["deleted_at"] is None


def test_create_entry_with_payload(client):
    payload = sample_entry_create_payload(text="my entry", lang="fr")
    resp = client.post(f"{API_PREFIX}/entries", json=payload)
    assert resp.status_code == status.HTTP_201_CREATED

    data = resp.json()
    assert data["text"] == "my entry"
    assert data["lang"] == "fr"
    assert data["captured_at"].startswith("2024-01-01")


def test_list_entries_after_create(client):
    client.post(f"{API_PREFIX}/entries", json=sample_entry_create_payload(text="e1"))
    client.post(f"{API_PREFIX}/entries", json=sample_entry_create_payload(text="e2"))

    resp = client.get(f"{API_PREFIX}/entries")
    assert resp.status_code == status.HTTP_200_OK

    data = resp.json()
    texts = {e["text"] for e in data}
    assert {"e1", "e2"}.issubset(texts)


def test_get_entry_by_id(client):
    create_resp = client.post(
        f"{API_PREFIX}/entries",
        json=sample_entry_create_payload(),
    )
    assert create_resp.status_code == status.HTTP_201_CREATED
    created = create_resp.json()
    entry_id = created["id"]

    resp = client.get(f"{API_PREFIX}/entries/{entry_id}")
    assert resp.status_code == status.HTTP_200_OK

    data = resp.json()
    assert data["id"] == entry_id
    assert data["user_id"] == "usr_1"
    assert data["text"] == created["text"]
    assert data["lang"] == created["lang"]


def test_get_entry_not_found(client):
    resp = client.get(f"{API_PREFIX}/entries/ent_999")
    assert resp.status_code == status.HTTP_404_NOT_FOUND
    assert resp.json()["detail"] == "Entry not found"
