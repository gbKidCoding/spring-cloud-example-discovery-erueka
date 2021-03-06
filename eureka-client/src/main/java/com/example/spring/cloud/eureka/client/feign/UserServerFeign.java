package com.example.spring.cloud.eureka.client.feign;

import com.example.spring.cloud.eureka.client.hystrix.HystrixUserClientFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "user-server", fallback = HystrixUserClientFallback.class)
public interface UserServerFeign {

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    String getUser();
}
