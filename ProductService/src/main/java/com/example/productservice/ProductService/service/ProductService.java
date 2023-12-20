package com.example.productservice.ProductService.service;

import com.example.productservice.ProductService.model.Products;
import com.example.productservice.ProductService.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public void addProduct(Products products) {
        productRepository.save(products);
        log.info("Product added");
    }

    public List<Products> getAllProducts()
    {
        return productRepository.findAll();
    }
    public void deleteProduct(Integer productid) {
        productRepository.deleteById(productid);

    }
}
