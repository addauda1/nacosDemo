package com.wsl.controller;/**
 * @title: NacosController
 * @description: TODO
 * @ <p>CopyRight: CopyRight (c) 2021</p>
 * @author wsl
 * @date 2022/4/17 19:51
 * @version 1.0.0
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *  @Author Administrator
 *  @Date 2022/4/17  19:51
 *  @Description
 */
@RestController
@RequestMapping("/nacos")
public class NacosController {

    @Autowired
    private RestTemplate restTemplate;

    // 微服务的访问名称
    @Value("${service-url.nacos-provider}")
    private String serviceUrl;

    @GetMapping("/get/{id}")
    public ResponseEntity<String> test(@PathVariable("id") Integer id) {
       return restTemplate.getForEntity(serviceUrl + "/nacos/test/" + id,String.class);
    }
}
