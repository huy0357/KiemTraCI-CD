package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class WebController {

    @GetMapping("/")
    public String home() {
        return "index"; // Sẽ chuyen den hello.jsp
    }
    @GetMapping("/hello")
    public String hello() {
        return "hello"; // Sẽ load hello.jsp
    }


    @GetMapping("/user")
    public String user() {
        return "user"; // Trả về file user.html trong templates
    }
}