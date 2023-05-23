package com.masai.Mini_Project.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class VehicleTypes {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int vehicleTypeId;
	
	//Sedan, Hatchback, SUV
	
	private String typeName;
	
	@OneToMany(mappedBy="vehicleTypes", cascade=CascadeType.ALL)
	private List<Vehicles> vehicles;
	
	
	private int isDeleted;


	public VehicleTypes() {
		super();
		// TODO Auto-generated constructor stub
	}


	public VehicleTypes(String typeName, List<Vehicles> vehicles) {
		super();
		this.typeName = typeName;
		this.vehicles = vehicles;
	}


	public int getVehicleTypeId() {
		return vehicleTypeId;
	}


	public void setVehicleTypeId(int vehicleTypeId) {
		this.vehicleTypeId = vehicleTypeId;
	}


	public String getTypeName() {
		return typeName;
	}


	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}


	public List<Vehicles> getVehicles() {
		return vehicles;
	}


	public void setVehicles(List<Vehicles> vehicles) {
		this.vehicles = vehicles;
	}


	public int getIsDeleted() {
		return isDeleted;
	}


	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	
	
}
