package com.scaler.productservice.services;

import com.scaler.productservice.models.Product;

public interface ProductService {
        public Product getProductDetails(long id);
        public Product createProduct(String
                                     title, String description, String image,
                                     double price, String category);
}
