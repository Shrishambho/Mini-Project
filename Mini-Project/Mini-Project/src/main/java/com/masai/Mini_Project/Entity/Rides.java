package com.masai.Mini_Project.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Rides {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int rideId;
	
	@OneToOne(mappedBy="rides")
	private Users users;
	
	@OneToOne(mappedBy="rides")
	private Drivers drivers;
	
	private String pickupLocation;
	
	private String dropoffLocation;
	
	@OneToOne(mappedBy="rides",cascade=CascadeType.ALL)
	private RideStatuses rideStatus;
	
	@OneToOne(mappedBy="rides",cascade=CascadeType.ALL)
	private Payments payments;
	
	private int isDeleted;

	public Rides() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rides(Users users, Drivers drivers, String pickupLocation, String dropoffLocation, RideStatuses rideStatus,
			Payments payments) {
		super();
		this.users = users;
		this.drivers = drivers;
		this.pickupLocation = pickupLocation;
		this.dropoffLocation = dropoffLocation;
		this.rideStatus = rideStatus;
		this.payments = payments;
	}

	public int getRideId() {
		return rideId;
	}

	public void setRideId(int rideId) {
		this.rideId = rideId;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Drivers getDrivers() {
		return drivers;
	}

	public void setDrivers(Drivers drivers) {
		this.drivers = drivers;
	}

	public String getPickupLocation() {
		return pickupLocation;
	}

	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}

	public String getDropoffLocation() {
		return dropoffLocation;
	}

	public void setDropoffLocation(String dropoffLocation) {
		this.dropoffLocation = dropoffLocation;
	}

	public RideStatuses getRideStatus() {
		return rideStatus;
	}

	public void setRideStatus(RideStatuses rideStatus) {
		this.rideStatus = rideStatus;
	}

	public Payments getPayments() {
		return payments;
	}

	public void setPayments(Payments payments) {
		this.payments = payments;
	}

	public int getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	
}
