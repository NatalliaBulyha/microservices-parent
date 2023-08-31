package com.cozyhome.onlineshop.inventoryservice.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cozyhome.onlineshop.inventoryservice.dto.ColorQuantityStatusDto;
import com.cozyhome.onlineshop.inventoryservice.dto.ProductColorDto;
import com.cozyhome.onlineshop.inventoryservice.dto.ProductQuantityStatusDto;
import com.cozyhome.onlineshop.inventoryservice.dto.ProductSkuCodeRequest;
import com.cozyhome.onlineshop.inventoryservice.service.InventoryService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("${api.basePath}/inventory")
@RestController
public class InventoryController {
	private final InventoryService inventoryService;
	
	@PostMapping
	public ResponseEntity<Integer> getProductQuantity(@RequestBody ProductColorDto productColorDto){
		return ResponseEntity.ok(inventoryService.getQuantityByProductColor(productColorDto));
	}
	
	@PostMapping("/product_skuCode_list")
	public ResponseEntity<List<ProductQuantityStatusDto>> getProductQuantityBySkuCodes(@RequestBody ProductSkuCodeRequest productSkuCodes){
		return ResponseEntity.ok(inventoryService.getQuantityStatusBySkuCodeList(productSkuCodes));
	}
	
	@GetMapping("/product_skuCode")
	public ResponseEntity<List<ColorQuantityStatusDto>> getColorQuantityBySkuCode(@RequestParam String productSkuCode){
		return ResponseEntity.ok(inventoryService.getQuantityStatusBySkuCode(productSkuCode));
	}
}
