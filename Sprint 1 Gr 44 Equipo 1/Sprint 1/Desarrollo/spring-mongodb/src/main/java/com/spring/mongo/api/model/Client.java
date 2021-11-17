package com.spring.mongo.api.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Document(collection="db_client")
public class Client {

	private int id;
	private String clientName;
	private String clientAdress;
	private long clientNumber;
	private String clientEmail;
	private String sede;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getClientAdress() {
		return clientAdress;
	}
	public void setClientAdress(String clientAdress) {
		this.clientAdress = clientAdress;
	}

	public long getClientNumber() {
		return clientNumber;
	}
	public void setClientNumber(long clientNumber) {
		this.clientNumber = clientNumber;
	}
	public String getClientEmail() {
		return clientEmail;
	}
	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}
	public String getSede() {
		return sede;
	}
	public void setSede(String sede) {
		this.sede = sede;
	}
	
	
}
