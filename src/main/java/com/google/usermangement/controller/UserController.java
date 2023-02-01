package com.google.usermangement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("hi")
    public String hiUser() {
        return "hello";
    }
}
