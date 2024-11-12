package com.scaler.productservice.Services;

import com.scaler.productservice.Module.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FakeStoreProduct implements ProductService{

    private RestTemplate restTemplate;

    public FakeStoreProduct(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Product getProducts(long id) {
        return null;
    }
}
