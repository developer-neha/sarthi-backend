package com.avviare.sarthi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.avviare.sarthi.dto.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}

