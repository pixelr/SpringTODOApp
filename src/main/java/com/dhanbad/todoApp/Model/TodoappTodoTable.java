package com.dhanbad.todoApp.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@Entity
@Table(name = "todolist")
@AllArgsConstructor
@NoArgsConstructor
public class TodoappTodoTable {
    @Id
    @Column(name = "todo_id")
    private String todoId;
    @Column(name = "todo_name")
    private String todoName;
    @Column(name = "todo_list")
    private String itemList;
}
