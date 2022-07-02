package com.flight.booking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
//@Data
@Table(name="Airline")
public class Airline {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private String code;
	
	@Column
	private String operationType;  //Domestic / International
	
	@Column
	private String country;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getOperationType() {
		return operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Airline [id=" + id + ", name=" + name + ", code=" + code + ", operationType=" + operationType
				+ ", country=" + country + "]";
	}
	
}
