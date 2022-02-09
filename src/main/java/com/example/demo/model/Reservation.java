package com.example.demo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Reservation {

	@Id
	@GeneratedValue
	private long ReservationID ;
	@Column
	private Date Start_Date;
	@Column
	private Date End_Date ;
	@Column
	private boolean Isactive;
	@Column
	private int user_UserID;
	@Column
	private int admin_AdminSsn;
	@Column
	private int treehouse_TreehouseID;
	@Column
	private int payment_PaymentID;
	
	public Reservation()
	{
		
	}
	
	public Reservation(long reservationID, Date start_Date, Date end_Date, boolean isactive, int user_UserID,
			int admin_AdminSsn, int treehouse_TreehouseID, int payment_PaymentID) {
		super();
		ReservationID = reservationID;
		Start_Date = start_Date;
		End_Date = end_Date;
		Isactive = isactive;
		this.user_UserID = user_UserID;
		this.admin_AdminSsn = admin_AdminSsn;
		this.treehouse_TreehouseID = treehouse_TreehouseID;
		this.payment_PaymentID = payment_PaymentID;
	}
	public long getReservationID() {
		return ReservationID;
	}
	public void setReservationID(long reservationID) {
		ReservationID = reservationID;
	}
	public Date getStart_Date() {
		return Start_Date;
	}
	public void setStart_Date(Date start_Date) {
		Start_Date = start_Date;
	}
	public Date getEnd_Date() {
		return End_Date;
	}
	public void setEnd_Date(Date end_Date) {
		End_Date = end_Date;
	}
	public boolean isIsactive() {
		return Isactive;
	}
	public void setIsactive(boolean isactive) {
		Isactive = isactive;
	}
	public int getUser_UserID() {
		return user_UserID;
	}
	public void setUser_UserID(int user_UserID) {
		this.user_UserID = user_UserID;
	}
	public int getAdmin_AdminSsn() {
		return admin_AdminSsn;
	}
	public void setAdmin_AdminSsn(int admin_AdminSsn) {
		this.admin_AdminSsn = admin_AdminSsn;
	}
	public int getTreehouse_TreehouseID() {
		return treehouse_TreehouseID;
	}
	public void setTreehouse_TreehouseID(int treehouse_TreehouseID) {
		this.treehouse_TreehouseID = treehouse_TreehouseID;
	}
	public int getPayment_PaymentID() {
		return payment_PaymentID;
	}
	public void setPayment_PaymentID(int payment_PaymentID) {
		this.payment_PaymentID = payment_PaymentID;
	}
	
		
	
	
	
	
	
	
	
	
	
	
}
