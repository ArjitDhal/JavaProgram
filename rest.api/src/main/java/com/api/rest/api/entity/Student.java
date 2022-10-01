package com.api.rest.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Student {
	
	 @Column(name = "Student_Name")
	private String name;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String city;
	@Column(name="State_Name")
	private String State;
	 

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	 

	public Student(String name, int id, String city, String state) {
		super();
		this.name = name;
		this.id = id;
		city = city;
		State = state;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
		
	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", city=" + city + "]";
	}
	 
	
		

}
