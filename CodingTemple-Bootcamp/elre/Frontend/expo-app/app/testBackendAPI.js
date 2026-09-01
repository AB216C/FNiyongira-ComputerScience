import { useState } from 'react';
import { View, Text, StyleSheet, ActivityIndicator, TouchableOpacity } from 'react-native';

import api from '../utils/api';

export default function TestBackendAPI() {
  const [status, setStatus] = useState('');
  const [loading, setLoading] = useState(false);

  const checkAPI = async () => {
    setLoading(true);
    setStatus('');

    try {
      const res = await api.get(`/healthz`);
      const data = await res.data;
      setStatus(data.status === 'ok' ? 'ok' : 'error');
    } catch (error) {
      console.error('Error fetching API health:', error);
      setStatus('error');
    } finally {
      setLoading(false);
    }
  };

  return (
    <View style={styles.container}>
      <TouchableOpacity style={styles.button} onPress={checkAPI}>
        <Text style={styles.buttonText}>Check API Status</Text>
      </TouchableOpacity>

      {loading && (
        <View style={styles.center}>
          <ActivityIndicator size="large" color="#09098f" />
          <Text>Checking server...</Text>
        </View>
      )}

      {!loading && status !== '' && (
        <Text style={[styles.status, status === 'ok' ? styles.ok : styles.error]}>
          {status === 'ok' ? '🟢 Server is running fine' : '❌ Server issue — cannot connect'}
        </Text>
      )}
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    width: '100%',
    alignItems: 'center',
    padding: 20,
  },
  button: {
    backgroundColor: '#09098f',
    padding: 15,
    borderRadius: 10,
    width: '60%',
    alignItems: 'center',
    marginBottom: 20,
  },
  buttonText: {
    color: 'white',
    fontSize: 16,
    fontWeight: '600',
  },
  status: {
    padding: 12,
    borderRadius: 8,
    marginTop: 10,
    fontSize: 16,
    textAlign: 'center',
    width: '85%',
  },
  ok: {
    backgroundColor: '#d1fae5',
    color: '#065f46',
  },
  error: {
    backgroundColor: '#fee2e2',
    color: '#991b1b',
  },
  center: {
    alignItems: 'center',
    marginTop: 10,
  },
});