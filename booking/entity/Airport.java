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
import javax.persistence.Table;

import lombok.Data;



//@Data
@Entity
@Table
public class Airport implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String name;
		
	@Column
	private String code;
	
	@Column
	private String state;
	
	public Airport() {
		// TODO Auto-generated constructor stub
	}

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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Airport [id=" + id + ", name=" + name + ", code=" + code + ", state=" + state + "]";
	}

}
