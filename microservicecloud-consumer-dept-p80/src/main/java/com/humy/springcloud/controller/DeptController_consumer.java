package com.humy.springcloud.controller;

import com.humy.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author humy
 * @date 2018/8/15 - 23:40
 */
@RestController
public class DeptController_consumer {
   // public static final String REST_URL_PREFIX = "http://localhost:8001";
    public static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT";

    @Autowired
    private RestTemplate restTemplate;

    //@PostMapping("/consumer/dept/add")
    @GetMapping("/consumer/dept/add")
    public boolean add(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add", dept, Boolean.class);


    }

    @GetMapping("/consumer/dept/{id}")
    public Dept add(@PathVariable Long id){
        System.out.println(id);
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id, Dept.class);

    }

    @GetMapping("/consumer/dept/list")
    public List list(){
        System.out.println("线程号："+Thread.currentThread().getName());
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list", List.class);

    }

    //测试8001上的@EnableDiscoveryClient，消费端可以调用服务发现
    @GetMapping("/consumer/dept/discovery")
    public Object discovert(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/discovery", Object.class);
    }



}
