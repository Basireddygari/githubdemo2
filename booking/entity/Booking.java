/**
 * 
 */
package com.flight.booking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table

public class Booking{

	
	
	@Id
	@Column  //Booking PNR no
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long pnr_id;  
	
	@Column
	private String status; // Pending/Booked/Cancelled
	
	@Column
	private Integer noOfSeatsBooked;
	
	@ManyToOne
	@JoinColumn(name="APP_USER_ID")
	private AppUser appUser;
		
	@OneToOne
	@JoinColumn(name="FLIGHT_ID") // Booked Flight 
	private Flights flight;
	
	public Booking() {
		// TODO Auto-generated constructor stub
	}

	public Long getPnr_id() {
		return pnr_id;
	}

	public void setPnr_id(Long pnr_id) {
		this.pnr_id = pnr_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getNoOfSeatsBooked() {
		return noOfSeatsBooked;
	}

	public void setNoOfSeatsBooked(Integer noOfSeatsBooked) {
		this.noOfSeatsBooked = noOfSeatsBooked;
	}

	public AppUser getAppUser() {
		return appUser;
	}

	public void setAppUser(AppUser appUser) {
		this.appUser = appUser;
	}

	public Flights getFlight() {
		return flight;
	}

	public void setFlight(Flights flight) {
		this.flight = flight;
	}

	@Override
	public String toString() {
		return "Booking [pnr_id=" + pnr_id + ", status=" + status + ", noOfSeatsBooked=" + noOfSeatsBooked
				+ ", appUser=" + appUser + ", flight=" + flight + "]";
	}

}
