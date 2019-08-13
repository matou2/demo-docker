package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author teng.wang1.o
 * @date 2019/7/22
 * @Description
 */
@RestController
public class DemoController {

    @RequestMapping("/")
    public String hellwold(){
        return "Hello Docker World";
    }
}
