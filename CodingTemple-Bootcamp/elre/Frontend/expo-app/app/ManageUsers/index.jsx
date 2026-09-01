import React, { useEffect, useState, useCallback } from 'react';
import { View,Text,StyleSheet, FlatList, TouchableOpacity, ActivityIndicator, Alert,TextInput} from 'react-native';
import { useRouter, useFocusEffect } from 'expo-router';
import { Ionicons } from '@expo/vector-icons';
import { useTranslation } from 'react-i18next';
import api from '../../utils/api';

export default function ManageUsers() {
  const {t} = useTranslation();
  const [users, setUsers] = useState([]);
  const [filtered, setFiltered] = useState([]);
  const [loading, setLoading] = useState(true);
  const [search, setSearch] = useState('');
  const [sortBy, setSortBy] = useState('name-asc');
  const router = useRouter();

  const fetchUsers = async () => {
    try {
      setLoading(true);
      const res = await api.get(`/users`);
      setUsers(res.data);
      setFiltered(res.data);
    } catch (error) {
      console.error('Error fetching users:', error.message);
      Alert.alert(t('app.error'), t('app.failedFetchUser'));
    } finally {
      setLoading(false);
    }
  };

  // Auto-refresh when navigating back
  useFocusEffect(
    useCallback(() => {
      fetchUsers();
    }, [])
  );

  // Search + Sort logic
  useEffect(() => {
    let data = [...users];

    // Search filter
    if (search.trim() !== '') {
      data = data.filter(
        (u) =>
          u.first_name.toLowerCase().includes(search.toLowerCase()) ||
          u.last_name.toLowerCase().includes(search.toLowerCase()) ||
          u.email.toLowerCase().includes(search.toLowerCase())
      );
    }

    // Sorting
    data.sort((a, b) => {
      let fieldA, fieldB;
      if (sortBy.includes('name')) {
        fieldA = `${a.first_name} ${a.last_name}`.toLowerCase();
        fieldB = `${b.first_name} ${b.last_name}`.toLowerCase();
      } else {
        fieldA = a.email.toLowerCase();
        fieldB = b.email.toLowerCase();
      }

      if (fieldA < fieldB) return sortBy.endsWith('asc') ? -1 : 1;
      if (fieldA > fieldB) return sortBy.endsWith('asc') ? 1 : -1;
      return 0;
    });

    setFiltered(data);
  }, [search, sortBy, users]);

  const deleteUser = async (id) => {
    Alert.alert(
      t('app.confirmDelete'),
      t('app.confirmDeleteText'),
      [
        { text: t('app.cancel'), style: 'cancel' },
        {
          text: t('app.delete'),
          style: 'destructive',
          onPress: async () => {
            try {
              await api.delete(`/users/${id}`);
              setUsers((prev) => prev.filter((u) => u.id !== id)); // instantly remove deleted user
            } catch (error) {
              console.error('Delete error:', error.message);
              Alert.alert(t('app.error'), t('app.failedDelete'));
            }
          },
        },
      ]
    );
  };

  const renderItem = ({ item }) => (
    <View style={styles.userCard}>
      <View style={{ flex: 1 }}>
        <Text style={styles.userName}>{item.first_name} {item.last_name}</Text>
        <Text style={styles.email}>{item.email}</Text>
      </View>

      <View style={styles.actions}>
        <TouchableOpacity
          style={[styles.iconButton, { backgroundColor: '#3b82f6' }]}
          onPress={() => router.push(`/ManageUsers/UserDetailsPage?id=${item.id}`)}
        >
          <Ionicons name="eye" color="#fff" size={18} />
        </TouchableOpacity>

        <TouchableOpacity
          style={[styles.iconButton, { backgroundColor: '#f59e0b' }]}
          onPress={() => router.push(`/ManageUsers/EditUserPage?id=${item.id}`)}
        >
          <Ionicons name="create" color="#fff" size={18} />
        </TouchableOpacity>

        <TouchableOpacity
          style={[styles.iconButton, { backgroundColor: '#ef4444' }]}
          onPress={() => deleteUser(item.id)}
        >
          <Ionicons name="trash" color="#fff" size={18} />
        </TouchableOpacity>
      </View>
    </View>
  );

  return (
    <View style={styles.container}>
      {/* Top Bar */}
      <View style={styles.topBar}>
        <Text style={styles.title}>{t('app.manageUsers')}</Text>
        <TouchableOpacity
          style={styles.createButton}
          onPress={() => router.push('/ManageUsers/CreateUserPage')}
        >
          <Ionicons name="add-circle-outline" size={22} color="#fff" />
          <Text style={styles.createText}>{t('app.create')}</Text>
        </TouchableOpacity>
      </View>

      {/* Search and Sort Controls */}
      <View style={styles.searchSortContainer}>
        <View style={styles.searchBox}>
          <Ionicons name="search" size={18} color="#666" style={{ marginRight: 6 }} />
          <TextInput
            placeholder={t('app.searchUsers')}
            style={styles.searchInput}
            value={search}
            onChangeText={setSearch}
          />
        </View>

        <TouchableOpacity
          style={styles.sortButton}
          onPress={() =>
            setSortBy((prev) =>
              prev === 'name-asc'
                ? 'name-desc'
                : prev === 'name-desc'
                ? 'email-asc'
                : prev === 'email-asc'
                ? 'email-desc'
                : 'name-asc'
            )
          }
        >
          <Ionicons name="swap-vertical" size={18} color="#fff" />
          <Text style={styles.sortText}>
            {sortBy === 'name-asc'
              ? t('app.name') + ' ↑'
              : sortBy === 'name-desc'
              ? t('app.name') + ' ↓'
              : sortBy === 'email-asc'
              ? t('app.email') + ' ↑'
              : t('app.email') + ' ↓'}
          </Text>
        </TouchableOpacity>
      </View>

      {/* User List */}
      {loading ? (
        <ActivityIndicator size="large" color="#2563eb" style={{ marginTop: 40 }} />
      ) : (
        <FlatList
          data={filtered}
          keyExtractor={(item) => item.id.toString()}
          renderItem={renderItem}
          contentContainerStyle={{ paddingBottom: 100 }}
        />
      )}
    </View>
  );
}

