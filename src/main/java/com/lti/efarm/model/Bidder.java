package com.lti.efarm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="bidder_personal_details")
public class Bidder {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="bidid_generator")
	@SequenceGenerator(name="bidid_generator",sequenceName="bidder_details100",allocationSize=1)
	@PrimaryKeyJoinColumn
	private int bidder_id;

	@Column(name="bfullname")
	private String bfullname;

	@Column(name="bcontact")
	private long   bcontact; 

	@Column(name="bemail_id")
	private String bemail_id;

	@Column(name="bhouse_no")
	private String bhouse_no;

	@Column(name="bcity")
	private String bcity;

	@Column(name="bstate")
	private String bstate;

	@Column(name="bcountry")
	private String bcountry;

	@Column(name="bpin_code")
	private int bpin_code; 

	@Column(name="bpassword")
	private String bpassword;

	public int getBidder_id() {
		return bidder_id;
	}

	public void setBidder_id(int bidder_id) {
		this.bidder_id = bidder_id;
	}

	public String getBfullname() {
		return bfullname;
	}

	public void setBfullname(String bfullname) {
		this.bfullname = bfullname;
	}

	public long getBcontact() {
		return bcontact;
	}

	public void setBcontact(long bcontact) {
		this.bcontact = bcontact;
	}

	public String getBemail_id() {
		return bemail_id;
	}

	public void setBemail_id(String bemail_id) {
		this.bemail_id = bemail_id;
	}

	public String getBhouse_no() {
		return bhouse_no;
	}

	public void setBhouse_no(String bhouse_no) {
		this.bhouse_no = bhouse_no;
	}

	public String getBcity() {
		return bcity;
	}

	public void setBcity(String bcity) {
		this.bcity = bcity;
	}

	public String getBstate() {
		return bstate;
	}

	public void setBstate(String bstate) {
		this.bstate = bstate;
	}

	public String getBcountry() {
		return bcountry;
	}

	public void setBcountry(String bcountry) {
		this.bcountry = bcountry;
	}

	public int getBpin_code() {
		return bpin_code;
	}

	public void setBpin_code(int bpin_code) {
		this.bpin_code = bpin_code;
	}

	public String getBpassword() {
		return bpassword;
	}

	public void setBpassword(String bpassword) {
		this.bpassword = bpassword;
	}

	@Override
	public String toString() {
		return "Bidder [bidder_id=" + bidder_id + ", bfullname=" + bfullname + ", bcontact=" + bcontact + ", bemail_id="
				+ bemail_id + ", bhouse_no=" + bhouse_no + ", bcity=" + bcity + ", bstate=" + bstate + ", bcountry="
				+ bcountry + ", bpin_code=" + bpin_code + ", bpassword=" + bpassword + "]";
	}
	
	

	

}
