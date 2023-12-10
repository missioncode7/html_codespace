package com.spring_boot_3._features.repository;

import com.spring_boot_3._features.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {


}
