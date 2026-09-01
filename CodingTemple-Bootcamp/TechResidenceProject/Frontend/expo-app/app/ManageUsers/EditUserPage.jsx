import React, { useEffect, useState } from 'react';
import { View, Text, TextInput, TouchableOpacity, StyleSheet, Alert, ActivityIndicator } from 'react-native';
import { useLocalSearchParams, useRouter } from 'expo-router';
import { useTranslation } from 'react-i18next';
import api from '../../utils/api';

export default function EditUserPage() {
  const {t} = useTranslation();
  const { id } = useLocalSearchParams();
  const router = useRouter();
  const [form, setForm] = useState({ first_name: '', last_name: '', email: '' });
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    const loadUser = async () => {
      try {
        const res = await api.get(`/users/${id}`);
        setForm(res.data);
      } catch {
        Alert.alert(t('app.error'), t('app.failedLoadUser'));
      } finally {
        setLoading(false);
      }
    };
    loadUser();
  }, [id]);

  const handleUpdate = async () => {
    if (!form.first_name || !form.last_name || !form.email) {
      Alert.alert(t('app.fieldsRequired'));
      return;
    }

    try {
      await api.put(`/users/${id}`, form);
      Alert.alert(t('app.success'), t('app.successUserCreation'));
      router.back();
    } catch {
      Alert.alert(t('app.error'), t('app.updateUserFail'));
    }
  };

  if (loading) return <ActivityIndicator size="large" style={{ marginTop: 50 }} />;

  return (
    <View style={styles.container}>
      <Text style={styles.title}>{t('app.editUser')}</Text>
      <TextInput
        placeholder={t('app.firstName')}
        style={styles.input}
        value={form.first_name}
        onChangeText={(t) => setForm({ ...form, first_name: t })}
      />
      <TextInput
        placeholder={t('app.lastName')}
        style={styles.input}
        value={form.last_name}
        onChangeText={(t) => setForm({ ...form, last_name: t })}
      />
      <TextInput
        placeholder={t('app.email')}
        style={styles.input}
        keyboardType="email-address"
        value={form.email}
        onChangeText={(t) => setForm({ ...form, email: t })}
      />
      <TouchableOpacity style={styles.button} onPress={handleUpdate}>
        <Text style={styles.buttonText}>{t('app.update')}</Text>
      </TouchableOpacity>
    </View>
  );
}

const styles = StyleSheet.create({
  container: { flex: 1, padding: 20, backgroundColor: '#fff' },
  title: { fontSize: 22, fontWeight: 'bold', marginBottom: 20 },
  input: { borderWidth: 1, borderColor: '#ccc', borderRadius: 8, padding: 12, marginBottom: 15 },
  button: { backgroundColor: '#2563eb', paddingVertical: 15, borderRadius: 8, alignItems: 'center' },
  buttonText: { color: '#fff', fontWeight: 'bold', fontSize: 16 },
});