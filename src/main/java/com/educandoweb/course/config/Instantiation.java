package com.educandoweb.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.educandoweb.course.domain.User;
import com.educandoweb.course.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		
		User larissa = new User(null, "Larissa Damasceno", "larissa@gmail.");
		User lanna = new User(null, "Lanna Beatriz", "lanna@gmail.com");
		User laura = new User(null, "Laura Pontes", "laura@gmail.com");
		
		userRepository.saveAll(Arrays.asList(larissa, lanna, laura));		
	}
}
