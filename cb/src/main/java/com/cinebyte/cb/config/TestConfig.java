package com.cinebyte.cb.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.cinebyte.cb.entities.User;
import com.cinebyte.cb.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		User u1 = new User(null, "maria Brown", "maria@gmail.com", "99888888", "123456");
		User u2 = new User(null, "alex Brwon", "alex@gmail.com", "99777777","123456");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
	}
}
