package com.flight.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class BookingEntity {
	private String name;
	private Integer flightid;
	private String mail;
	@Id
	private String  pnr;
	private Integer seatno;
	private String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getFlightid() {
		return flightid;
	}
	public void setFlightid(Integer flightid) {
		this.flightid = flightid;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPnr() {
		return pnr;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
	public Integer getSeatno() {
		return seatno;
	}
	public void setSeatno(Integer seatno) {
		this.seatno = seatno;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "BookingEntity [name=" + name + ", flightid=" + flightid + ", mail=" + mail + ", pnr=" + pnr
				+ ", seatno=" + seatno + ", gender=" + gender + "]";
	}
	
	
}
