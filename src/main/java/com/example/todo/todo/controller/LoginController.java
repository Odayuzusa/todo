package com.example.todo.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    // ログイン画面をルーティング
    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
