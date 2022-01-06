package com.example.demo.controller;

import com.example.demo.model.Todo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
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

    @GetMapping("/todo/{todoId}")
    public Todo getTodo(@PathVariable(name = "todoId") Integer todoId) {
        return todoList.get(todoId);
    }


}
