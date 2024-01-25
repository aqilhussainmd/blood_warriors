package com.example.demo.model;

import jakarta.persistence.*;


@Entity
@Table(name="blood_bank")

public class Patient {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long patientId;
	
	@Column(name="patient_name")
	private String patientName;
	
	@Column(name = "patient_gaurdian_name")
	private String patientGaurdianName;
	
	@Column (name="patient_gaurdian_relation")
	private String patientGaurdianRelation;
	
	@Column(name = "patient_gaurdian_mobile")
	private String patientGaurdianMobile;
	
	@Column( name = "patient_gender")
	private String patientGender;
	
	@Column(name = "patient_date_of_bith")
	private String patientDateOfBirth;
	
	@Column(name ="patient_blood_group")
	private String patientBloodGroup;
	
	@Column(name = "patiet_no_of_units")
	private Long patientNoOfUnits;
	
	@Column(name = "patient_frequency_of_transfusion")
	private String patientFrequencyOfTransfusion;
	
	@Column(name = "patient_thalassemia_id")
	private Long patientThalassemiaId;
	
	@Column(name = "patient_proof_of_thalassemia")
	private String patientProofOfThalassemia;
	
	@Column(name = "blood_bridge")
	private Long bloodBridge;
	
	@Column(name = "user_id")
	private Long userId;
	
	@Column(name = "patient_previous_transfusion_date")
	private String patientPrevioustransfusionDate;
	
	@Column(name = "patient_next_transfusion_date")
	private String patientNextTransfsionDate;

	public Patient() {
		
	}
	
	public Patient(String patient_name,String patient_gaurdian_name,
			String patient_gaurdian_relation,String patient_gaurdian_mobile,
			String patient_gender,String patient_date_of_bith,
			String patient_blood_group,Long patiet_no_of_units,
			String patient_frequency_of_transfusion,Long patient_thalassemia_id,
			String patient_proof_of_thalassemia,Long blood_bridge,
			Long user_id, String patient_previous_transfusion_date,
			String patient_next_transfusion_date) {
		super();
		this.patientName = patient_name;
		this.patientGaurdianName = patient_gaurdian_name;
		this.patientGaurdianRelation = patient_gaurdian_relation;
		this.patientGaurdianMobile = patient_gaurdian_mobile;
		this.patientGender = patient_gender;
		this.patientDateOfBirth = patient_date_of_bith;
		this.patientBloodGroup = patient_blood_group;
		this.patientNoOfUnits = patiet_no_of_units;
		this.patientFrequencyOfTransfusion = patient_frequency_of_transfusion;
		this.patientThalassemiaId = patient_thalassemia_id;
		this.patientProofOfThalassemia = patient_proof_of_thalassemia;
		this.bloodBridge = blood_bridge;
		this.userId = user_id;
		this.patientProofOfThalassemia = patient_previous_transfusion_date;
		this.patientNextTransfsionDate = patient_next_transfusion_date;
		
		
	}
	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientGaurdianName() {
		return patientGaurdianName;
	}

	public void setPatientGaurdianName(String patientGaurdianName) {
		this.patientGaurdianName = patientGaurdianName;
	}

	public String getPatientGaurdianRelation() {
		return patientGaurdianRelation;
	}

	public void setPatientGaurdianRelation(String patientGaurdianRelation) {
		this.patientGaurdianRelation = patientGaurdianRelation;
	}

	public String getPatientGaurdianMobile() {
		return patientGaurdianMobile;
	}

	public void setPatientGaurdianMobile(String patientGaurdianMobile) {
		this.patientGaurdianMobile = patientGaurdianMobile;
	}

	public String getPatientGender() {
		return patientGender;
	}

	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}

	public String getPatientDateOfBirth() {
		return patientDateOfBirth;
	}

	public void setPatientDateOfBirth(String patientDateOfBirth) {
		this.patientDateOfBirth = patientDateOfBirth;
	}

	public String getPatientBloodGroup() {
		return patientBloodGroup;
	}

	public void setPatientBloodGroup(String patientBloodGroup) {
		this.patientBloodGroup = patientBloodGroup;
	}

	public Long getPatientNoOfUnits() {
		return patientNoOfUnits;
	}

	public void setPatientNoOfUnits(Long patientNoOfUnits) {
		this.patientNoOfUnits = patientNoOfUnits;
	}

	public String getPatientFrequencyOfTransfusion() {
		return patientFrequencyOfTransfusion;
	}

	public void setPatientFrequencyOfTransfusion(String patientFrequencyOfTransfusion) {
		this.patientFrequencyOfTransfusion = patientFrequencyOfTransfusion;
	}

	public Long getPatientThalassemiaId() {
		return patientThalassemiaId;
	}

	public void setPatientThalassemiaId(Long patientThalassemiaId) {
		this.patientThalassemiaId = patientThalassemiaId;
	}

	public String getPatientProofOfThalassemia() {
		return patientProofOfThalassemia;
	}

	public void setPatientProofOfThalassemia(String patientProofOfThalassemia) {
		this.patientProofOfThalassemia = patientProofOfThalassemia;
	}

	public Long getBloodBridge() {
		return bloodBridge;
	}

	public void setBloodBridge(Long bloodBridge) {
		this.bloodBridge = bloodBridge;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getPetientPrevioustransfusionDate() {
		return patientPrevioustransfusionDate;
	}

	public void setPetientPrevioustransfusionDate(String petientPrevioustransfusionDate) {
		this.patientPrevioustransfusionDate = petientPrevioustransfusionDate;
	}

	public String getPatientNextTransfsionDate() {
		return patientNextTransfsionDate;
	}

	public void setPatientNextTransfsionDate(String patientNextTransfsionDate) {
		this.patientNextTransfsionDate = patientNextTransfsionDate;
	}
	
	
}
