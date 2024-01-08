package com.example.againproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi") // 접속할 URL 주소
    public String hi(Model model) {
        model.addAttribute("username", "seung");
        return "greetings"; // templats/greetings.mustache -> 브라우저로 전송!
    }

    @GetMapping("/bye")
    public String Next(Model model) {
        model.addAttribute("nickname","seung");
        return "bye";
    }
}
