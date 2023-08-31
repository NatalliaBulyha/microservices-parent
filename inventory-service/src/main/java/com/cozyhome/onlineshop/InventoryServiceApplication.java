package com.cozyhome.onlineshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InventoryServiceApplication {
    public static void main(String[] args) {
        System.out.println("Inventory service run!");
        SpringApplication.run(InventoryServiceApplication.class, args);
    }
}