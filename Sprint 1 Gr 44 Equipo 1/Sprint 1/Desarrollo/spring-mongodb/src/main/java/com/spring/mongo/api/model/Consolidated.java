package com.spring.mongo.api.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Document(collection="db_consolidado")
public class Consolidated {
	
	private int id;
	private String sede;
	private long totalVentas;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSede() {
		return sede;
	}
	public void setSede(String sede) {
		this.sede = sede;
	}
	public long getTotalVentas() {
		return totalVentas;
	}
	public void setTotalVentas(long totalVentas) {
		this.totalVentas = totalVentas;
	}
	
	
}
