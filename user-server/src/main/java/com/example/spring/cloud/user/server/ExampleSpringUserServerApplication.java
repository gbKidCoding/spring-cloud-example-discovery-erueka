package com.example.spring.cloud.user.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ExampleSpringUserServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExampleSpringUserServerApplication.class, args);
    }

}
