package com.example.exbeginner.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.form.UserForm;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
@RequestMapping({"/exam04", "/exam04/"})

public class Exam04Controller {
    
    @GetMapping({"","/"})
    public String index() {
        return "exam04";
    }

    @PostMapping({"/create","/create/"})
    public String create(UserForm form, Model model) {
        String name = form.getName();
        int age = form.getAge();
        String comment = form.getComment();
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        model.addAttribute("comment", comment);
        return "exam04-result";
    }
    
    
}
