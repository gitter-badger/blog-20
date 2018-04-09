package com.blog;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author liangpeng
 */
@EnableEurekaClient
@SpringBootApplication
public class UserServerApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(UserServerApplication.class)
                .web(true).run(args);
    }
}
