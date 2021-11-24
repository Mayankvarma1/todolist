package com.practice.todolist.controller;


import com.practice.todolist.model.Todo;
import com.practice.todolist.repository.TodoRepo;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/todo")
public class TodoController {

    @Autowired
    private TodoRepo todoRepo;
    @GetMapping
    public List<Todo> findAll()
    {
        return todoRepo.findAll();
    }
    @PostMapping
    public Todo save(@RequestBody Todo todo)
    {
       return todoRepo.save(todo);
    }
    @PutMapping
    public Todo update(@RequestBody Todo todo )
    {return todoRepo.save(todo);}
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id)
    {
        todoRepo.deleteById(id);
    }

}

