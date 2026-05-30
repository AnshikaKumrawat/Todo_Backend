package com.todoList.todoList.service;
import com.todoList.todoList.repository.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todoList.todoList.dto.*;


@Service
public class TodoService {

    @Autowired
    private TodoRepo todoRepository;

    public TodoDTO createTask(TodoDTO todo) {
        return todoRepository.save(todo);
    }

    public List<TodoDTO> getAllTasks() {
        return todoRepository.findAll();
    }

    public TodoDTO getTaskById(Long id) {

        TodoDTO todo = todoRepository.findById(id).get();

        return todo;
    }

    public TodoDTO updateTask(Long id, TodoDTO todo) {

    	TodoDTO existing = getTaskById(id);

        existing.setTitle(todo.getTitle());
        existing.setDescription(todo.getDescription());
        existing.setCompleted(todo.getCompleted());

        return todoRepository.save(existing);
    }

    public void deleteTask(Long id) {

    	TodoDTO todo = getTaskById(id);

        todoRepository.delete(todo);
    }
}