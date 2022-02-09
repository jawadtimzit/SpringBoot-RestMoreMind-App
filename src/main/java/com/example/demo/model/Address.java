package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Address {
	
	@Id
	@GeneratedValue
	private long address_id;
	
	@Column
	private int house_no;
	@Column
	private String street;
	@Column
	private String city;
	@Column
	private int zip_code;
	@Column
	private String state;
	@Column
	private String country;
	@Column
	private boolean isactive;
	
	
	public Address() {
		
	}


	public Address(long address_id, int house_no, String street, String city, int zip_code, String state, String country, boolean isactive) {
		super();
		address_id = this.address_id;
		house_no = this.house_no;
		street = this.street;
		city = this.city;
		zip_code = this.zip_code;
		state = this.state;
		country = this.country;
		isactive = this.isactive;
	}


	public long getAddress_id() {
		return address_id;
	}


	public void setAddress_id(long address_id) {
		this.address_id = address_id;
	}


	public int getHouse_no() {
		return house_no;
	}


	public void setHouse_no(int house_no) {
		this.house_no = house_no;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public int getZip_code() {
		return zip_code;
	}


	public void setZip_code(int zip_code) {
		this.zip_code = zip_code;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public boolean isIsactive() {
		return isactive;
	}


	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}


	


	
	
	
	
	
	
	
}
