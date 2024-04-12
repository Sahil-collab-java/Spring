package com.WelcomeAPi.Feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "GREET-API")
public interface GreetFiengClient {

    @GetMapping("/greet")
    public String invokeThegreetApi();
}
