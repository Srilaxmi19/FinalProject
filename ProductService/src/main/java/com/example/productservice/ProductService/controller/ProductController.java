package com.example.productservice.ProductService.controller;

import com.example.productservice.ProductService.model.Products;
import com.example.productservice.ProductService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public List<Products> getAllProducts()
    {
        return productService.getAllProducts();
    }
    @PostMapping("/add")
    public void addProduct(@RequestBody Products products)
    {
        productService.addProduct(products);
    }
    @DeleteMapping("delete/{id}")
    public void deleteProduct(@PathVariable Integer id)
    {
        productService.deleteProduct(id);
    }
}
