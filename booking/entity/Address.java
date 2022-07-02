/**
 * 
 */
package com.flight.booking.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

/**
 *
 * 
 ####################################################################################
 * ########### This Class intends to store address of all users #####################
 * ####################################################################################
 *
 */
//@Data
@Entity
@Table(name = "ADDRESS")
public class Address implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String street1;
	
	@Column
	private String street2;
	
	@Column
	private String city;
	
	@Column
	private String pinCode;
	
	@Column
	private String state;
	
	@Column
	private String country;
	
	@OneToOne
	@JoinColumn(name="BOOKING_ID")
	private Booking booking;
	
	@ManyToOne
	@JoinColumn(name="APP_USER_ID")
	private AppUser appUser;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStreet1() {
		return street1;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	public String getStreet2() {
		return street2;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
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

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public AppUser getAppUser() {
		return appUser;
	}

	public void setAppUser(AppUser appUser) {
		this.appUser = appUser;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", street1=" + street1 + ", street2=" + street2 + ", city=" + city + ", pinCode="
				+ pinCode + ", state=" + state + ", country=" + country + ", booking=" + booking + ", appUser="
				+ appUser + "]";
	}


}
