package com.example.productservice.ProductService.repository;

import com.example.productservice.ProductService.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Products, Integer> {
}
