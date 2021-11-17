package com.spring.mongo.api.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Document(collection="db_ventas")
public class Ventas {
	
	private int id;
	private long clientId;
	private long totalVenta;
	/*private long valorIva;
	private long productId;
	private long cantidad;
	private long valorVenta;
	private long valorTotal;*/
	private Object detalleVenta [];
	private long ivaVenta;
	private long valorAllVentas;
	private String sede;
	
	
	public String getSede() {
		return sede;
	}
	public void setSede(String sede) {
		this.sede = sede;
	}
	public long getValorAllVentas() {
		return valorAllVentas;
	}
	public void setValorAllVentas(long valorAllVentas) {
		this.valorAllVentas = valorAllVentas;
	}
	public long getIvaVenta() {
		return ivaVenta;
	}
	public void setIvaVenta(long ivaVenta) {
		this.ivaVenta = ivaVenta;
	}
	/*
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public long getCantidad() {
		return cantidad;
	}
	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}
	*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getClientId() {
		return clientId;
	}
	public void setClientId(long clientId) {
		this.clientId = clientId;
	}
	public long getTotalVenta() {
		return totalVenta;
	}
	public void setTotalVenta(long totalVenta) {
		this.totalVenta = totalVenta;
	}
	
	/*
	public long getValorIva() {
		return valorIva;
	}
	public void setValorIva(long valorIva) {
		this.valorIva = valorIva;
	}
	
	public long getValorVenta() {
		return valorVenta;
	}
	public void setValorVenta(long valorVenta) {
		this.valorVenta = valorVenta;
	}
	public long getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(long valorTotal) {
		this.valorTotal = valorTotal;
	}
	*/
	
	public Object[] getDetalleVenta() {
		return detalleVenta;
	}
	public void setDetalleVenta(Object[] detalleVenta) {
		this.detalleVenta = detalleVenta;
	}
	
		
}
