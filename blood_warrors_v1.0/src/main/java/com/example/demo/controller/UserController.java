package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Application;
import com.example.demo.model.User;
import com.example.demo.repository.UserReposiratary;
import com.example.demo.service.UserService;

import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/bw/")
public class UserController {
	
	Logger log = LoggerFactory.getLogger(Application.class);	
	
	@Autowired
	private UserService userService;

	@GetMapping("users")
	public List<User> getAllUser(){
		log.info("API : /bw/users");
		return userService.getAllUser();
	}
	
	@PostMapping("use")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	@SuppressWarnings("hiding")
	@GetMapping("users/{id}")
    public <User> Object getUser(@PathVariable Long id){
	  log.info("Api : /bw/users/{id}");
	  log.info("Id value is 5");
	return userService.getUserById(id);//userService.getUserById();
  }
	
	@PutMapping("users/{id}")
	public ResponseEntity<User> updateUser(@PathVariable Long id,@RequestBody User userDetails){
		return userService.updateUser(id,userDetails);
	}
	
	@DeleteMapping("users/{id}")
	public ResponseEntity<Map<String , Boolean>>  deleteUser(@PathVariable Long id){
		Map<String , Boolean> response = new HashMap<>();
		response.put("Deleted", Boolean.TRUE);
		return userService.deleteUser(id);
		
	}
}
