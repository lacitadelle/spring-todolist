package com.jkomala.springboot.todolist.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();

    static {
        todos.add(new Todo(1, "jimmy", "Finish Spring Boot course",
                LocalDate.now().plusWeeks(1), false));
        todos.add(new Todo(2, "jimmy", "Learn Java",
                LocalDate.now().plusDays(2), false));
        todos.add(new Todo(3, "jimmy", "Complete project",
                LocalDate.now().plusDays(3), false));
        todos.add(new Todo(4, "jimmy", "Review code",
                LocalDate.now().plusDays(4), false));
        todos.add(new Todo(5, "jimmy", "Prepare for presentation",
                LocalDate.now().plusDays(5), false));
        todos.add(new Todo(6, "jimmy", "Present project",
                LocalDate.now().plusDays(6), false));

    }

    public List<Todo> findByUsername(String username) {
        return todos;
    }
}
