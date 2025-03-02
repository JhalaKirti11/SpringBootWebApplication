package com.webApp.SpringBootWebApplication.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.webApp.SpringBootWebApplication.model.Product;

@Service
public class ProductService {
    
    List<Product> products = Arrays.asList(
        new Product(101,"camera", 20000),
        new Product(102, "phone", 15000),
        new Product(103, "watch", 12000));

    public List<Product> getProducts(){
        return products;
    }

    public Product getProductsById(int id) {
        return products.stream()
        .filter(p-> p.getId()==id)
        .findFirst().get();    
    }
}
