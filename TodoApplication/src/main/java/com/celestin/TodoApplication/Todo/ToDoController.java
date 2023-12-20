package com.celestin.TodoApplication.Todo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.BindingResult;

import java.time.LocalDate;
import java.util.List;

//@Controller
@SessionAttributes("name")
public class ToDoController {

    private ToDoService todoService;

    public ToDoController(ToDoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping(value ="list",method = RequestMethod.GET)
    public String returnList(ModelMap model) {
        String name =(String) model.get("name");
        List<Todo> todos = todoService.findByUserName(name);
        model.put("todos",todos);
        return "list";
    }

    @RequestMapping(value ="add-todo",method = RequestMethod.GET)
    public String addtodo(ModelMap model) {
        String name =(String) model.get("name");
        Todo todo = new Todo(0, name, "", LocalDate.now().plusYears(1), false);
        model.put("todo", todo);
        return "todo";
    }

    @RequestMapping(value ="add-todo",method = RequestMethod.POST)
    public String addnewtodo(ModelMap model, @Valid @ModelAttribute("todo") Todo todo, BindingResult result) {
        if(result.hasErrors()) {
            return "todo";
        }
        String name =(String) model.get("name");
        todoService.addTodo(name,todo.getDescription(), LocalDate.now().plusYears(1),false);
        return "redirect:list";
    }

    @RequestMapping(value ="delete-todo",method = RequestMethod.GET)
    public String deleteToDo(@RequestParam int id) {
        todoService.deleteById(id);
        return "redirect:list";
    }
}
