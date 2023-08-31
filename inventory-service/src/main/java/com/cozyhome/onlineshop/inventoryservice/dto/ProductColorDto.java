package com.cozyhome.onlineshop.inventoryservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductColorDto {

	private String productSkuCode;
	private String colorHex;
	
}
