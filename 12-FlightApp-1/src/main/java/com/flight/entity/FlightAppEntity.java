package com.flight.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.validation.constraints.NotBlank;
@Entity
@Table(name="flighttable")
public class FlightAppEntity {
	@Id
	////@NotBlank(message = "id is mandatory")
	@Column(name = "flight_id")
	private Integer flightid;

	@Column(name = "flight_name")
	private String flightname;
	@Column(name = "flight_from")
	private String from;
	@Column(name = "flight_to")
	private String to;
	public String getFlightname() {
		return flightname;
	}
	public void setFlightname(String flightname) {
		this.flightname = flightname;
	}
	public Integer getFlightid() {
		return flightid;
	}
	public void setFlightid(Integer flightid) {
		this.flightid = flightid;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	@Override
	public String toString() {
		return "FlightAppEntity [flightname=" + flightname + ", flightid=" + flightid + ", from=" + from + ", to=" + to
				+ "]";
	}
	
	
	

}
