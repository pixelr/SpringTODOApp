package com.dhanbad.todoApp.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.List;

@Entity
public class todoappTodoTable {
    @Column(name = "user_id")
    private String userId;
    @Column(name = "todo_name")
    private String todoName;
    @Column(name = "todo_list")
    private List<TodoItem> itemList;
}
