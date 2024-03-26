package ru.sber.edu.yetanotherchat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.reactive.result.view.Rendering;
import reactor.core.publisher.Mono;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/a")
    public String index() {
        return "a";
    }
}
