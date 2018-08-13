package com.dhanbad.todoApp.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TodoItem {
    private String content;
    private Boolean enabled;
}
