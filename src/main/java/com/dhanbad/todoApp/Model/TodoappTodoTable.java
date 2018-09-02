package com.dhanbad.todoApp.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@Entity
@Table(name = "todolist")
@AllArgsConstructor
@NoArgsConstructor
public class TodoappTodoTable {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "todo_name")
    private String todoName;
    @Column(name = "todo_list")
    private String itemList;
}
