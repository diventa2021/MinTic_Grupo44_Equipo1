package com.spring.mongo.api.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Document(collection="db_productos")
public class Product {
	
    private int id;
    private String nombreProducto;
    private long nitProveedor;
    private long precioCompra;
    private long ivaCompra;
    private long precioVenta;
    private String sede;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(long precioVenta) {
		this.precioVenta = precioVenta;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public long getNitProveedor() {
		return nitProveedor;
	}
	public void setNitProveedor(long nitProveedor) {
		this.nitProveedor = nitProveedor;
	}
	public long getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(long precioCompra) {
		this.precioCompra = precioCompra;
	}
	public long getIvaCompra() {
		return ivaCompra;
	}
	public void setIvaCompra(long ivaCompra) {
		this.ivaCompra = ivaCompra;
	}
	public String getSede() {
		return sede;
	}
	public void setSede(String sede) {
		this.sede = sede;
	}

    
	
}
