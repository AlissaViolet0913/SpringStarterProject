package com.example.exbeginner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
@RequestMapping({"/exam02","/exam02/"})
public class Exam02Controller {

    @Autowired
    private HttpSession session;
    
    @GetMapping({"", "/"})
    public String index() {
        return "exam02";
    }

    @PostMapping({"/create", "/create/"})
    public String create(int numberA, int numberB) {        
        session.setAttribute("spanA", numberA);
        session.setAttribute("spanB", numberB);
        session.setAttribute("spanC", numberA + numberB);

        // redirect: postリクエスト処理を行った後に、結果を表示するためのGETリクエストを生成するときに使用する
        return "exam02-result";
    }   

    @GetMapping({"/result2", "/result2/"})
    public String result2() {
        return "exam02-result2";
    }
    
    
    
}
