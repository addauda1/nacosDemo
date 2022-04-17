package com.wsl;/**
 * @title: NacosDiscoveryConsumerApplication
 * @description: TODO
 * @ <p>CopyRight: CopyRight (c) 2021</p>
 * @author wsl
 * @date 2022/4/17 19:43
 * @version 1.0.0
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *  @Author Administrator
 *  @Date 2022/4/17  19:43
 *  @Description
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosDiscoveryConsumerApplication {
    public static void main(String args[]) {
        SpringApplication.run(NacosDiscoveryConsumerApplication.class,args);
    }
}
