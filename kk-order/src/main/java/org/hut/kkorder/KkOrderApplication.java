package org.hut.kkorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class KkOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(KkOrderApplication.class, args);
    }
}
