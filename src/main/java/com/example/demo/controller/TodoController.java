package com.example.demo.controller;

import com.example.demo.model.Todo;
import com.example.demo.dto.TodoDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
public class TodoController {
    private List<Todo> todoList;

    @PostConstruct
    public void generateData() {
        todoList = IntStream.range(0, 5)
                .mapToObj(i -> new Todo("Todo " + i, " Detail " + i))
                .collect(Collectors.toList());
    }

    @GetMapping("/todos/{todoId}")
    public Todo getTodo(@PathVariable(name = "todoId") Integer todoId) {
        return todoList.get(todoId);
    }


    /**
     * Cách validate:
     * - B1: Đánh dấu cột cần validate
     * - B2: @Valid
     * - B3: Xử lý exception
     */
    @PostMapping("/todos")
    @ResponseStatus(HttpStatus.CREATED)
    public TodoDTO createTodo(@RequestBody @Valid TodoDTO todo) {
//        todoList.add(new Todo(todo.getTitle(), todo.getDetail()));
        return todo;
    }
}
