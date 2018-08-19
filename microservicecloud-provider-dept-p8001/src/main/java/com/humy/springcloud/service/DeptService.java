package com.humy.springcloud.service;

import com.humy.springcloud.entities.Dept;

import java.util.List;

/**
 * @author humy
 * @date 2018/8/15 - 23:05
 */
public interface DeptService {
    boolean add(Dept dept);

    Dept get(Long id);

    List<Dept> list();
}
