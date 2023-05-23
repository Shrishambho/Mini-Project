package com.masai.Mini_Project.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class UserRoles {

	private int userRoleId;
	
	@ManyToOne
	@JoinColumn(name="userId")
	private Users users;
	
	
//	private int userId;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="userRoleId")
	private  List<Roles> roles;
	
	private int isDeleted;

	public UserRoles() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserRoles(Users users, List<Roles> roles) {
		super();
		this.users = users;
		this.roles = roles;
	}

	public int getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(int userRoleId) {
		this.userRoleId = userRoleId;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public List<Roles> getRoles() {
		return roles;
	}

	public void setRoles(List<Roles> roles) {
		this.roles = roles;
	}

	public int getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	
	
}
