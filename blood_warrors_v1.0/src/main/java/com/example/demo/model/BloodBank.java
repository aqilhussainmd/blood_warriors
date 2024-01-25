package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name="blood_bank")
public class BloodBank {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long donationId;
	
	@Column(name = "blood_packet_id")
	private Long bloodPacketID;
	
	@Column(name = "blood_group")
	private String bloodGroup;
	
	@Column(name = "blood_doantion_date")
	private String blooddonationdate;
	
	@Column(name = "packet_expiry_date")
	private String packetExpiryDdate;
	
	@Column(name = "donation_place")
	private String donationPlace;
	
	@Column(name = "packet_status")
	private String packetStatus;
	
	@Column(name = "place_blood_packet_currently")
	private String placeBloodPacketCurrently;
	
	@Column(name = "comments")
	private String comments;

	public BloodBank () {
		
	}
	public BloodBank(Long blood_packet_id,String blood_group,
			String blood_doantion_date,String packet_expiry_date,
			String donation_place,String packet_status,
			String place_blood_packet_currently,String comments) {
		super();
		this.bloodPacketID=blood_packet_id;
		this.bloodGroup=blood_group;
		this.blooddonationdate=blood_doantion_date;
		this.packetExpiryDdate=packet_expiry_date;
		this.donationPlace=donation_place;
		this.packetStatus=packet_status;
		this.placeBloodPacketCurrently=place_blood_packet_currently;
		this.comments=comments;
		
	}
	public Long getDonationId() {
		return donationId;
	}

	public void setDonationId(Long donationId) {
		this.donationId = donationId;
	}

	public Long getBloodPacketID() {
		return bloodPacketID;
	}

	public void setBloodPacketID(Long bloodPacketID) {
		this.bloodPacketID = bloodPacketID;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getBlooddonationdate() {
		return blooddonationdate;
	}

	public void setBlooddonationdate(String blooddonationdate) {
		this.blooddonationdate = blooddonationdate;
	}

	public String getPacketExpiryDdate() {
		return packetExpiryDdate;
	}

	public void setPacketExpiryDdate(String packetExpiryDdate) {
		this.packetExpiryDdate = packetExpiryDdate;
	}

	public String getDonationPlace() {
		return donationPlace;
	}

	public void setDonationPlace(String donationPlace) {
		this.donationPlace = donationPlace;
	}

	public String getPacketStatus() {
		return packetStatus;
	}

	public void setPacketStatus(String packetStatus) {
		this.packetStatus = packetStatus;
	}

	public String getPlaceBloodPacketCurrently() {
		return placeBloodPacketCurrently;
	}

	public void setPlaceBloodPacketCurrently(String placeBloodPacketCurrently) {
		this.placeBloodPacketCurrently = placeBloodPacketCurrently;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
}
