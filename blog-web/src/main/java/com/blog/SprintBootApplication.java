package com.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author liangpeng
 */

/**
 * 该注解能激活Eureka中的DiscoveryClient实现，
 * 这样才能实现Controller中对服务信息的输出。
 */
@EnableDiscoveryClient
@SpringBootApplication
//开启Redis缓存
@EnableCaching
public class SprintBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(SprintBootApplication.class, args);
    }

    @Bean
    @LoadBalanced //支持负载均衡
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
