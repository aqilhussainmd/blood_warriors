package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long user_id;
	
	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "user_email")
	private String userEmail;
	
	@Column(name = "user_mobile")
	private String userMobile;
	
	@Column(name = "user_gender")
	private String userGender;
	
	@Column(name = "user_date_of_birth")
	private String userDateOfBirth;
	
	@Column(name = "user_blood_group")
	private String userBloodGroup;
	
	@Column(name = "user_source")
	private String userSource;
	
	@Column(name = "user_country")
	private String userCountry;
	
	@Column(name = "user_state")
	private String userState;
	
	@Column(name = "user_city")
	private String userCity;
	
	@Column(name = "user_password")
	private String userPassword;
	
	public User() {
		
	}
	
	public User(String user_name, String user_email, String user_mobile_number, String user_gender,
			String user_date_of_birth, String user_blood_group, String user_source, String user_country,
			String user_city, String user_password) {
		super();
		this.userName = user_name;
		this.userEmail = user_email;
		this.userMobile = user_mobile_number;
		this.userGender = user_gender;
		this.userDateOfBirth = user_date_of_birth;
		this.userBloodGroup = user_blood_group;
		this.userSource = user_source;
		this.userCountry = user_country;
		this.userCity = user_city;
		this.userPassword = user_password;
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return userName;
	}
	public void setUser_name(String user_name) {
		this.userName = user_name;
	}
	public String getUser_email() {
		return userEmail;
	}
	public void setUser_email(String user_email) {
		this.userEmail = user_email;
	}
	public String getUser_mobile() {
		return userMobile;
	}
	public void setUser_mobile_number(String user_mobile_number) {
		this.userMobile = user_mobile_number;
	}
	public String getUser_gender() {
		return userGender;
	}
	public void setUser_gender(String user_gender) {
		this.userGender = user_gender;
	}
	public String getUser_date_of_birth() {
		return userDateOfBirth;
	}
	public void setUser_date_of_birth(String user_date_of_birth) {
		this.userDateOfBirth = user_date_of_birth;
	}
	public String getUser_blood_group() {
		return userBloodGroup;
	}
	public void setUser_blood_group(String user_blood_group) {
		this.userBloodGroup = user_blood_group;
	}
	public String getUser_source() {
		return userSource;
	}
	public void setUser_source(String user_source) {
		this.userSource = user_source;
	}
	public String getUser_country() {
		return userCountry;
	}
	public void setUser_country(String user_country) {
		this.userCountry = user_country;
	}
	public String getUser_city() {
		return userCity;
	}
	public void setUser_city(String user_city) {
		this.userCity = user_city;
	}
	public String getUser_password() {
		return userPassword;
	}
	public void setUser_password(String user_password) {
		this.userPassword = user_password;
	}

	public String getUserState() {
		return userState;
	}

	public void setUserState(String userState) {
		this.userState = userState;
	}
}
