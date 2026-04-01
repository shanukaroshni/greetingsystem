package com.example.greetsys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetController {

    @GetMapping("/")
    public String home() {
        return "index"; // loads index.html
    }

    @GetMapping("/greet")
    public String greet(@RequestParam String name, org.springframework.ui.Model model) {
        model.addAttribute("message", "Hello, " + name + "!");
        return "greet";
    }
}
