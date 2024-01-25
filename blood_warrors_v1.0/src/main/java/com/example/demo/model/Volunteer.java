package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "volunteer")
public class Volunteer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long volunteerId;
	
	@Column(name = "user_id")
	private Long userId;
	
	@Column(name = "volunteer_role")
	private String volunteerRole;
	
	@Column(name = "volunteer_active_status")
	private boolean volunteerActiveStatus;
	
	@Column(name = "volunteer_joining_date")
	private String volunteerJoiningDate;
	
	@Column(name = "volunteer_leaving_date")
	private String volunteerLeavingDate;
	
	@Column(name = "volunteer_access")
	private String volunteerAccess;
	
	@Column(name = "volunteer_remarks")
	private String volunteerRemarks;

	public Volunteer () {
		
	}
	
	public Volunteer (Long user_id,String volunteer_role,
			boolean volunteer_active_status,String volunteer_joining_date,
			String volunteer_leaving_date,String volunteer_access,String volunteer_remarks) {
		super();
		this.userId = user_id;
		this.volunteerRole = volunteer_role;
		this.volunteerActiveStatus = volunteer_active_status;
		this.volunteerJoiningDate = volunteer_joining_date;
		this.volunteerLeavingDate = volunteer_leaving_date;
		this.volunteerAccess = volunteer_access;
		this.volunteerRemarks = volunteer_remarks;
		
		
	}

	public Long getVolunteerId() {
		return volunteerId;
	}

	public void setVolunteerId(Long volunteerId) {
		this.volunteerId = volunteerId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getVolunteerRole() {
		return volunteerRole;
	}

	public void setVolunteerRole(String volunteerRole) {
		this.volunteerRole = volunteerRole;
	}

	public boolean isVolunteerActiveStatus() {
		return volunteerActiveStatus;
	}

	public void setVolunteerActiveStatus(boolean volunteerActiveStatus) {
		this.volunteerActiveStatus = volunteerActiveStatus;
	}

	public String getVolunteerJoiningDate() {
		return volunteerJoiningDate;
	}

	public void setVolunteerJoiningDate(String volunteerJoiningDate) {
		this.volunteerJoiningDate = volunteerJoiningDate;
	}

	public String getVolunteerLeavingDate() {
		return volunteerLeavingDate;
	}

	public void setVolunteerLeavingDate(String volunteerLeavingDate) {
		this.volunteerLeavingDate = volunteerLeavingDate;
	}

	public String getVolunteerAccess() {
		return volunteerAccess;
	}

	public void setVolunteerAccess(String volunteerAccess) {
		this.volunteerAccess = volunteerAccess;
	}

	public String getVolunteerRemarks() {
		return volunteerRemarks;
	}

	public void setVolunteerRemarks(String volunteerRemarks) {
		this.volunteerRemarks = volunteerRemarks;
	}
}
