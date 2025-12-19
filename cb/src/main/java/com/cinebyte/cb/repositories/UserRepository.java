package com.cinebyte.cb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinebyte.cb.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
