package com.example.SpringBootRedisDocker.repository;

import com.example.SpringBootRedisDocker.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}