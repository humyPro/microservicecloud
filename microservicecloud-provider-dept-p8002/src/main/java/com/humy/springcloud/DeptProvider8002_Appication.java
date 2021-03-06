package com.humy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author humy
 * @date 2018/8/15 - 23:16
 */
@SpringBootApplication
//本服务启动后会自动注册到eruka服务中
@EnableEurekaClient
@EnableDiscoveryClient//服务发现注解
public class DeptProvider8002_Appication {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8002_Appication.class,args);
    }
}
