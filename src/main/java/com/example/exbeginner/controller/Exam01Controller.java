package com.example.exbeginner.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@Controller
@RequestMapping({"/exam01", "/exam01/"})
public class Exam01Controller {

    @GetMapping({"", "/"})
    public String index() {
        return "exam01";
    }

    @PostMapping({"/create", "/create/"})
    public String create(String name, Model model) {
        model.addAttribute("span", name);
        return "exam01-result";
    }
    
}
