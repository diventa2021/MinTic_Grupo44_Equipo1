package com.spring.mongo.api.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection="db_user")
public class User {
	
	private int id;
	private String user;
	private String userPass;
	private String userName;
	private String userSede;
	private boolean userAdmin;
	
		
	public boolean isUserAdmin() {
		return userAdmin;
	}
	public void setUserAdmin(boolean userAdmin) {
		this.userAdmin = userAdmin;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserSede() {
		return userSede;
	}
	public void setUserSede(String userSede) {
		this.userSede = userSede;
	}
	
	
}
