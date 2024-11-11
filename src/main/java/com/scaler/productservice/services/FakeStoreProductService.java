package com.scaler.productservice.services;

import com.scaler.productservice.dto.FakeStoreProductDTO;
import com.scaler.productservice.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FakeStoreProductService implements ProductService{

    private RestTemplate restTemplate;

    public FakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Product getProductDetails(long id) {
        FakeStoreProductDTO responseDTO = restTemplate.getForObject(
                "https://fakestoreapi.com/products/"+id,FakeStoreProductDTO.class);
    }

    @Override
    public Product createProduct(String title, String description, String image, double price, String category) {

        return null;
    }


}
