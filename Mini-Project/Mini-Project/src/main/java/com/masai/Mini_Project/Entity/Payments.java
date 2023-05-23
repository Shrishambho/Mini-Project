package com.masai.Mini_Project.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Payments {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int paymentId;
	
	@OneToOne(mappedBy="paymnets")
	private Rides rides;
	
	private double amount;
	
	//INR,USD
	private String currency;
	
	private String paymentMethod;
	
	private String paymentStatus;
	
	private LocalDateTime timeStamp;
	
	private int isDeleted;

	public Payments() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payments(Rides rides, double amount, String currency, String paymentMethod, String paymentStatus,
			LocalDateTime timeStamp) {
		super();
		this.rides = rides;
		this.amount = amount;
		this.currency = currency;
		this.paymentMethod = paymentMethod;
		this.paymentStatus = paymentStatus;
		this.timeStamp = timeStamp;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public Rides getRides() {
		return rides;
	}

	public void setRides(Rides rides) {
		this.rides = rides;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
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
