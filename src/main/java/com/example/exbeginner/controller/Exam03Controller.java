package com.example.exbeginner.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping({"/exam03", "/exam03/"})
public class Exam03Controller {

    @Autowired
    private HttpSession application;

    @GetMapping({"","/"})
    public String index() {
        return "exam03";
    }

    @PostMapping({"/create","/create/"})
    public String create(int merchandise1, int merchandise2, int merchandise3) {
        application.setAttribute("price", merchandise1 + merchandise2 + merchandise3);
        int all = (int) ((merchandise1 + merchandise2 + merchandise3)*1.1);
        BigDecimal db = new BigDecimal(all);
        application.setAttribute("containTax", db);

        System.out.println(db);

        return "exam03-result";
    }
    
    
    
}
