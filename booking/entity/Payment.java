/**
 * 
 */
package com.flight.booking.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;




@Entity
@Table(name="Payment")
public class Payment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column  //Payment Transaction Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private int amount;
	
	@Column
	private String payment_method; // Cash/ Credit Card/ UPI / NetBanking etc
	
	@Column
	private String payment_gateway; // VISA/MASTER/BANKS/ GPAY etc
	
	@OneToOne
	@JoinColumn(name="BOOKING_ID")
	private Booking booking;
	
	public Payment() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getPayment_method() {
		return payment_method;
	}

	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}

	public String getPayment_gateway() {
		return payment_gateway;
	}

	public void setPayment_gateway(String payment_gateway) {
		this.payment_gateway = payment_gateway;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Payment [id=" + id + ", amount=" + amount + ", payment_method=" + payment_method + ", payment_gateway="
				+ payment_gateway + ", booking=" + booking + "]";
	}

}
