package com.cinebyte.cb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinebyte.cb.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
