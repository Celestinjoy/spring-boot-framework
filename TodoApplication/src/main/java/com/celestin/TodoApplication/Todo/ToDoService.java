package com.celestin.TodoApplication.Todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class ToDoService {
    private static List<Todo> todos = new ArrayList<>();
    private static int todoCount = 3;

    static {
        todos.add(new Todo(1, "celestin", "study azure", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(2, "celestin", "study AWS", LocalDate.now().plusYears(2), false));
        todos.add(new Todo(3, "celestin", "study GCP", LocalDate.now().plusYears(3), false));
    }

    public List<Todo> findByUserName(String username) {
        Predicate<? super Todo> predicate = todo -> todo.getUsername().equalsIgnoreCase(username);
        return todos.stream().filter(predicate).toList();
    }

    public void addTodo(String username, String description, LocalDate targetdate, boolean done) {
        todoCount += 1;
        todos.add(new Todo(todoCount, username, description, targetdate, done));
    }

    public void deleteById(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);
    }
}
