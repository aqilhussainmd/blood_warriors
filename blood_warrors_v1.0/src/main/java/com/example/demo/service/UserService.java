package com.example.demo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Application;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.User;
import com.example.demo.repository.UserReposiratary;

@Service
public class UserService {
	
	Logger log = LoggerFactory.getLogger(Application.class);	
	
	@Autowired
	private UserReposiratary userReposiratory;

	
	public List<User> getAllUser(){
		log.info("In service class: getAllUser");
		return userReposiratory.findAll();
	}
	
	public User createUser(User user){
		
		User createUser=userReposiratory.save(user);
		return createUser;
	}
	public ResponseEntity<User> getUserById(Long id) {
		User user=userReposiratory.findById(id).orElseThrow(() -> new ResourceNotFoundException("User with the id does not exist "+id));
		return ResponseEntity.ok(user);
		
	}
	
	public ResponseEntity<User> updateUser(Long id ,User userDetails){
		User user=userReposiratory.findById(id).orElseThrow(() -> new ResourceNotFoundException("User with the id does not exist "+id));
		user.setUser_name(userDetails.getUser_name());
		user.setUser_mobile_number(userDetails.getUser_mobile());
		user.setUser_email(userDetails.getUser_email());
		user.setUser_gender(userDetails.getUser_gender());
		user.setUser_date_of_birth(userDetails.getUser_date_of_birth());
		user.setUser_blood_group(userDetails.getUser_blood_group());
		user.setUser_source(userDetails.getUser_source());
		user.setUser_country(userDetails.getUser_country());
		user.setUserState(userDetails.getUserState());
		user.setUser_city(userDetails.getUser_city());
		user.setUser_password(userDetails.getUser_password());
		
		User updateUser=userReposiratory.save(user);
		return ResponseEntity.ok(updateUser);
	}
	
	public ResponseEntity<Map<String , Boolean>> deleteUser(Long id){
		User user=userReposiratory.findById(id).orElseThrow(() -> new ResourceNotFoundException("User with the id does not exist "+id));
		userReposiratory.delete(user);
		Map<String , Boolean> response = new HashMap<>();
		response.put("Deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}