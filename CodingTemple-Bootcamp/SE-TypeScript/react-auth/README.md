
## JWT in React with TypeScript
Create a new React project with Vite

NOTE: If it prompts you to install create-vite just enter "y" to proceed

npx create-vite@latest authentication --template react-ts
cd authentication
npm install
npm install axios
npm run dev


# Building Authentication Flows with Auth0

Auth0 is a flexible, drop-in solution to add authentication and authorization services to your applications. It provides a universal authentication & authorization platform for web, mobile, and legacy applications.

In the context of a React application, Auth0 allows you to quickly integrate authentication and authorization features into your app. It supports various identity providers such as Google, Facebook, Microsoft, and more, as well as different types of identities like username/password, social, and enterprise.

💡 You can find more information about Auth0 here.

Resource: https://auth0.com/docs

# Setting up Auth0 
Let’s set up our Auth0 environment so that we can add some easy authentication for our React Application:

# You will need to create an account and a project on the Auth0 website: https://auth0.com/ 

Use your GitHub account to create an Auth0 account
Select you will be the one coding
Select you don't need to chat with anyone or do the advanced settings
Once you're logged into Auth0 

# Click on the blue create application button
Give it a name of ReactAuth0
Choose single page web applications
Make sure under the Connections tab thatgoogle-oauth2is checked

# Go to the settings tab
Look for "Allowed Callback URLs" 
Enter http://localhost:5173/callback inside 
# Save the application
Callback URLs are endpoints where Auth0 redirects users after they log in.  We will be making this later.
CHECK: Make sure the port number and protocol (http/https) match up with your React server 
Stay on the settings tab
Look for "Allowed Logout URLs" 
Enter http://localhost:5173 inside 
# Save the application
Logout URLs are endpoints where Auth0 redirects users after they log out.  We will be sending the user back to the home page
CHECK: Make sure the port number and protocol (http/https) match up with your React server 
Keep this page open, we will be referring to it later


# Now let's create our React app and call it react-auth and install all the dependencies for Auth0 bootstrap and react-router-dom

npx create-vite@latest react-auth --template react-ts
cd react-auth
npm install
npm i @auth0/auth0-react
npm install react-bootstrap
npm install react-router-dom
npm run dev


Resource: https://developer.auth0.com/resources/guides/spa/react/basic-authentication


# Lastly, inside of main.tsx, let's wrap everything together so we have routing and authentication

//index.tsx
import ReactDOM from "react-dom/client";
import "./index.css";
import App from "./App";
import { BrowserRouter } from "react-router-dom";
import Auth0ProviderWithNavigate from "./Auth0Provider";

const root = ReactDOM.createRoot(
  document.getElementById("root") as HTMLElement
);
root.render(
  <BrowserRouter>
  <Auth0ProviderWithNavigate>
    <App />
  </Auth0ProviderWithNavigate>
</BrowserRouter>
);

# 1. Imports:

import ReactDOM from "react-dom/client";
import "./index.css";
import App from "./App";
import { BrowserRouter } from "react-router-dom";
import Auth0ProviderWithNavigate from "./Auth0Provider";

# ReactDOM: This is used to render the root React component to the DOM. Specifically, createRoot is part of React 18's new rendering API that improves rendering performance by supporting concurrent rendering.

# "./index.css": This imports the global CSS file for styling the entire app. It applies styles to all components unless overridden by more specific styles.

App: This is the main component that contains the primary structure and logic of the application.
BrowserRouter from react-router-dom: This is used to enable routing in the app. It wraps the entire app and makes sure that the app can respond to URL changes and handle navigation correctly.
Auth0ProviderWithNavigate: This is a custom component that wraps the app and configures the authentication provider (Auth0 in this case). It allows the app to access authentication-related features such as login, logout, and user session management.

# 2. Creating Root Element:

const root = ReactDOM.createRoot(
  document.getElementById("root") as HTMLElement
);
createRoot: This method is used to create a root DOM node where the React app will be attached. In React 18, this is the recommended way to initialize the root rendering node for concurrent rendering.
document.getElementById("root"): This targets the div element with the id root in the index.html file. This element is where the React app will be injected.

# 3. Rendering the App:

root.render(
  <BrowserRouter>
    <Auth0ProviderWithNavigate>
      <App />
    </Auth0ProviderWithNavigate>
  </BrowserRouter>
);
# <BrowserRouter>: This is the router component provided by react-router-dom. It keeps the UI in sync with the URL in the browser’s address bar. All routing logic in the app will be handled inside this router.

The BrowserRouter ensures that when the user navigates to different URLs, the corresponding components are displayed without a page reload (single-page application behavior).
# <Auth0ProviderWithNavigate>: This component is a wrapper that provides authentication features (via Auth0) to the entire app.
It manages the authentication state and user session. It ensures that the app can handle redirects and login processes.

The Auth0ProviderWithNavigate component is where you typically configure the domain, client ID, redirect URI, and other Auth0-specific settings.
<App />: The main application component is rendered inside the Auth0ProviderWithNavigate. It contains the routes and logic for the app.