import React, { useEffect, useState } from 'react';
import { View, Text, StyleSheet, ActivityIndicator, TouchableOpacity, Alert } from 'react-native';
import { useLocalSearchParams, useRouter } from 'expo-router';

import { useTranslation } from 'react-i18next';
import api from '../../utils/api';

export default function UserDetailsPage() {
  const {t} = useTranslation();
  const { id } = useLocalSearchParams();
  const [user, setUser] = useState(null);
  const router = useRouter();

  useEffect(() => {
    const fetchUser = async () => {
      try {
        const res = await api.get(`/users/${id}`);
        setUser(res.data);
      } catch {
        Alert.alert(t('app.error'), t('app.failedLoadUser'));
      }
    };
    fetchUser();
  }, [id]);

  if (!user) return <ActivityIndicator size="large" style={{ marginTop: 50 }} />;

  return (
    <View style={styles.container}>
      <Text style={styles.title}>{t('app.userDetails')}</Text>
      <Text style={styles.detail}>{t('app.ID')}: {user.id}</Text> 
      <Text style={styles.detail}>{t('app.name')}: {user.first_name} {user.last_name}</Text>
      <Text style={styles.detail}>{t('app.email')}: {user.email}</Text>

      <TouchableOpacity style={styles.button} onPress={() => router.back()}>
        <Text style={styles.buttonText}>{t('app.back')}</Text>
      </TouchableOpacity>
    </View>
  );
}

const styles = StyleSheet.create({
  container: { flex: 1, padding: 20, backgroundColor: '#fff' },
  title: { fontSize: 22, fontWeight: 'bold', marginBottom: 20 },
  detail: { fontSize: 18, marginBottom: 10 },
  button: { backgroundColor: '#2563eb', paddingVertical: 15, borderRadius: 8, alignItems: 'center', marginTop: 20 },
  buttonText: { color: '#fff', fontWeight: 'bold', fontSize: 16 },
});