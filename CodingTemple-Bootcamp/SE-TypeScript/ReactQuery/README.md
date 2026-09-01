

# Install React Query:

npm install axios

npx create-vite@latest ReactQuery --template react-ts

npm install @tanstack/react-query

# Getting Started with React Query
On main.tsx, wrap the app with QueryClientProvider to manage queries globally.
// src/main.tsx

import React from 'react';
import ReactDOM from 'react-dom';
import { QueryClient, QueryClientProvider } from '@tanstack/react-query';
import App from './App';

const queryClient = new QueryClient();

ReactDOM.render(
  <QueryClientProvider client={queryClient}>
    <App />
  </QueryClientProvider>,
  document.getElementById('root')
);


# DOCUMENTATIONS
https://tanstack.com/query/latest/docs/framework/react/overview

https://www.youtube.com/watch?v=r8Dg0KVnfMA&t=67s
