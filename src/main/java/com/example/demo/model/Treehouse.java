package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Treehouse {
	@Id
	@GeneratedValue
	private long TreehouseID;
	
	
	@Column
	private String Name;
	@Column
	private int Size;
	@Column
	private String Description;
	@Column
	private String ImageUrl;
	@Column
	private int Price;
	
	// constructor
	
	public Treehouse(){
		
	}
	
	// constructor with parameters
	public Treehouse(String name, int size, String description, String imageUrl, int price) {
		super();
		Name = name;
		Size = size;
		Description = description;
		ImageUrl = imageUrl;
		Price = price;
		
	}
	
	
	// getters and setters 
	public long getTreehouseID() {
		return TreehouseID;
	}
	public void setTreehouseID(long treehouseID) {
		TreehouseID = treehouseID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	
	public int getSize() {
		return Size;
	}
	public void setSize(int size) {
		Size = size;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getImageUrl() {
		return ImageUrl;
	}
	public void setImageUrl(String imageUrl) {
		ImageUrl = imageUrl;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	
	
//	// one to one relationship with address
//	@OneToOne(fetch = FetchType.Lazy)
//	@JoinColumn(name = "address")
	
	
	
	
	
}
