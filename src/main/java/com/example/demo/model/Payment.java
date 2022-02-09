package com.example.demo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Payment {
	@Id
	@GeneratedValue
   private Long PaymentID;
	@Column
   private Date Pay_Date;
	@Column
   private int Amount;
	@Column
   private boolean Isactive;
   
   
   
	public Payment(){}
public Payment(Long paymentID, Date pay_Date, int amount, boolean isactive) {
		super();
		PaymentID = paymentID;
		Pay_Date = pay_Date;
		Amount = amount;
		Isactive = isactive;
	}
//public Payment(Long PaymentID, Date Pay_Date, int Amount, boolean Isactive) {
//	super();
//	this.PaymentID = PaymentID;
//	this.Pay_Date = Pay_Date;
//	this.Amount = Amount;
//	this.Isactive = Isactive;
//}
public Long getPaymentID() {
	return PaymentID;
}
public void setPaymentID(Long paymentID) {
	PaymentID = paymentID;
}
public Date getPay_Date() {
	return Pay_Date;
}
public void setPay_Date(Date pay_Date) {
	Pay_Date = pay_Date;
}
public int getAmount() {
	return Amount;
}
public void setAmount(int amount) {
	Amount = amount;
}
public boolean isIsactive() {
	return Isactive;
}
public void setIsactive(boolean isactive) {
	Isactive = isactive;
}
}
