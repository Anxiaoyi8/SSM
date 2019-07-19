package com.qf.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {

    @PutMapping("/update")
    public String update(String name,Integer age){

        System.out.println("哈哈哈哈啊哈哈");
        System.out.println("额呵呵喝喝喝好");

        return null;
    }

}
