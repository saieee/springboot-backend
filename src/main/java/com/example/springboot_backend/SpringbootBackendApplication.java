package com.example.springboot_backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.springboot_backend.model.User;
import com.example.springboot_backend.repository.UserRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User(1, "sai", "karthik", "saibttr@gmail.com"));
		this.userRepository.save(new User(2, "sai", "kesava", "saikesava@gmail.com"));
		this.userRepository.save(new User(3, "sai", "ram", "sairam@gmail.com"));

	}

}
