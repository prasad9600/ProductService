package com.scaler.productservice.controllers;

import com.scaler.productservice.models.Product;
import com.scaler.productservice.services.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductControllers {

    private ProductService productService;

    public ProductControllers(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public void getAllProducts() {

    }
    @GetMapping("/products/{id}")
    public Product getProductDetails(@PathVariable("id") long id){
        return ProductService.getProductDetails(id);
    }
    @PostMapping("/products")
    public void createProduct(@RequestBody CreateProductRequestDto requestDto){
        Product product = productService.createProduct(
            requestDto.getTitle(),
            requestDto.getDescription(),
                requestDto.getImage(),
                requestDto.getPrice(),
                requestDto.getCategory()
        );
    }
}
