package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name="blood_bank")

public class BloodTransfusionTracker {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long transfusionId;
	
	@Column(name = "patient_id")
	private Long patientId;
	
	@Column(name = "transfusion_date")
	private String transfusionDate;
	
	@Column(name = "transfusion_blood_group")
	private String transfusionBloodGroup;
	
	@Column(name = "transfusion_place")
	private String transfusionPlace;

	public BloodTransfusionTracker() {
		
	}
	
	public BloodTransfusionTracker(Long patient_id,String transfusion_date,
			String transfusion_blood_group,String transfusion_place) {
		super();
		this.patientId=patient_id;
		this.transfusionDate=transfusion_date;
		this.transfusionBloodGroup=transfusion_blood_group;
		this.transfusionPlace=transfusion_place;
	}
	
	public Long getTransfusionId() {
		return transfusionId;
	}

	public void setTransfusionId(Long transfusionId) {
		this.transfusionId = transfusionId;
	}

	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	public String getTransfusionDate() {
		return transfusionDate;
	}

	public void setTransfusionDate(String transfusionDate) {
		this.transfusionDate = transfusionDate;
	}

	public String getTransfusionBloodGroup() {
		return transfusionBloodGroup;
	}

	public void setTransfusionBloodGroup(String transfusionBloodGroup) {
		this.transfusionBloodGroup = transfusionBloodGroup;
	}

	public String getTransfusionPlace() {
		return transfusionPlace;
	}

	public void setTransfusionPlace(String transfusionPlace) {
		this.transfusionPlace = transfusionPlace;
	}
}
