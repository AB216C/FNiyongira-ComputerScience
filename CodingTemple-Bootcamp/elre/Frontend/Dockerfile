FROM node:22-alpine

# Use /app so we can mount the expo app directory from the host easily
WORKDIR /app

# Copy only the dependency manifests from the expo-app subfolder first
# This ensures npm install runs with the correct package.json and benefits from layer caching
COPY expo-app/package*.json ./

# Install Expo CLI globally and install dependencies
RUN npm install -g expo-cli
RUN npm install

# Copy the rest of the project files from the expo-app directory
COPY expo-app/ .

# Expose Expo ports
EXPOSE 19000 19001 19002 19006

# Ensure DevTools are reachable from all hosts
ENV EXPO_DEVTOOLS_LISTEN_ADDRESS=0.0.0.0
ENV REACT_NATIVE_PACKAGER_HOSTNAME=0.0.0.0
ENV HOME=/app

RUN mkdir -p /app/.config/ngrok && mkdir -p /app/.expo

CMD ["npx", "expo", "start", "--lan","--web","--port","19000"]