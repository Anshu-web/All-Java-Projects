package com.onetomany.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onetomany.api.model.Product;

 
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
