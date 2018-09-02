package com.dhanbad.todoApp.Controller;

import com.dhanbad.todoApp.Model.TodoappTodoTable;
import com.dhanbad.todoApp.Repository.TodoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todoApp")
@Validated
public class TodoController {
    @Autowired
    private TodoRespository todoRepository;

    @ResponseStatus(value = HttpStatus.CREATED)
    @RequestMapping(method = RequestMethod.POST, value = "/todo")
    public void createTodo(@RequestBody TodoappTodoTable body) {
        todoRepository.save(body);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(method = RequestMethod.GET, value = "/todo")
    public TodoappTodoTable createTodo(@RequestParam(required = true, value = "id") Long id) {
        return todoRepository.findById(id).get();
    }

}
