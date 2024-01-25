package com.example.demo.model;

import jakarta.persistence.*;


@Entity
@Table(name="donor")
public class Donor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long donor_id;
	
	@Column(name = "donor_previous_blood_donaton_date")
	private String donorPreviousBloodDonationDate;
	
	@Column(name = "donor_active_status")
	private String donorActiveStstus; 
	
	@Column(name = "donor_last_contact_date")
	private String donorLastContactDate;
	
	@Column(name = "donor_donation_eligibility")
	private boolean donorDonationEligibility;
	
	@Column(name = "donor_last_tested_date")
	private String donorLastTestedDate;
	
	public Donor() {
		
	}
	
	public Donor(String donor_previous_blood_donaton_date,
			String donor_active_status,String donor_last_contact_date,
			boolean donor_donation_eligibility,String donor_last_tested_date) {
	super();
	this.donorPreviousBloodDonationDate=donor_previous_blood_donaton_date;
	this.donorActiveStstus=donor_active_status;
	this.donorLastContactDate=donor_last_contact_date;
	this.donorDonationEligibility=donor_donation_eligibility;
	this.donorLastTestedDate=donor_last_tested_date;
	
}

	public Long getDonor_id() {
		return donor_id;
	}

	public void setDonor_id(Long donor_id) {
		this.donor_id = donor_id;
	}

	public String getDonorPreviousBloodDonationDate() {
		return donorPreviousBloodDonationDate;
	}

	public void setDonorPreviousBloodDonationDate(String donorPreviousBloodDonationDate) {
		this.donorPreviousBloodDonationDate = donorPreviousBloodDonationDate;
	}

	public String getDonorActiveStstus() {
		return donorActiveStstus;
	}

	public void setDonorActiveStstus(String donorActiveStstus) {
		this.donorActiveStstus = donorActiveStstus;
	}

	public String getDonorLastContactDate() {
		return donorLastContactDate;
	}

	public void setDonorLastContactDate(String donorLastContactDate) {
		this.donorLastContactDate = donorLastContactDate;
	}

	public boolean isDonorDonationEligibility() {
		return donorDonationEligibility;
	}

	public void setDonorDonationEligibility(boolean donorDonationEligibility) {
		this.donorDonationEligibility = donorDonationEligibility;
	}

	public String getDonorLastTestedDate() {
		return donorLastTestedDate;
	}

	public void setDonorLastTestedDate(String donorLastTestedDate) {
		this.donorLastTestedDate = donorLastTestedDate;
	}
}