const styles = StyleSheet.create({
  container: { flex: 1, backgroundColor: '#f9fafb', padding: 16 },
  topBar: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center',
    marginBottom: 15,
  },
  title: { fontSize: 22, fontWeight: 'bold', color: '#111' },
  createButton: {
    flexDirection: 'row',
    alignItems: 'center',
    backgroundColor: '#2563eb',
    paddingHorizontal: 12,
    paddingVertical: 8,
    borderRadius: 8,
  },
  createText: { color: '#fff', fontWeight: '600', marginLeft: 6 },
  searchSortContainer: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    marginBottom: 15,
  },
  searchBox: {
    flex: 1,
    flexDirection: 'row',
    backgroundColor: '#fff',
    alignItems: 'center',
    borderRadius: 8,
    paddingHorizontal: 10,
    marginRight: 8,
    borderWidth: 1,
    borderColor: '#ddd',
  },
  searchInput: { flex: 1, height: 40 },
  sortButton: {
    flexDirection: 'row',
    alignItems: 'center',
    backgroundColor: '#111827',
    borderRadius: 8,
    paddingHorizontal: 12,
  },
  sortText: { color: '#fff', fontWeight: '600', marginLeft: 5 },
  userCard: {
    backgroundColor: '#fff',
    borderRadius: 10,
    padding: 16,
    flexDirection: 'row',
    alignItems: 'center',
    marginBottom: 10,
    shadowColor: '#000',
    shadowOpacity: 0.05,
    shadowRadius: 6,
    shadowOffset: { width: 0, height: 3 },
  },
  userName: { fontSize: 16, fontWeight: '600', color: '#111' },
  email: { fontSize: 14, color: '#555' },
  actions: { flexDirection: 'row' },
  iconButton: {
    width: 36,
    height: 36,
    borderRadius: 8,
    justifyContent: 'center',
    alignItems: 'center',
    marginLeft: 8,
  },
});