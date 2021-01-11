package com.app.mindbowser.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "manager")
public class Manager {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer managerid;
	@Column(name="firstname")
	private String firstName;
	@Column(name="lasttname")
	private String lastName;
	@Column(name="password")
	private String password;
	@Column(name="email")
	private String email;
	@Column(name="address")
	private String address;
	@Column(name="dob")
	private String dob;
	@Column(name="mobile")
	private String mobile;
	@Column(name="city")
	private String city;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(Integer managerid, String firstName,  String lastName,  String password,
			String email, String address, String dob, String mobile, String city) {
		super();
		this.managerid = managerid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
		this.address = address;
		this.dob = dob;
		this.mobile = mobile;
		this.city = city;
	}

	

	public Integer getManagerid() {
		return managerid;
	}

	public void setManagerid(Integer managerid) {
		this.managerid = managerid;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Manager [managerid=" + managerid + ", firstName=" + firstName + ", lastName=" + lastName + ", password="
				+ password + ", email=" + email + ", address=" + address + ", dob=" + dob + ", mobile=" + mobile
				+ ", city=" + city + "]";
	}

}
