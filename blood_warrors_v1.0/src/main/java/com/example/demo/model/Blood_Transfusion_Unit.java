package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name="blood_transfusion_unit")

public class Blood_Transfusion_Unit {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long bloodTransfusionUnitId;
	
	@Column(name = "transfusion_id")
	private Long transfusionId;
	
	@Column(name = "blood_packet_id")
	private Long bloodPacketId;

	public Blood_Transfusion_Unit() {
		
	}
	
	public Blood_Transfusion_Unit(Long transfusion_id,Long blood_packet_id) {
		super();
		this.transfusionId=transfusion_id;
		this.bloodPacketId=blood_packet_id;
	}
	
	public Long getBloodTransfusionUnitId() {
		return bloodTransfusionUnitId;
	}

	public void setBloodTransfusionUnitId(Long bloodTransfusionUnitId) {
		this.bloodTransfusionUnitId = bloodTransfusionUnitId;
	}

	public Long getTransfusionId() {
		return transfusionId;
	}

	public void setTransfusionId(Long transfusionId) {
		this.transfusionId = transfusionId;
	}

	public Long getBloodPacketId() {
		return bloodPacketId;
	}

	public void setBloodPacketId(Long bloodPacketId) {
		this.bloodPacketId = bloodPacketId;
	}
	
}
