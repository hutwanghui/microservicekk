package org.hut.kkuser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@MapperScan(basePackages = "org.hut.kkuser.dao")
@EnableCaching
public class KkUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(KkUserApplication.class, args);
    }
}
