package com.jk.controller;

import com.jk.rabbit.hello.HelloSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Lenovo on 2017/11/17.
 */
@RestController
public class TestController {

    @Autowired
    private HelloSender helloSender;

    @RequestMapping("/sendMassger")
    public void sendMassger(){
        for (int i = 0 ; i < 100 ; i ++){
            helloSender.send();
        }
    }

}
