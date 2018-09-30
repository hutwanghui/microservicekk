package org.hut.kkproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class KkProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(KkProductApplication.class, args);
    }
}
