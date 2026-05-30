package com.todoList.todoList.repository;
import com.todoList.todoList.dto.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<TodoDTO, Long> {

}
