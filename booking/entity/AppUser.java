package com.flight.booking.entity;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;


/**
 *
 * 
 * ####################################################################################
 * ########### THIS CLASS INTENDS TO STORE APP USER DATA ################# 
 * ####################################################################################
 */


@Entity
@Table(name = "APP_USER")
public class AppUser implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;	
	
	@Column(name="EMAIL_ID")
	private String email;
	
	@Column(name="MOBILE_NO")
	private String mobileNo;
	
	@Column(name="USER_DOB")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;	
	
	@Column
	private String imageUrl;
	
    @Lob
    @Column(name = "pic")
    private byte[] pic;
	
	@Column(name="pwd")
	private String password;
	
	@Column(name="flag")
	private Boolean activeFlag;
	
	@Column
	@DateTimeFormat(pattern = "dd-MMM-yyyy")
	@Temporal(TemporalType.DATE)
	private Date joiningDate;
	
	@Column
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date releaseDate;
	
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	@JoinTable(name="APP_USER_ROLES",
			joinColumns = {
		            @JoinColumn(name = "app_user_id", referencedColumnName = "id")
		        },
		        inverseJoinColumns = {
		            @JoinColumn(name = "role_id", referencedColumnName = "id")
		        })
	public List<Role> roles;
	
	

	public AppUser(String firstName, String lastName) {
		
	}


	public AppUser(String firstName, String lastName, String imageUrl) {
		firstName = this.firstName;
		lastName = this.lastName;
		imageUrl = this.lastName;
	}


	/**
	 * @param id2
	 * @param email2
	 * @param compressBytes
	 */
	public AppUser(Long id2, String email2, byte[] compressBytes) {
		this.id=id2;
		this.email = email2;
		this.pic=compressBytes;
	}


	public AppUser() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}


	public Date getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getImageUrl() {
		return imageUrl;
	}


	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}


	public byte[] getPic() {
		return pic;
	}


	public void setPic(byte[] pic) {
		this.pic = pic;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Boolean getActiveFlag() {
		return activeFlag;
	}


	public void setActiveFlag(Boolean activeFlag) {
		this.activeFlag = activeFlag;
	}


	public Date getJoiningDate() {
		return joiningDate;
	}


	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}


	public Date getReleaseDate() {
		return releaseDate;
	}


	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}


	public List<Role> getRoles() {
		return roles;
	}


	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "AppUser [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", mobileNo=" + mobileNo + ", dateOfBirth=" + dateOfBirth + ", imageUrl=" + imageUrl + ", pic="
				+ Arrays.toString(pic) + ", password=" + password + ", activeFlag=" + activeFlag + ", joiningDate="
				+ joiningDate + ", releaseDate=" + releaseDate + ", roles=" + roles + "]";
	}
	
	


}
