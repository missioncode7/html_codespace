package com.spring_boot_3._features.controller;

import com.spring_boot_3._features.entities.Product;
import com.spring_boot_3._features.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    // localhost:8080/product
    @PostMapping
    public List<Product> getcreateProduct(@RequestBody List<Product> productList){
        return productRepository.saveAll(productList);
    }


    @GetMapping
    public List<Product> getAllProductList(){
        return productRepository.findAll();

    }
}
