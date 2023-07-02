package org.inwork;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller

public class Controller {

    @GetMapping("/acquaintance")
    public String sayWord() {
        return "acquaintance";
    }
}
