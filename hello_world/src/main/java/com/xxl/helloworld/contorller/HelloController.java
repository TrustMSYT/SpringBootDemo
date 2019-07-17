package com.xxl.helloworld.contorller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: Hello控制层
 * @Author:Dustin
 * @CreateDate:2019/7/17 16:19
 * @Version:1.0
 */

@RestController
@RequestMapping("")
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
}
