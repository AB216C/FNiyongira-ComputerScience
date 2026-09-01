# Packages

pip install flask

# UNITTEST

IT IS A PYTHON BUILT IN TEST

# Why Use TDD?
# There are several benefits to using TDD:

Better Code Quality: TDD encourages you to write better code by focusing on the requirements before writing the code.
Faster Development: TDD can speed up development because it forces you to think about the requirements before writing the code.
Fewer Bugs: TDD can reduce the number of bugs in your code because you are testing it as you write it.
# Unit Testing and Mocking
Unit testing is a software testing method where individual units or components of a software application are tested in isolation from the rest of the application. The goal of unit testing is to verify that each unit of code performs as expected. This can help identify bugs and ensure that the code is functioning correctly.

# Writing Unit Tests for API Endpoints
In Python, you can organize your test cases using the built in unittest module. This module provides a framework for organizing and running test cases. When writing unit tests for API endpoints, it's important to test each endpoint separately and in isolation from the rest of the application. This means that you should not rely on the state of the application or the results of other tests when writing your tests.

# Implementing the basics of TDD
For this example we are going to create a very basic API to aid in some math operations. Following the TDD approach after creating our basic Flask app, we will write our tests, before our routes. Following this approach forces us to think about what we want our code to accomplish, and set standards that code must satisfy.

# Red Phase:
Before moving forward in app.py we need to plan what it is we want our API to accomplish. (Reminder this is a very basic API and this example is really to show the flow of TDD).

# Planning:

Since we're making an API for math operations, let's start with basic addition
The endpoint should be called '/sum' and receive POST request so we can send numbers to the server.
We should keep the endpoint simple and only take in two number from the request, num1 and num2
With our plans complete let's Dive into the first step of TDD, and write a test case that will fail. (It will fail because we have not yet written the endpoint it's supposed to be testing).

# Green Phase:
Now that we have planned out our desired functionality, and written a test case to test this functionality we need to write out the functionality.

# Refactoring Phase: 
Having gone through both the Red and Green phases:

Red: Writing a test case that outlines a desired functionality.
Green: Writing the simplest solution to pass the test.

# THE THREE PHASES OF TDD:

# Red: Planning Functionality and Creating a test case that will fail, since we have not yet implemented the functionality

# Green: Providing the most basic solution to pass the test case

# Refactoring: Reanalyzing our solution to see if there is anything that can be cleaned up, made more efficient, or made more robust.

# Last step: 

Run the test_app.py


# Expected result: PASSED

OK







