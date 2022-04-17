package com.wsl.config;/**
 * @title: AutoBeanConfig
 * @description: TODO
 * @ <p>CopyRight: CopyRight (c) 2021</p>
 * @author wsl
 * @date 2022/4/17 19:48
 * @version 1.0.0
 */

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 *  @Author Administrator
 *  @Date 2022/4/17  19:48
 *  @Description
 */
@Configuration
public class AutoBeanConfig {

    /**
     * @LoadBalanced 开启ribbion 实现负载均衡
     * @return
     */
    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
