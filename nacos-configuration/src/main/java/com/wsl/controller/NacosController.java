package com.wsl.controller;

import com.wsl.domain.DynamicConfigEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wsl
 * @date 2022/4/15 16:50
 * @description
 */
@RestController
@RequestMapping("/nacos")
public class NacosController {

    @Autowired
    private DynamicConfigEntity entity;

    @GetMapping("/test/{id}")
    public String test(@PathVariable("id") Integer id){
        System.out.printf(entity.toString());
        return "hello:" + id + ":::" +entity.getVersion();

    }
}
