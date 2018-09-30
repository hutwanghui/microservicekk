package org.hut.kkorder.controller;

import org.hut.kkorder.entity.Message;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by hutwanghui on 2018/9/17.
 * email:zjjhwanhui@163.com
 * qq:472860892
 */
@RestController
@RequestMapping(value = "/spring5/v1")
public class Spring5HelloController {

    @GetMapping("/world")
    public Mono<String> hello() {
        return Mono.just("Welcome to reactive world ~");     // 【改】使用Mono.just生成响应式数据

    }

    @GetMapping("/getMessage")
    public Flux<Message> getMessage() {
        return Flux.just(
                Message.builder().msg("Hello Flux").sendTime(LocalDateTime.now()).build(),
                Message.builder().msg("Hello Spring boot 2 ").sendTime(LocalDateTime.now()).build()
        );
    }

    @GetMapping("/err")
    public Mono<String> response() {
        return Mono.error(new RuntimeException("error"));
    }

}
