import React from 'react';
import { useNavigate, useParams } from 'react-router-dom';
import TaskForm from '../components/TaskForm';
import { useTaskContext } from '../context/TaskContext';
import type { Task } from '../types/Task';

const TaskFormPage: React.FC = () => {
  const { id } = useParams<{ id?: string }>();
  const { addTask, updateTask, getTask } = useTaskContext();
  const navigate = useNavigate();

  const isEdit = Boolean(id);
  const task = isEdit ? getTask(id!) : undefined;

  const handleSubmit = (taskData: Omit<Task, 'id'> | Task) => {
    if (isEdit) {
      updateTask(taskData as Task);
    } else {
      addTask(taskData as Omit<Task, 'id'>);
    }
    navigate('/dashboard');
  };

  return (
    <div>
      <h2>{isEdit ? 'Edit Task' : 'Create Task'}</h2>
      <TaskForm initialData={task} onSubmit={handleSubmit} />
    </div>
  );
};

export default TaskFormPage;