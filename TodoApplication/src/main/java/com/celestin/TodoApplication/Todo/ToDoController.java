package com.celestin.TodoApplication.Todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@SessionAttributes("name")
public class ToDoController {

    private ToDoService toDoService;

    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @RequestMapping(value ="list",method = RequestMethod.GET)
    public String returnList(ModelMap model) {
        List<ToDo> todos = toDoService.findByUserName("celestin");
        model.put("todos",todos);
        return "list";
    }

    @RequestMapping(value ="add-todo",method = RequestMethod.GET)
    public String addtodo() {
        return "todo";
    }

    @RequestMapping(value ="add-todo",method = RequestMethod.POST)
    public String addnewtodo() {
        return "redirect:list";
    }
}
