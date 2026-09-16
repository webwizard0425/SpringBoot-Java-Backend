package com.rohit.SimpleWebApp.service;
import java.util.*;
import com.rohit.SimpleWebApp.model.Product;
import com.rohit.SimpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;
//    List<Product> products = Arrays.asList(
//            new Product(101,"iPhone",5000),
//            new Product(102,"vivo",10000),
//            new Product(103,"apple",70000)
//    );

    public List<Product> getProducts(){

        return repo.findAll();
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(null);
    }

    public void addProduct(Product prod){
        repo.save(prod);
    }

    public void UpdateProduct(Product prod){
        repo.save(prod);
    }
    public void deleteProduct(int prodId){
        repo.deleteById(prodId);
    }
}
