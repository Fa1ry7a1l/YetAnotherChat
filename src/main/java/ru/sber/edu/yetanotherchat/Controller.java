package ru.sber.edu.yetanotherchat;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/a")
    public String a()
    {
        return "a.html";
    }
}
