package com.humy.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author humy
 * @date 2018/8/16 - 19:08
 */
@Configuration
public class MyselfRule {
    @Bean
    public IRule MyRule(){
        return new RandomRule_Custom();
    }
}
