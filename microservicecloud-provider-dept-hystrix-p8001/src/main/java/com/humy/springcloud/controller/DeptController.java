package com.humy.springcloud.controller;

import com.humy.springcloud.entities.Dept;
import com.humy.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author humy
 * @date 2018/8/15 - 23:09
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService service;

    //@Autowired
    @Resource
    private DiscoveryClient client;

    @PostMapping(value = "/dept/add")
    public boolean add(@RequestBody Dept dept) {
        return service.add(dept);
    }

  //  @HystrixCommand(fallbackMethod = "processHystrix_get")
    @GetMapping(value = "/dept/get/{id}")
    public Dept get(@PathVariable Long id) {

        Dept dept = service.get(id);
        if(null == dept){
            //人为抛出异常
            throw new RuntimeException("没有这个ID");
        }
        return dept;
    }
    @GetMapping(value = "/dept/list")
    public List<Dept> list() {
        return service.list();
    }

    //一但上面的方法出现异常，就执行这个方法
//    public Dept processHystrix_get(@PathVariable Long id) {
//        return new Dept().setDeptno(id).setDname("访问失败，调用Hystrix熔断机制");
//    }
}
