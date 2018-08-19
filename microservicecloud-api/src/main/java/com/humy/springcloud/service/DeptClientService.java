package com.humy.springcloud.service;

import com.humy.springcloud.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author humy
 * @date 2018/8/16 - 21:32
 */

//指定服务名称
@FeignClient(value = "MICROSERVICECLOUD-DEPT")
//@FeignClient(value = "MICROSERVICECLOUD-DEPT",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {
    @GetMapping(value = "/dept/get/{id}")
    Dept get(@PathVariable("id") long id);

    @GetMapping(value = "/dept/list")
    List<Dept> list();

    @PostMapping(value = "/dept/add")
    boolean add(Dept dept);
}

//@FeignClient(value = "MICROSERVICECLOUD-DEPT",fallbackFactory=DeptClientServiceFallbackFactory.class)
