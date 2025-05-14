package com.example.bookstore;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String login() {
        return "index"; // Maps to src/main/resources/templates/index.html or static/index.html
    }
}
