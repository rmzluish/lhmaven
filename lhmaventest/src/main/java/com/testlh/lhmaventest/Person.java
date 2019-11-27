package com.testlh.lhmaventest;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;

@Entity
@Table(name="cat_person")
public class Person {

	@Id
	@Column(name="id_person")
	private int id;
	private int age;
	private PersonFullName name;
	
	@OneToMany
	private List<Laptop> laptop =  new ArrayList<Laptop>();

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public PersonFullName getName() {
		return name;
	}
	public void setName(PersonFullName name) {
		this.name = name;
	}
	
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
	
}
