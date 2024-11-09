package com.scaler.productservice.controllers;

import com.scaler.productservice.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class ProductControllers {

    private ProductService productService;

    public ProductControllers(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public void getAllProducts() {

    }
    @GetMapping("/products/{id}")
    public void getProductDetails(PathVariable("id") long id){
        return ProductService.getProductDetails(id);
    }

    public void createProduct(){

    }
}
