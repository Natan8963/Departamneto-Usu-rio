package com.example.departament.controlles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.departament.entities.User;
import com.example.departament.respositoreis.UserRepository;



@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private UserRepository repository;
	
	@GetMapping
	public List<User> findAll() {
		return repository.findAll();
	}

	@GetMapping(value = "/{id}")
	public User findAll(@PathVariable Long id) {
		return repository.findById(id).get();
	}
	
	@PostMapping
	public User insert(@RequestBody User user) {
		return repository.save(user);
	}
		

}
