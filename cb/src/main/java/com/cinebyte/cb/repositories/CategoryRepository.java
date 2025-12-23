package com.cinebyte.cb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinebyte.cb.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
