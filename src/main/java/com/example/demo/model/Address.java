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
	private long AddressID;
	
	@Column
	private int HouseNo;
	@Column
	private String Street;
	@Column
	private String City;
	@Column
	private int ZipCode;
	@Column
	private String State;
	@Column
	private String Country;
	
	
	public Address() {
		
	}


	public Address(long addressID, int houseNo, String street, String city, int zipCode, String state, String country) {
		super();
		AddressID = addressID;
		HouseNo = houseNo;
		Street = street;
		City = city;
		ZipCode = zipCode;
		State = state;
		Country = country;
	}


	public long getAddressID() {
		return AddressID;
	}


	public void setAddressID(long addressID) {
		AddressID = addressID;
	}


	public int getHouseNo() {
		return HouseNo;
	}


	public void setHouseNo(int houseNo) {
		HouseNo = houseNo;
	}


	public String getStreet() {
		return Street;
	}


	public void setStreet(String street) {
		Street = street;
	}


	public String getCity() {
		return City;
	}


	public void setCity(String city) {
		City = city;
	}


	public int getZipCode() {
		return ZipCode;
	}


	public void setZipCode(int zipCode) {
		ZipCode = zipCode;
	}


	public String getState() {
		return State;
	}


	public void setState(String state) {
		State = state;
	}


	public String getCountry() {
		return Country;
	}


	public void setCountry(String country) {
		Country = country;
	}
	
	
	
	
	
	
}
