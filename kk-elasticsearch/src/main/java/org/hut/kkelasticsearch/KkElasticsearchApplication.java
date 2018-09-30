package org.hut.kkelasticsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
@EnableEurekaClient
@SpringBootApplication

public class KkElasticsearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(KkElasticsearchApplication.class, args);
    }
}
