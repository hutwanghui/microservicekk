package org.hut.kkorder.router;

import org.hut.kkorder.entity.Message;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import java.util.Arrays;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

/**
 * Created by hutwanghui on 2018/9/19.
 * email:zjjhwanhui@163.com
 * qq:472860892
 * 和Controller类似的另一种API
 */
@Configuration
public class GlobalRouoterCongfig {
    @Bean
    public RouterFunction<ServerResponse> routes() {
        return route(GET("/"), (ServerRequest req) -> ok()
                .body(
                        BodyInserters.fromObject(
                                Arrays.asList(
                                        Message.builder().msg("hello Spring 5").build(),
                                        Message.builder().msg("hello Spring Boot 2").build()
                                )
                        )
                )
        );
    }
}
