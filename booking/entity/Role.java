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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * 
 * ####################################################################################
 * ########### THIS CLASS INTENDS TO DEFINE USER TYPE EG. REGISTERED , UNREGISTERED ### 
 * ####################################################################################
 *
 */



@Entity
@Table(name = "ROLE_TYPES")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Role implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name="role_name")
	private String roleName;
	
	@Column(name="role_desc")
	private String roleDesc;	
	
	@Column
	private Boolean activeFlag;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDesc() {
		return roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	public Boolean getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(Boolean activeFlag) {
		this.activeFlag = activeFlag;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", roleName=" + roleName + ", roleDesc=" + roleDesc + ", activeFlag=" + activeFlag
				+ "]";
	}	
	
	

}
