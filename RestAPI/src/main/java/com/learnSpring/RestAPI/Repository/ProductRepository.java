package com.learnSpring.RestAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learnSpring.RestAPI.Entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Custom query methods can be defined here if needed

}
