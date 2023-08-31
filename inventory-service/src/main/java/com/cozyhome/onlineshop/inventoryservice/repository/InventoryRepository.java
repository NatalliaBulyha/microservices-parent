package com.cozyhome.onlineshop.inventoryservice.repository;

import java.util.List;
import java.util.Optional;

import com.cozyhome.onlineshop.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Integer>{
	
	Optional<Inventory> findByProductColorProductSkuCodeAndProductColorColorHex(String productSkuCode, String colorHex);
	
	List<Inventory> findByProductColorProductSkuCodeIn(List<String> productSkuCodes);
	
	List<Inventory> findByProductColorProductSkuCode(String productSkuCode);

}
