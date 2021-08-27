package com.webflux.reactiverestservice.controllers;

import com.webflux.reactiverestservice.contract.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;


@RestController
public class GreetingController {

    @GetMapping(value = "hello")
    Mono<Greeting> hello() {
        return Mono.just(new Greeting("Hello, Reactive Rest!"));
    }
}
