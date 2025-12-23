package com.cinebyte.cb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinebyte.cb.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
