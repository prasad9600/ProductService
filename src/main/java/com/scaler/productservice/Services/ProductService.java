package com.scaler.productservice.Services;

import com.scaler.productservice.Module.Product;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {

    public Product getProducts(long id);
}
