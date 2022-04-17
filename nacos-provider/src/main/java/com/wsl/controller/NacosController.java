package com.wsl.controller;

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

    @GetMapping("/test/{id}")
    public String test(@PathVariable("id") Integer id){
        return "hello:" + id;

    }
}
