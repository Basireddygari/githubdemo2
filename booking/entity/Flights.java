package com.flight.booking.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;


@Entity
@Table(name="Flights")
public class Flights implements Serializable {
	
private static final long serialVersionUID = 1L;
	

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String origin;
	
	@Column
	private String destination;
	
	@Column	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="dd-MM-yyyy")
	private Date dateOfFlight;	
	
	@Column
	private int noOfSeats;
	
	@Column
	private int price;
	
	@Column	
	private String timeOfFlight;
	
	@Column
	private String remarks;
	
	@ManyToOne
	@JoinColumn
	private Airline airline;	

	public Flights() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getDateOfFlight() {
		return dateOfFlight;
	}

	public void setDateOfFlight(Date dateOfFlight) {
		this.dateOfFlight = dateOfFlight;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getTimeOfFlight() {
		return timeOfFlight;
	}

	public void setTimeOfFlight(String timeOfFlight) {
		this.timeOfFlight = timeOfFlight;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Airline getAirline() {
		return airline;
	}

	public void setAirline(Airline airline) {
		this.airline = airline;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Flights [id=" + id + ", origin=" + origin + ", destination=" + destination + ", dateOfFlight="
				+ dateOfFlight + ", noOfSeats=" + noOfSeats + ", price=" + price + ", timeOfFlight=" + timeOfFlight
				+ ", remarks=" + remarks + ", airline=" + airline + "]";
	}

}
