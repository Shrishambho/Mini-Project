package com.masai.Mini_Project.Entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Users {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String password;
	
	private String phoneNumber;
	
	@OneToMany(mappedBy = "users", cascade=CascadeType.ALL)
	private Set<UserRoles> userRoles;
	
	@OneToOne(mappedBy="users",cascade=CascadeType.ALL)
	private Drivers drivers;
	
	@OneToOne(mappedBy="users",cascade=CascadeType.ALL)
    private Rides rides;
	
	private int isDeleted;

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(String firstName, String lastName, String email, String password, String phoneNumber,
			Set<UserRoles> userRoles, Drivers drivers, Rides rides) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.userRoles = userRoles;
		this.drivers = drivers;
		this.rides = rides;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Set<UserRoles> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(Set<UserRoles> userRoles) {
		this.userRoles = userRoles;
	}

	public Drivers getDrivers() {
		return drivers;
	}

	public void setDrivers(Drivers drivers) {
		this.drivers = drivers;
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
