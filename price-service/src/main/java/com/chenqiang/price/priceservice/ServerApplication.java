package com.chenqiang.price.priceservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:spring/*.xml")
public class ServerApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ServerApplication.class, args);
        System.out.println("spring boot success");
        for (;;){
            Thread.sleep(1000);
        }
    }
}
