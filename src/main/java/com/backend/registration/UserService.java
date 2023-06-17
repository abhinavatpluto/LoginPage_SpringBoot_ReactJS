package com.backend.registration;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class UserService {

	@Autowired
	private UserRepo repo;

//	@PostConstruct
//	public void initDB() {
//		List<User> users = IntStream.rangeClosed(1, 200)
//				.mapToObj(i -> new Game(new Random().nextInt(100), "game" + i, new Random().nextInt(50000)))
//				.collect(Collectors.toList());
//		gameRepo.saveAll(games);
//	}

	@PostConstruct
	public void initDB() {
		List<User> users = IntStream.range(1, 100).mapToObj(i -> new User(new Random().nextInt(100), "firstName" + i,
				"laststName" + i, "password" + i, "password" + i, "email" + i + "@.com")).collect(Collectors.toList());
		repo.saveAll(users);
	}

	// Getting all user
	public List<User> listAll() {
		return repo.findAll();
	}

	// Getting user by their ID

//	public Optional<User> getUserByid(Integer id) {
//		return repo.findById(id);
//	}
	public void getUserByid(Integer id) {
		repo.findById(id).get();
	}

	// Creating new user into the db
	
	public void save(User user) {
		repo.save(user);

	}

	// Deleting user by their id
	public void delete(Integer id) {
		repo.deleteById(id);

	}

}
