package com.lti.efarm.model;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bidder_personal_details")
public class User1 {
	@Id
	@Column(name = "bidder_id")
	private int bidder_id;
	
	@Column(name = "bemail_id")
	private String bemail_id;

	@Column(name = "bpassword")
	private String bpassword;

	public int getBidder_id() {
		return bidder_id;
	}

	public void setBidder_id(int bidder_id) {
		this.bidder_id = bidder_id;
	}

	public String getBemail_id() {
		return bemail_id;
	}

	public void setBemail_id(String bemail_id) {
		this.bemail_id = bemail_id;
	}

	public String getBpassword() {
		return bpassword;
	}

	public void setBpassword(String bpassword) {
		Base64.Encoder encoder=Base64.getEncoder();
		String normalString=bpassword;
		String encodedString=encoder.encodeToString(normalString.getBytes(StandardCharsets.UTF_8));
		this.bpassword=encodedString;
	}

	@Override
	public String toString() {
		return "User1 [bidder_id=" + bidder_id + ", bemail_id=" + bemail_id + ", bpassword=" + bpassword + "]";
	}
	
}
