package com.masai.Mini_Project.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

@Entity
public class RideStatuses {

	private int rideStatusId;
	
	@OneToOne(mappedBy="rideStatus")
	private Rides rides;
	
	private String status;
	
	private LocalDateTime timeStamp;
	
	private int isDeleted;

	public RideStatuses() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RideStatuses(Rides rides, String status, LocalDateTime timeStamp) {
		super();
		this.rides = rides;
		this.status = status;
		this.timeStamp = timeStamp;
	}

	public int getRideStatusId() {
		return rideStatusId;
	}

	public void setRideStatusId(int rideStatusId) {
		this.rideStatusId = rideStatusId;
	}

	public Rides getRides() {
		return rides;
	}

	public void setRides(Rides rides) {
		this.rides = rides;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	public int getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	
}
