package com.spring.example.demo.web;


import com.spring.example.demo.bean.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
/**
 *@Description:TODO
 *@Author:fengguojun
 *@Date:2020/5/11 19:22
 *@Version:1.0
 */
    @Value("${my.name}")
    private String name;
    @RequestMapping("/index")
    private String index(){
        return "welcome to my page";
    }

    @RequestMapping("/miya")
    private String miya(){
        return name;
    }

}
