package com.cozyhome.onlineshop.inventoryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = {"com.cozyhome.onlineshop.inventoryservice.model"})
@EnableJpaRepositories(basePackages = {"com.cozyhome.onlineshop.inventoryservice.repository"})
@SpringBootApplication
public class InventoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryApplication.class, args);
		
	}	
}
