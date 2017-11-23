package com.jk.rabbit.hello;

import org.springframework.stereotype.Component;

@Component
//@RabbitListener(queues = "hello")
public class HelloReceiver {

   // @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver  : " + hello);
    }

}
