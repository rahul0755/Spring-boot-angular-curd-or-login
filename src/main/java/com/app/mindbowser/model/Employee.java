package com.app.mindbowser.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer empid;
	private String empfirstname;
	private String emplastname;
	private String empaddress;
	private String dob;
	private String mobile;
	private String city;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(Integer empid, String empfirstname, String emplastname, String empaddress, String dob, String mobile,
			String city) {
		super();
		this.empid = empid;
		this.empfirstname = empfirstname;
		this.emplastname = emplastname;
		this.empaddress = empaddress;
		this.dob = dob;
		this.mobile = mobile;
		this.city = city;
	}


	public Integer getEmpid() {
		return empid;
	}


	public void setEmpid(Integer empid) {
		this.empid = empid;
	}


	public String getEmpfirstname() {
		return empfirstname;
	}


	public void setEmpfirstname(String empfirstname) {
		this.empfirstname = empfirstname;
	}


	public String getEmplastname() {
		return emplastname;
	}


	public void setEmplastname(String emplastname) {
		this.emplastname = emplastname;
	}


	public String getEmpaddress() {
		return empaddress;
	}


	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
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
		return "Employee [empid=" + empid + ", empfirstname=" + empfirstname + ", emplastname=" + emplastname
				+ ", empaddress=" + empaddress + ", dob=" + dob + ", mobile=" + mobile + ", city=" + city + "]";
	}
	
	
	
}
