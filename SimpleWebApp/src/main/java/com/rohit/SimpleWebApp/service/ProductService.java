package com.rohit.SimpleWebApp.service;
import java.util.*;
import com.rohit.SimpleWebApp.model.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(
            new Product(101,"iPhone",5000),
            new Product(102,"vivo",10000),
            new Product(103,"apple",70000)
    );

    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(int prodId) {
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst().orElse(new Product (100,"no Item",0));
    }

    public void addProduct(Product prod){
        products.add(prod);
    }
}
