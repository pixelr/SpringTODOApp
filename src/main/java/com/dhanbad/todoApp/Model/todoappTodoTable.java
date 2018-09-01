package com.dhanbad.todoApp.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import java.util.List;

@Entity
@Table(name = "todolist")
public class todoappTodoTable {
    @Id
    @Column(name = "user_id")
    private String userId;
    @Column(name = "todo_name")
    private String todoName;
    @Column(name = "todo_list")
    private String itemList;
}
