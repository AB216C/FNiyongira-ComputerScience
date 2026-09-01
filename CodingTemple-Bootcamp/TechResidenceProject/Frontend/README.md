# Before running app, check the following:
1. Backend/app/core/security.py line 31 reads `REDIRECT_URI = "com.elre.expoapp:///"`
2. Frontend/.env file: set the Backend API url (See Frontend/.env.example for help):
    - ios emulator: http://localhost:5500/v1
    - Android emulator, change api to: http://10.0.2.2:5500/v1

# Mac commands to run app on emulator

## Android Emulator
1. Pull latest code
2. Ensure Android studio and SDK is downloaded
    - Android SDK Platform
    - Android SDK Build-Tools
    - Android SDK Platform-Tools (adb)
3. Open AVD Manager in Android Studio, create a virtual device, and run it
4. Check for these packages (if not found, install them):
    - `node -v`
    - `npm -v`
    - `expo --version`
    - `java -version`
    - `adb devices`
5. run `docker compose up --build -d`
    - `-d` runs docker in the background so you can use the same terminal to run the next steps or you can open a new terminal
6. Change to app directory: `cd elre/Frontend/expo-app`
7. Run `npm install` locally
8. Run `npx expo prebuild` (if not done previously)
9. Run `npm run setup:android` (runs the Frontend/expo-app/setup.sh script which is specific for macs but may work on Windows WSL or Git Bash)
10. Run `npm run android`
    - Should redirect you to the emulator and open the app

## ios emulator on Mac:
1. Download XCode and agree to terms. In "Settings" -> "Components" -> "Platform Support" -> Download iOS.
2. Open Simulator or `open -a Simulator`
3. There may not be a screen that pops up. Go to the menu bar at the top, File -> Open Simulator -> choose one to start up the simulator
4. Make sure docker is started. Make sure Backend is running (Frontend may also be run on Docker for live updates).
5. Go to this app directory: `cd elre/Frontend/expo-app`
6. Run `npm install` locally
7. Run `npx expo prebuild` (if not done previously)
8. Run `npm run ios`

To stop the docker containers, `docker compose down -v`


# Files
- /Frontend/expo-app
    - app.config.js
        - Setup access to .env variables
    - setup.sh
        - script to setup the environment for android emulator. Script may only work for Mac, it hasn't been tested on windows yet.
    - /assets
        - images for Turkish and USA flag
    - /components
        - JournalEntries.jsx and JournalEntryComponent.jsx
            - Used for loading the Journal dashboard page
        - LanguageButton.jsx
            - Button to change the app from English to Turkish. Uses i18n to store text in different languages (see /i18n folder).
        - Spacer.jsx
            - Component to make vertical spacing between elements on the page
        - ThemedText.jsx and ThemedView.jsx
            - Replaces Text and View elements to automatically switch the app between light and dark colors depending on phone settings (you can change the mode for testing in /expo-app/app.json `userInterfaceStyle": "light"`)
        - /auth
            - GuestOnly.jsx
                - Wrap this around pages that should only be accessed by guests
            - UserOnly.jsx
                - Wrap this around pages that should only be accessed by users that are logged in
    - /constants
        - Colors.js
            - Stores colors used for the light and dark themed texts and views
    - /contexts
        - UserContext.jsx
            - Manages user state and defines functions for login authentication (calls backend api)
            - Components in /app will use the useUser hook (defined in /hooks/useUser.js) to determine if user is logged in or access user data
    - /hooks
        - useUser.js
            - Defines hook to access the user variable defined in UserContext.jsx
    - /i18n
        - /locales
            - en.json and tr.json
                - Stores app text in different languages
        - index.js
            - sets up i18n for use. changeAppLanguage function is defined here for language change when the language button is toggled
    - /utils
        - api.js
            - Set up axios with baseURL and authentication token header
    - /app
        - index.jsx
            - App entry and app redirects to this page (com.elre.expoapp:///)
            - Loads /(auth)/LoginButton.jsx when no user is logged in
        - _layout.jsx
            - layout of the app: wrapped in UserOnly component, marks where Toast messages (like Entry saved) and the language button is displayed
        - /(auth)
            - LoginButton.jsx
                - Main login page with login button and button to use magic link instead
            - MagicLinkCreateUser.jsx
                - Login page using magic link
            - _layout.jsx
                - Login pages are wrapped with GuestOnly component
        - /dashboard
            - /(modal)
                - VoiceInput.jsx and TextInput.jsx
                    - Modals that get shown when the respective button is clicked
            - Insights.jsx
                - For graphs, charts, data analysis
            - Journal.jsx
                - Record of health entries
            - NewEntry.jsx
                - Main landing page. Displays welcome message and buttons for voice and text input
            - Profile.jsx
                - Profile page to display user info and logout button. Manager User button is here too for allowed admin users
        - /ManagerUsers
            - Manage user pages
        - CompleteProfile.jsx
            - Not used in the app so far, but it was going to be used to ask the user to complete their profile upon user registration
        - mockAPI.jsx, MockApiStyles.js, testBackendAPI.js, testBackendAPIStyles.js
            - used for testing backend connection

# Next Steps
- Get user created in db
    - Currently, frontend calls /auth/login api route to login, then calls /auth/token api route to exchange for access token. Backend is supposed to create a user if not created already.
        - Not implemented yet: Frontend determines if user has first and last name. If not, show CompleteProfile page to ask user to completed their user registration with first and last name. Then, update Profile.jsx and user variable in UserContext with user data from db (get user by auth0_id)
- Delete User doesn't delete user from db currently
- User inputs are directly stored in db and displayed in the Journal
    - Implement ICD to analyze input for medical terms and save medical term summary in db instead of the exact input text

