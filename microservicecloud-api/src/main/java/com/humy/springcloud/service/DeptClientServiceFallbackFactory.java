package com.humy.springcloud.service;

import com.humy.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author humy
 * @date 2018/8/17 - 22:31
 */
@Component//一定要添加
//当<DeptClientService>这个泛型中的方法访问异常的时候，执行下面重写的方法
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept get(long id) {
                //处理这一个方法，其他的类似
                return new Dept().setDeptno(id).setDname("访问失败，服务降级，此服务已关闭");
            }

            @Override
            public List<Dept> list() {
                return null;
            }

            @Override
            public boolean add(Dept dept) {
                return false;
            }
        };
    }
}
