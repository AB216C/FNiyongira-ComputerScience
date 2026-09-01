# Types of Test

Unit test-Test the correctness of an individual code and catch bugs in development process

Integration test- Verify how different units or components of the application works together a whole

End to end Test-Test the whole application


# Testing Frameworks Advantage
1. Test runner
2. Assertion libraries
3. Mocking tools
4. Coverage tools

# Examples of tesing frameworks
1. Jest
2. Mocha
3. Jasmine
4. Vitest
5. Cypress
6. Playwright

# Two ways to write test
1. Code First and 
2. Test first


# Test First is also referred to as TEST DRIVENT DEVELOPMENT
Start with a failing test
Write enough code to make a test pass
Refactor if necessary



# CREATE THE JAVASCRIPT APP 

npm create vite@latest my-app

npm i -D vitest #D means vitest as a development 


# Package.json

Add this to the script:
   "test": "vitest"

# Run the test
npm test

npx vitest --watch

Unitest VS TDD

Unitest: write code first and test the code

TDD: Test while in development of the code

But the resulting code is always the same for both unit and TDD test












