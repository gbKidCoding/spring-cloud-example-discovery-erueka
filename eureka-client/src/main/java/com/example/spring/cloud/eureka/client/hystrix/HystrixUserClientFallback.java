package com.example.spring.cloud.eureka.client.hystrix;

import com.example.spring.cloud.eureka.client.feign.UserServerFeign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class HystrixUserClientFallback implements UserServerFeign {

    @Override
    public String getUser() {
        log.info("调用用户接口出现了异常");
        return "get user 1 error";
    }
}
