package com.cinebyte.cb.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cinebyte.cb.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
	User u = new User(1L, "Maria", "maria@gmail.com", "99888888", "12345");
	return ResponseEntity.ok().body(u);
	}
}
