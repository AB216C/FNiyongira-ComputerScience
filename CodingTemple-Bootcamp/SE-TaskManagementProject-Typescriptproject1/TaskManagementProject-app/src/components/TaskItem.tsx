import React from 'react';
import { Link } from 'react-router-dom';
import { useTaskContext } from '../context/TaskContext';
import type { Task } from '../types/Task';

const TaskItem: React.FC<{ task: Task }> = ({ task }) => {
  const { deleteTask } = useTaskContext();

  return (
    <div style={{ border: '2px solid white', margin: '5px', padding: '10px', fontSize:'23px' }}>
      <h3>{task.title}</h3>
      <p>{task.description}</p>
      <p>Status: {task.completed ? '✅' : '❌'}</p>
      <div>
        <Link to={`/task/${task.id}`}>View</Link> |{' '}
        <Link to={`/edit/${task.id}`}>Edit</Link> |{' '}
        <button onClick={() => deleteTask(task.id)} style={{color:'red'}}>Delete</button>
      </div>

    </div>
  );
};

export default TaskItem;