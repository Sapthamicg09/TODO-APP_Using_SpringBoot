package com.Sapthami.todoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Sapthami.todoapp.model.Task;

public interface TaskRepository extends JpaRepository<Task , Long> 
{

}
