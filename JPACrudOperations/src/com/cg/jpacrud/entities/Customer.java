package com.cg.jpacrud.entities;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name="customer_tab")
@NamedQueries(@NamedQuery(name = "getAllCustomer",query="SELECT customer FROM Customer customer"))
public class Customer {

	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id")
	private int custId;
	
	@Column( name="cust_name")
	private String cusName;
	
	@Column( name="cust_mob")
	private String mobile;
	
	@Column( name="cust_email")
	private String email;
	
	@Column( name="cust_dob")
	private  String dob;

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String date) {
		this.dob = date;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", cusName=" + cusName
				+ ", mobile=" + mobile + ", email=" + email + ", dob=" + dob
				+ "]";
	}


	} 
	

