package com.example.spring.cloud.hysitrix.dashboard;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class ExampleSpringCloudDashboardApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ExampleSpringCloudDashboardApplication.class).web(true).run(args);
    }
}
