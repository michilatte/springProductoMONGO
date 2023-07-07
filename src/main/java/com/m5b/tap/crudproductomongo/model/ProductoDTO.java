package com.m5b.tap.crudproductomongo.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "productos")
public class ProductoDTO {

	
	@Id
	private String _id;
	
	private String nombre;
	private Double precio;
	private LocalDate fecha_expiracion;

	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public LocalDate getFecha_expiracion() {
		return fecha_expiracion;
	}
	public void setFecha_expiracion(LocalDate fecha_expiracion) {
		this.fecha_expiracion = fecha_expiracion;
	}
	
}