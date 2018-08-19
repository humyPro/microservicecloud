package com.humy.springcloud;

import com.humy.myrule.MyselfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author humy
 * @date 2018/8/16 - 0:27
 */
@SpringBootApplication
@EnableEurekaClient
//name属性指定服务需要被负载均衡的服务的名称，第二个属性是自定义的算法类
@RibbonClient(name = "MICROSERVICECLOUD-DEPT", configuration = MyselfRule.class)
public class DeptConsumer80_Application {
    public static void main(String[] args) {

        SpringApplication.run(DeptConsumer80_Application.class, args);
    }
}
