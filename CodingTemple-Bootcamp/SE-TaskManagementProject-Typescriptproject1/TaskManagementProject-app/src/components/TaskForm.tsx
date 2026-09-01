import React, { useState, useEffect } from 'react';
import type { Task } from '../types/Task';
import '../App.css'

interface Props {
  initialData?: Task;
  onSubmit: (task: Omit<Task, 'id'> | Task) => void;
}

const TaskForm: React.FC<Props> = ({ initialData, onSubmit }) => {
  const [title, setTitle] = useState('');
  const [description, setDescription] = useState('');
  const [completed, setCompleted] = useState(false);
 

  useEffect(() => {
    if (initialData) {
      setTitle(initialData.title);
      setDescription(initialData.description);
      setCompleted(initialData.completed);
    }
  }, [initialData]);

  const handleSubmit = (e: React.FormEvent) => {
    e.preventDefault();
    if (title.trim() === '') return;
    onSubmit({ ...initialData, title, description, completed } as any);
  };

  return (
    <form onSubmit={handleSubmit} className="FormData" >
      <input
        placeholder="Task Title"
        value={title}
        onChange={e => setTitle(e.target.value)}
        required
      />
      <textarea
        placeholder="Description"
        value={description}
        onChange={e => setDescription(e.target.value)}
      />
      <label>
        <input
          type="checkbox"
          checked={completed}
          onChange={e => setCompleted(e.target.checked)}
        />
        Completed
      </label>
      <button type="submit">Save</button>
    </form>
  );
};

export default TaskForm;
