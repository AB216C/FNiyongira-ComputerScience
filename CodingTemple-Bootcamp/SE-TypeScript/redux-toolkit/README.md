## Create React with TypeScript app & Install Redux and React-Redux Libraries:

npx create-vite@latest redux-toolkit --template react-ts
cd redux-toolkit
npm install
npm install redux react-redux @reduxjs/toolkit
npm run dev


# Handling Async Actions with Redux Thunk

Install redux-thunk for asynchronous actions:

npm install redux-thunk

# Connecting Redux with React Components:
In main.tsx wrap the app with Provider
// main.tsx
import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import App from './App.tsx'
import { Provider } from 'react-redux';
import { store } from './redux/store';

createRoot(document.getElementById('root')!).render(
  <StrictMode>
    <Provider store={store}>
      <App />
    </Provider>
  </StrictMode>,
)
🔨 Code Breakdown 🔨
This code is the main entry point for a React application that uses Redux for state management. It sets up the root of the React app and connects the Redux store to the entire component tree through the Provider component.

# Importing Statements
import { Provider } from 'react-redux';
import { store } from './redux/store';
Provider from react-redux is imported to connect the Redux store to the React component tree.
store is imported from store.ts, where the Redux store was created and configured.
Rendering the App with Redux Store Connection
createRoot(document.getElementById('root')!).render(
  <StrictMode>
    <Provider store={store}>
      <App />
    </Provider>
  </StrictMode>,
)