package com.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("test")
@Slf4j
public class TestController {

    @GetMapping("/message")
    public Mono<String> testMessage(){
        log.info("Response received and sent");
        return Mono.just("Hi from test api");
    }
}
