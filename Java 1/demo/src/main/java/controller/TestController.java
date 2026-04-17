package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @GetMapping("/test")
    @ResponseBody
    public String test() {
        return "This uses @ResponseBody human 74666";

    }
    @GetMapping("/greeting")
    public String greeting() {
        return "greeting";
    }
}