package com.ls.ez.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: ls
 * @Date: 2024/7/313:18
 */
@RestController
@RequestMapping("/")
public class EasyController {

    @GetMapping("/test")
    public String test(){
        return "ok";
    }
}
