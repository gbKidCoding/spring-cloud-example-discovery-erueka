package com.example.spring.cloud.user.server.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
@Slf4j
public class UserController {

    @GetMapping
    private String getUser() {
        log.info("getUser ...");
        return "userId: 1";
    }
}
