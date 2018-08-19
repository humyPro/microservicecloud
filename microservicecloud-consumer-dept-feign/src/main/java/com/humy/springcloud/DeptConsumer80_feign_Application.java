package com.humy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author humy
 * @date 2018/8/16 - 0:27
 */
@SpringBootApplication
@EnableEurekaClient
//开启feign客户端,指定@FeignCleint的注解的类的位置,并添加到容器中
@EnableFeignClients(basePackages = {"com.humy.springcloud"})
@ComponentScan("com.humy.springcloud")
public class DeptConsumer80_feign_Application {
    public static void main(String[] args) {
        System.out.println("feigin Start");
        SpringApplication.run(DeptConsumer80_feign_Application.class, args);
    }
}
