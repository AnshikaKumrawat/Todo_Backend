package com.todoList.todoList.controller;

import com.todoList.todoList.dto.TodoDTO;
import com.todoList.todoList.service.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @PostMapping
    public TodoDTO createTask(@RequestBody TodoDTO todo) {
        return todoService.createTask(todo);
    }

    @GetMapping
    public List<TodoDTO> getAllTasks() {
        return todoService.getAllTasks();
    }

    @GetMapping("/{id}")
    public TodoDTO getTaskById(@PathVariable Long id) {
        return todoService.getTaskById(id);
    }

    @PutMapping("/{id}")
    public TodoDTO updateTask(@PathVariable Long id,
                           @RequestBody TodoDTO todo) {
        return todoService.updateTask(id, todo);
    }

    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable Long id) {
        todoService.deleteTask(id);
        return "Task Deleted Successfully";
    }
}