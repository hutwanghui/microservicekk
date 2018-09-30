package org.hut.kkeruekanode2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class KkEruekaNode2Application {

    public static void main(String[] args) {
        SpringApplication.run(KkEruekaNode2Application.class, args);
    }
}
