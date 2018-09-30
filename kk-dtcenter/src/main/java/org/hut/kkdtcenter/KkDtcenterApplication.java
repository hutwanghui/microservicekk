package org.hut.kkdtcenter;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableAdminServer
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableConfigServer
public class KkDtcenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(KkDtcenterApplication.class, args);
    }
}
