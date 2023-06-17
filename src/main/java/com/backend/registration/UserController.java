package com.backend.registration;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:<React Js Server port number>")
public class UserController {

	@Autowired
	private UserService service;

	// GET Mapping

	@GetMapping("/users")
	public List<User> list() {
		return service.listAll();
	}

	// get by id
	@GetMapping("/users/{id}")
	public void getByid(@PathVariable Integer id) {
		service.getUserByid(id);

	}

	// POST mapping
	@PostMapping("/users")
	public void save(@RequestBody User user) {
		service.save(user);

	}

	// delete by id
	@DeleteMapping("/users/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}

}
