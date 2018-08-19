package com.humy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author humy
 * @date 2018/8/16 - 10:22
 */
@SpringBootApplication
@EnableEurekaServer//EurekaServer服务端启动类，接收其他微服务注册进来
public class EurekaServer7003_Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7003_Application.class, args);
    }
}
