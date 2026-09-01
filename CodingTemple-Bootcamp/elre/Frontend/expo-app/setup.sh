#!/bin/bash

ENV_PATH="$(dirname "$0")/../.env"

if [ -f "$ENV_PATH" ]; then
  export $(grep -v '^#' "$ENV_PATH" | xargs)
  echo "Loaded .env variables from $ENV_PATH"
else
  echo "No .env file found at $ENV_PATH — using defaults."
fi

# Edit to the path of java on your computer 
export JAVA_HOME="/Library/Java/JavaVirtualMachines/openjdk-17.0.17/Contents/Home"

# Edit to the path of the android SDK on your computer
export ANDROID_HOME=$HOME/Library/Android/sdk

# Set the path to Java and Android SDK so terminal knows where to find it
export PATH=$PATH:$JAVA_HOME/bin:$ANDROID_HOME/emulator:$ANDROID_HOME/platform-tools

# Verify versions
echo "Java version:"
java -version

echo "ADB version:"
adb version

# Ensure Gradle knows the SDK path
if [ -d "android" ]; then
  echo "sdk.dir=$ANDROID_HOME" > android/local.properties
  echo "Updated android/local.properties with SDK path"

  BUILD_GRADLE_FILE="android/app/build.gradle"

  if [ -f "$BUILD_GRADLE_FILE" ]; then
    echo "Found build.gradle"
  else 
    echo "build.gradle file NOT FOUND in $BUILD_GRADLE_FILE path"
    exit 1
  fi

else
  echo "No android directory found. Run 'npx expo prebuild' first."
  exit 1
fi

echo "Environment ready. You can now run: npx expo run:android 🚀"