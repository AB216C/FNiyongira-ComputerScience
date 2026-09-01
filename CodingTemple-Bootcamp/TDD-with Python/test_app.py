import unittest
from app import app

## Adding this code down for the red test. app.py has nothing as of now: 1st Test-is a FAIL
## 2nd Test after adding the sum endpoint in app.py is a PASS

# Red test: Usually fail since there is no functionality in app.py
class TestAPI(unittest.TestCase):
    def setUp(self):
        self.app = app.test_client()


    def test_sum(self):
        payload = {"num1": 2, "num2": 3}
        response = self.app.post("/sum", json=payload)
        data = response.get_json()
        self.assertEqual(data['result'],5)

if __name__ == "__main__":
    unittest.main()
