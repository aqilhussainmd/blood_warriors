package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name="blood_bridge")

public class BloodBridge {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long bloodBridgeId;
	
	@Column(name = "volunteer_id")
	private Long volunteerId;
	
	@Column(name = "patient_id")
	private Long patientId;
	
	@Column(name = "blood_bridge_active_status")
	private String bloodBridgeActiveStatus;
	
	@Column(name = "blood_bridge_start_date")
	private String bloodBridgeStartDate;
	
	@Column(name = "blood_bridge_end_date")
	private String bloodBridgeEndDate;
	
	@Column(name = "blood_bridge_patient_last_transfusion_date")
	private String bloodBridgePatientLastTransfusionDate;
	
	@Column(name = "blood_bridge_next_trnasfusion_date")
	private String bloodBridgeNextTransfusationDate;
	
	@Column(name = "blood_brige_patient_trnasfusion_frequency")
	private Long bloodBridgePatientTransfusionFrequnecy;
	
	@Column(name = "blood_bridge_remarks")
	private String bloodBridgeRemarks;
	
	@Column(name = "blood_bridge_comments")
	private String bloodBridgeComments;

	public BloodBridge() {
		
	}
	
	public BloodBridge(Long volunteer_id,Long patient_id,
			String blood_bridge_active_status,String blood_bridge_start_date,
			String blood_bridge_end_date,String blood_bridge_patient_last_transfusion_date,
			String blood_bridge_next_trnasfusion_date,
			Long blood_brige_patient_trnasfusion_frequency,
			String blood_bridge_remarks,String blood_bridge_comments) {
		super();
		this.volunteerId = volunteer_id;
		this.patientId = patient_id;
		this.bloodBridgeActiveStatus = blood_bridge_active_status;
		this.bloodBridgeStartDate = blood_bridge_start_date;
		this.bloodBridgeEndDate = blood_bridge_end_date;
		this.bloodBridgePatientLastTransfusionDate = blood_bridge_patient_last_transfusion_date;
		this.bloodBridgeNextTransfusationDate = blood_bridge_next_trnasfusion_date;
		this.bloodBridgePatientTransfusionFrequnecy = blood_brige_patient_trnasfusion_frequency;
		this.bloodBridgeRemarks = blood_bridge_remarks;
		this.bloodBridgeComments = blood_bridge_comments;
	}
	public Long getBloodBridgeId() {
		return bloodBridgeId;
	}

	public void setBloodBridgeId(Long bloodBridgeId) {
		this.bloodBridgeId = bloodBridgeId;
	}

	public Long getVolunteerId() {
		return volunteerId;
	}

	public void setVolunteerId(Long volunteerId) {
		this.volunteerId = volunteerId;
	}

	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	public String getBloodBridgeActiveStatus() {
		return bloodBridgeActiveStatus;
	}

	public void setBloodBridgeActiveStatus(String bloodBridgeActiveStatus) {
		this.bloodBridgeActiveStatus = bloodBridgeActiveStatus;
	}

	public String getBloodBridgeStartDate() {
		return bloodBridgeStartDate;
	}

	public void setBloodBridgeStartDate(String bloodBridgeStartDate) {
		this.bloodBridgeStartDate = bloodBridgeStartDate;
	}

	public String getBloodBridgeEndDate() {
		return bloodBridgeEndDate;
	}

	public void setBloodBridgeEndDate(String bloodBridgeEndDate) {
		this.bloodBridgeEndDate = bloodBridgeEndDate;
	}

	public String getBloodBridgePatientLastTransfusionDate() {
		return bloodBridgePatientLastTransfusionDate;
	}

	public void setBloodBridgePatientLastTransfusionDate(String bloodBridgePatientLastTransfusionDate) {
		this.bloodBridgePatientLastTransfusionDate = bloodBridgePatientLastTransfusionDate;
	}

	public String getBloodBridgeNextTransfusationDate() {
		return bloodBridgeNextTransfusationDate;
	}

	public void setBloodBridgeNextTransfusationDate(String bloodBridgeNextTransfusationDate) {
		this.bloodBridgeNextTransfusationDate = bloodBridgeNextTransfusationDate;
	}

	public Long getBloodBridgePatientTransfusionFrequnecy() {
		return bloodBridgePatientTransfusionFrequnecy;
	}

	public void setBloodBridgePatientTransfusionFrequnecy(Long bloodBridgePatientTransfusionFrequnecy) {
		this.bloodBridgePatientTransfusionFrequnecy = bloodBridgePatientTransfusionFrequnecy;
	}

	public String getBloodBridgeRemarks() {
		return bloodBridgeRemarks;
	}

	public void setBloodBridgeRemarks(String bloodBridgeRemarks) {
		this.bloodBridgeRemarks = bloodBridgeRemarks;
	}

	public String getBloodBridgeComments() {
		return bloodBridgeComments;
	}

	public void setBloodBridgeComments(String bloodBridgeComments) {
		this.bloodBridgeComments = bloodBridgeComments;
	}
}
