Setting up and writing unit tests with Jest and React Testing Library
# First, let’s set up a new React application.

npx create-vite todo_testing_app --template react
cd  todo_testing_app
npm install

# To run the tests we'll need to have a testing environment set up with Jest and React Testing Library.

Install Jest and React Testing Library: Run the following command in your project directory to install the necessary dependencies.

npm install --save-dev jest @testing-library/react @testing-library/jest-dom jest-environment-jsdom

Install Babel: To use ES6 imports in your tests, you'll need Babel. Install it by running:

npm install --save-dev @babel/preset-env @babel/preset-react

# Configure Babel: Create a .babelrc file in your project root and add the following configuration:

{
  "presets": ["@babel/preset-env", "@babel/preset-react"]
}

# Configure Jest: Add the following Jest configuration to your package.json file:

"jest": {
    "testEnvironment": "jest-environment-jsdom",
    "setupFilesAfterEnv": [
      "@testing-library/jest-dom"
    ],
    "transform": {
      "^.+\\.jsx?$": "babel-jest"
    }
  }

# Configure Test script: Add the following test configuration to your package.json file in the scripts section:

"scripts": {
    "dev": "vite",
    "build": "vite build",
    "test": "jest",
    "lint": "eslint . --ext js,jsx --report-unused-disable-directives --max-warnings 0",
    "preview": "vite preview"
  },


# ButtonApiCall.test.js file: Negative test. Should fail

axios was not installed yet for this case

# ButtonApiCall.jsx: Postive test-should pass

Because installation of additional packages such as axios

# npm install axios



# Integration Testing: Bringing Components Together
While unit tests verify the smallest parts of your application, integration tests ensure that these parts work together harmoniously. For an integration test, you might test a form component that includes input fields, labels, and a submit button. The goal is to ensure that, when a user fills out the form and submits it, the expected actions occur — such as data validation and API calls.


import React from 'react';
import { render, fireEvent, waitFor, screen } from '@testing-library/react';
import '@testing-library/jest-dom';
import PostForm from '../PostForm';
React: Required for rendering the component in a test environment.
# Testing Library:

render: Renders the PostForm for testing.

fireEvent: Simulates user actions like typing and clicking.

waitFor: Waits for asynchronous operations (e.g., API calls).

screen: Provides access to the rendered DOM for queries.

jest-dom: Provides additional matchers (e.g., toBeInTheDocument).

PostForm: The component under test.

# Mock Implementation:
global.fetch is mocked to prevent actual API calls during testing.
Returns a resolved promise with a mock response that simulates the JSONPlaceholder API response.

# Test Suite and Description

describe('PostForm Component Integration Test', () => {
Describes the purpose of the test suite: testing the PostForm component integration with mocked API calls.

# The Test: submits the form data correctly

test('submits the form data correctly', async () => {
    render(<PostForm />);
render(<PostForm />):
Renders the PostForm component for testing.
Makes the form elements accessible via screen.

#  Simulate User Input

    fireEvent.change(screen.getByLabelText(/Title:/i), { target: { value: 'foo' } });
    fireEvent.change(screen.getByLabelText(/Body:/i), { target: { value: 'bar' } });
    fireEvent.change(screen.getByLabelText(/User ID:/i), { target: { value: '1' } });
fireEvent.change:
Simulates user typing in the form fields.
Finds input elements by their associated labels (getByLabelText) and updates their values.

# Simulate Form Submission

    fireEvent.click(screen.getByText(/Submit Post/i));
fireEvent.click:
Simulates a click on the "Submit Post" button.

#  Wait for API Call

    await waitFor(() => expect(fetch).toHaveBeenCalledTimes(1));
waitFor:
Waits for the asynchronous fetch call to complete.
Verifies that fetch was called exactly once during the test.

#  Verify Fetch Request Details

    expect(fetch).toHaveBeenCalledWith('<https://jsonplaceholder.typicode.com/posts>', {
      method: 'POST',
      body: JSON.stringify({ title: 'foo', body: 'bar', userId: 1 }),
      headers: {
        'Content-type': 'application/json; charset=UTF-8',
      },
    });
  });

toHaveBeenCalledWith:
Confirms that fetch was called with the correct:
URL: The JSONPlaceholder API endpoint.
Method: POST.
Body: A JSON string containing the mock form data.
Headers: Specifies content type as JSON.

# Exercises examples:
#Installation

npm install react-redux
npm install --save-dev redux-mock-store
npm i @reduxjs/toolkit

# Before installation, some test will fail
# After installation, somet test are expected to pass

