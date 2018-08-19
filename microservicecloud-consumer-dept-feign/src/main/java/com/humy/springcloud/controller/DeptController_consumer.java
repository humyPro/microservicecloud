package com.humy.springcloud.controller;

import com.humy.springcloud.entities.Dept;
import com.humy.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author humy
 * @date 2018/8/15 - 23:40
 */
@RestController
public class DeptController_consumer {
    @Resource
    private DeptClientService service;

    @GetMapping("/consumer/dept/add")
    public boolean add(Dept dept){
        return this.service.add(dept);
    }

    @GetMapping("/consumer/dept/get/{id}")
    public Dept add(@PathVariable Long id){
        System.out.println(id);
        return this.service.get(id);
    }

    @GetMapping("/consumer/dept/list")
    public List list(){
        System.out.println("list方法");
        return this.service.list();
    }
}
