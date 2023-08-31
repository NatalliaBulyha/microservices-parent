package com.cozyhome.onlineshop.inventoryservice.service;

import java.util.List;

import com.cozyhome.onlineshop.inventoryservice.dto.ColorQuantityStatusDto;
import com.cozyhome.onlineshop.inventoryservice.dto.ProductColorDto;
import com.cozyhome.onlineshop.inventoryservice.dto.ProductQuantityStatusDto;
import com.cozyhome.onlineshop.inventoryservice.dto.ProductSkuCodeRequest;

public interface InventoryService {
	
	int getQuantityByProductColor(ProductColorDto request);
	
	List<ProductQuantityStatusDto> getQuantityStatusBySkuCodeList(ProductSkuCodeRequest request);
	
	List<ColorQuantityStatusDto> getQuantityStatusBySkuCode(String productSkuCode);
	
}
