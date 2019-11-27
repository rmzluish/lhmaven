package com.testlh.lhmaventest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cat_laptop")  
public class Laptop {

	@Id
	@Column(name="id_laptop")
	private int idLaptop;
	private String brand;
	private String descripcion;

	public int getIdLaptop() {
		return idLaptop;
	}
	public void setIdLaptop(int idLaptop) {
		this.idLaptop = idLaptop;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
			
}
