package edu.sylymonka.cloudservice.controller;

/*
@author   silim
@project  cloud-service
@class  Controller
@version  1.0.0
@since 02.05.2025 - 10:06
*/

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping
    public String hello() {
        return "Hello from Java!";
    }
}
