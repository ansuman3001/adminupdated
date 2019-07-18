package com.lti.efarm.model;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "farmer_personal_details")
public class User {
	
	@Id
	@Column(name = "farmer_id")
	private int farmer_id;

	@Column(name = "email_id")
	private String email_id;

	@Column(name = "password")
	private String password;

	public int getFarmer_id() {
		return farmer_id;
	}

	public void setFarmer_id(int farmer_id) {
		this.farmer_id = farmer_id;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		Base64.Encoder encoder=Base64.getEncoder();
		String normalString=password;
		String encodedString=encoder.encodeToString(normalString.getBytes(StandardCharsets.UTF_8));
		this.password=encodedString;
	}

	@Override
	public String toString() {
		return "User [farmer_id=" + farmer_id + ", email_id=" + email_id + ", password=" + password + "]";
	}
	
	
	

}
