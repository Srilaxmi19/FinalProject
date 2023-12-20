package com.example.inventoryService.inventoryService;

import com.example.inventoryService.inventoryService.model.Inventory;
import com.example.inventoryService.inventoryService.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class InventoryService {
    @Autowired
    private InventoryRepository inventoryRepository;
//    public void addInventory(Inventory inventory){
//        inventoryRepository.save(inventory);
//    }
    public boolean isProductInStock(String productname){
        return false;
    }
}
