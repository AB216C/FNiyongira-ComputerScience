# Create React with TypeScript app & Install Redux and React-Redux Libraries:

npx create-vite@latest redux-toolkit --template react-ts
cd redux-toolkit
npm install
npm install redux react-redux @reduxjs/toolkit
npm run dev

# Handling Async Actions with Redux Thunk
Install redux-thunk for asynchronous actions:
npm install redux-thunk


# CHallenge 

.
👾💻 Challenge: To-Do List App with Redux
Objective:
Build a simple to-do list app where students add, remove, and mark items as complete.

Define actions for adding and removing items.
Create reducers to manage the list state.
Use useSelector and useDispatch to interact with Redux state in the to-do component.
Steps:
Set Up Project and Dependencies:
Create a new React project or open an existing one.
Install Redux and React-Redux if not already installed:
npm install @reduxjs/toolkit react-redux
Set up a basic file structure for Redux files:
store.ts: To configure the Redux store.
actions.ts: To define actions.
todoReducer.ts: To handle the to-do list state.
Define Action Types and Actions:
In actions.ts, define action types as constants or an enum.
Create action creators for each action type.
Create the Reducer:
In todoReducer.ts, define the initial state and state type.
Define the todoReducer function to handle each action.
Set Up the Redux Store:
In store.ts, configure the store with the todoReducer
Wrap the Application with the Redux Provider
In index.tsx or your main entry file, wrap <App /> with the Redux Provider and pass the store.
Build the To-Do List Component
Create a TodoList.tsx component.
Use useSelector to read the list of todos and useDispatch to dispatch actions
Add the Component to the App
In App.tsx, import and render the TodoList component
Test the To-Do List App
Run your application to make sure everything works as expected.
Verify that you can add new items, toggle completion, and remove items, with all changes managed by Redux.
