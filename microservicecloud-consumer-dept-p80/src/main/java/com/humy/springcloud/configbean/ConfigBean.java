package com.humy.springcloud.configbean;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author humy
 * @date 2018/8/15 - 23:33
 */
//替代ApplicationContext.xml
@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced  //使RestTemplate对象实现负载均衡
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    //选择随机算法，添加这个bean后，就会替换掉默认的轮询
//    @Bean
//    public IRule iRule(){
//        //return new RandomRule();
//        return new RetryRule();
//    }
}
