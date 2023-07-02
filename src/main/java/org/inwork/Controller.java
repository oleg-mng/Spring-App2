package org.inwork;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller

public class Controller {

    @GetMapping("/hello")
    public String sayWord() {
        return "hello for you";
    }
}
