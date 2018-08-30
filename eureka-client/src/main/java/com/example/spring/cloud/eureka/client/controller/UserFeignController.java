package com.example.spring.cloud.eureka.client.controller;

import com.example.spring.cloud.eureka.client.feign.UserServerFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserFeignController {

    @Autowired
    private UserServerFeign userServerFeign;

    @GetMapping("/feign/user")
    private String getUserByFeign() {
        return userServerFeign.getUser();
    }
}
