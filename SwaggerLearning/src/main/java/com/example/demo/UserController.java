package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestBody;
@RestController
public class UserController {
	
	@Autowired
	MyRepo repo;
	@GetMapping("/hello")
	public List<User> sayHello() {
		return repo.findAll();
	}
	
	@PostMapping("/user")
	public User createUser(@RequestBody User user) {
	    return repo.save(user);
	}
	
//	@PutMapping("/update")
//	public String updateUser(@RequestBody String name) {
//		return "User updated with name: "+name;
//	}
//	
//	@DeleteMapping("/delete")
//	public String deleteUser() {
//		return "User is delete";
//	}
}
