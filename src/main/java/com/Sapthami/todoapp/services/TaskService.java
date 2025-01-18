package com.Sapthami.todoapp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Sapthami.todoapp.model.Task;
import com.Sapthami.todoapp.repository.TaskRepository;

@Service
public class TaskService {
	
	private final TaskRepository taskRepository;
	
	public TaskService(TaskRepository taskRepository) 
	{
		this.taskRepository = taskRepository;
	}

	public List<Task> getAllTasks() 
	{
		return taskRepository.findAll();
	}

	public void createTask(String title) 
	{
		Task task = new Task();
		task.setTitle(title);
		task.setComplete(false);
		taskRepository.save(task);
	}

	public void deleteTask(Long id) 
	{
		 taskRepository.deleteById(id);
	}


	public void toggleTask(Long id) 
	{
		Task task = taskRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Ivalid tsk id"));
		task.setComplete(!task.isComplete());
		taskRepository.save(task);
	}

}
