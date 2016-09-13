package com.xiaola.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xiaola on 16/9/6.
 */
@Controller
public class HelloWorld {

    @RequestMapping("/hello")
    @ResponseBody
    public String getHelloWorld(){
        return "Hello World";
    }


}
