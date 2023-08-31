package com.cozyhome.onlineshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GatewayServiceApplication {
    public static void main(String[] args) {
        System.out.println("Gateway service run!");
        SpringApplication.run(GatewayServiceApplication.class, args);
    }
}