package com.dhanbad.todoApp.Repository;

import com.dhanbad.todoApp.Model.TodoappTodoTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRespository extends JpaRepository<TodoappTodoTable, Long> {

}