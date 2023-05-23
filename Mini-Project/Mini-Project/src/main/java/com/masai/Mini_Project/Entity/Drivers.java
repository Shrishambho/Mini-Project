package com.masai.Mini_Project.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Drivers {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int driverId;
	
	@OneToOne(mappedBy="drivers")
	private Users users;
	
	private int vehicleId;
	
	@OneToOne(mappedBy="drivers",cascade=CascadeType.ALL)
	private Rides rides;

	private int isDeleted;

	public Drivers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Drivers(Users users, int vehicleId, Rides rides) {
		super();
		this.users = users;
		this.vehicleId = vehicleId;
		this.rides = rides;
	}

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public Rides getRides() {
		return rides;
	}

	public void setRides(Rides rides) {
		this.rides = rides;
	}

	public int getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	
	
	
	
}
