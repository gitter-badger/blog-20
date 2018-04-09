package com.blog;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author liangpeng
 */
//启动一个服务注册中心提供给其他应用进行对话
@EnableEurekaServer
@SpringBootApplication
public class ServerApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ServerApplication.class)
                .web(true).run(args);
    }
}
