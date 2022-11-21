package com.example.todolist.todolistcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TodolistController {

    private ArrayList<String> todoList = new ArrayList<>();

    @GetMapping("/list")
    public ArrayList<String> todoList() {
        return todoList;
    }

    @GetMapping("/receiveList")
    public ArrayList<String> putList(String todo) {
        if(!todoList.contains(todo))
            todoList.add(todo);
        return todoList;
    }

    @GetMapping("/deleteList")
    public ArrayList<String> deleteList(int todo) {
        todoList.remove(todo);
        return todoList;
    }
}
