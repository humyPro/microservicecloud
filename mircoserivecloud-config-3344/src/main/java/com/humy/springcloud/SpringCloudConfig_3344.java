package com.humy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author humy
 * @date 2018/8/19 - 12:31
 */
@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfig_3344 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfig_3344.class, args);
    }
}
