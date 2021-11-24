package com.practice.todolist.repository;

import com.practice.todolist.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<Todo, Long>
{

}
