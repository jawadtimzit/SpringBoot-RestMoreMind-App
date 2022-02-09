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
	private String name;
	@Column
	private int size;
	@Column
	private String description;
	@Column
	private String image_url;
	@Column
	private int price;
	@Column
	private boolean isactive;
	
	// constructor
	
	public Treehouse(){
		
	}
	
	// constructor with parameters
	public Treehouse(String name, int size, String description, String image_url, int price, boolean isactive) {
		super();
		name = this.name;
		size = this.size;
		description = this.description;
		image_url = this.image_url;
		price = this.price;
		isactive = this.isactive;
		
	}

	public long getTreehouse_id() {
		return TreehouseID;
	}

	public void setTreehouse_id(long treehouse_id) {
		this.TreehouseID = treehouse_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}

	
	
	
	
	
	
	// getters and setters 
	
	
	
//	// one to one relationship with address
//	@OneToOne(fetch = FetchType.Lazy)
//	@JoinColumn(name = "address")
	
	
	
	
	
}
