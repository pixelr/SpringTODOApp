package com.dhanbad.todoApp.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Todo {
    private String todoId;
    private String todoName;
    private String itemList;
}
