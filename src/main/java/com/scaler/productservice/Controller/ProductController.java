package com.scaler.productservice.Controller;

import com.scaler.productservice.Module.Product;
import com.scaler.productservice.Services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/Product/{id}")
    public Product getProduct(@PathVariable("id") long id){
        productService.getProducts(id);
    }
}
