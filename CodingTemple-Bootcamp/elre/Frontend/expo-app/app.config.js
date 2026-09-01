import 'dotenv/config';
import path from 'path';

const envPath = path.resolve(__dirname, '../.env'); 

import 'dotenv/config.js';
import { config } from 'dotenv';
config({ path: envPath }); 

export default ({ config }) => ({
  ...config,
  extra: {
    apiUrl: process.env.EXPO_PUBLIC_API_URL,
  },
});