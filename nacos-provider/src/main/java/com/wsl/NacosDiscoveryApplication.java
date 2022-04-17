package com.wsl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author add
 * @date 2022-04-15
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosDiscoveryApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosDiscoveryApplication.class,args);
    }
}
