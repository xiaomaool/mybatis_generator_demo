package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IndexController {

    @RequestMapping("index")
    public String index(){
        String message = "你好 世界！";
        return message;
    }

}
