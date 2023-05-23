package com.masai.Mini_Project.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Vehicles {

	private int vehicleId;
	
	@ManyToOne
	@JoinColumn(name="vehicleTypeId")
	private VehicleTypes vehicleTypes;
	
	private String make;
	
	private String model;
	
	private String licensePlate;
	
	private int isDeleted;

	public Vehicles() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicles(VehicleTypes vehicleTypes, String make, String model, String licensePlate) {
		super();
		this.vehicleTypes = vehicleTypes;
		this.make = make;
		this.model = model;
		this.licensePlate = licensePlate;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public VehicleTypes getVehicleTypes() {
		return vehicleTypes;
	}

	public void setVehicleTypes(VehicleTypes vehicleTypes) {
		this.vehicleTypes = vehicleTypes;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public int getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	
	
}
