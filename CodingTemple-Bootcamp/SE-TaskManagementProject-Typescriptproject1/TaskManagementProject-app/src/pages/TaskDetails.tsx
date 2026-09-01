import React from 'react';
import { useParams, Link } from 'react-router-dom';
import { useTaskContext } from '../context/TaskContext';
import '../App.css'


const TaskDetails: React.FC = () => {
  const { id } = useParams<{ id: string }>();
  const { getTask } = useTaskContext();
  const task = getTask(id!);

  if (!task) return <p>Task not found</p>;

  return (
    <div className="taskdetails">
       <h2>{task.id}</h2>
      <h2>{task.title}</h2>
      <p>{task.description}</p>
      <p>Status: {task.completed ? '✅ Completed' : '❌ Not completed'}</p>
      <Link to={`/edit/${task.id}`}>Edit Task</Link>
    </div>
  );
};

export default TaskDetails;