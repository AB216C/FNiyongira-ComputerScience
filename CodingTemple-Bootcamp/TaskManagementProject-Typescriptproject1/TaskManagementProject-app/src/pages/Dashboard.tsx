import React from 'react';
import { Link } from 'react-router-dom';
import TaskList from '../components/TaskList';
import { useAuth0 } from '@auth0/auth0-react';
import styles from './Dashboard.module.css'

const Dashboard: React.FC = () => {
    const { isAuthenticated, user } = useAuth0();
    console.log("Auth status:", isAuthenticated, user);

  return (
    <div className={styles.container} >
      <h1 className={styles.title} >Task Dashboard</h1>
      <Link to="/create"  className={styles.createTask}> (+) Create New Task</Link>
      <TaskList />
    </div>
  );
};

export default Dashboard;