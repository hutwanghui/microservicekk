package org.hut.kkeurekanode1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class KkEurekaNode1Application {

    public static void main(String[] args) {
        SpringApplication.run(KkEurekaNode1Application.class, args);
    }
}
