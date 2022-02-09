package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class User {
	
	
	@Id
	@GeneratedValue
	private long UserID;
	@Column
	private String email;
	@Column
	private String fname;
	@Column
	private String lname;
	@Column
	private int password;
	@Column
	private Integer phone;
	@Column
	private int credit_card;
	@Column
	private String email_confirmed;
	@Column
	private boolean isactive;
	
	public User()
	{
		
	}
	
	public User(long userID, String email, String fname, String lname, int password, Integer phone, int credit_card,
			String email_confirmed, boolean isactive) {
		super();
		this.UserID = userID;
		this.email = email;
		this.fname = fname;
		this.lname = lname;
		this.password = password;
		this.phone = phone;
		this.credit_card = credit_card;
		this.email_confirmed = email_confirmed;
		this.isactive = isactive;
	}
	public long getUserID() {
		return UserID;
	}
	public void setUserID(long userID) {
		UserID = userID;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public Integer getPhone() {
		return phone;
	}
	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	public int getCredit_card() {
		return credit_card;
	}
	public void setCredit_card(int credit_card) {
		this.credit_card = credit_card;
	}
	public String getEmail_confirmed() {
		return email_confirmed;
	}
	public void setEmail_confirmed(String email_confirmed) {
		this.email_confirmed = email_confirmed;
	}
	public boolean isIsactive() {
		return isactive;
	}
	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}
	
	
	
	

	

	
	
	
	

}
