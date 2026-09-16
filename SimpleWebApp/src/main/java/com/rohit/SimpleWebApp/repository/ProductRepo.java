package com.rohit.SimpleWebApp.repository;

import com.rohit.SimpleWebApp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo  extends JpaRepository<Product,Integer> {
    // classname we are working with == product
    // type of primarykey == Integer
}
