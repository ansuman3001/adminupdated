package com.lti.efarm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="final_bidding")
public class FinalBidding
{
     
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bid_id;
	
	
	@Column(name="bidder_name")
	private String bidder_name;

	@Override
	public String toString() {
		return "FinalBidding [bidder_name=" + bidder_name + ", bidder_city=" + bidder_city + ", bidder_phone="
				+ bidder_phone + ", current_bid=" + current_bid + ", bid_amount=" + bid_amount + "]";
	}

	public String getBidder_name() {
		return bidder_name;
	}

	public void setBidder_name(String bidder_name) {
		this.bidder_name = bidder_name;
	}

	public String getBidder_city() {
		return bidder_city;
	}

	public void setBidder_city(String bidder_city) {
		this.bidder_city = bidder_city;
	}

	public String getBidder_phone() {
		return bidder_phone;
	}

	public void setBidder_phone(String bidder_phone) {
		this.bidder_phone = bidder_phone;
	}

	public String getCurrent_bid() {
		return current_bid;
	}

	public void setCurrent_bid(String current_bid) {
		this.current_bid = current_bid;
	}

	public String getBid_amount() {
		return bid_amount;
	}

	public void setBid_amount(String bid_amount) {
		this.bid_amount = bid_amount;
	}

	@Column(name="bidder_city")
	private String bidder_city;
	
	@Column(name="bidder_phone")
	private String bidder_phone;
	
	@Column(name="current_bid")
	private String current_bid;
	
	@Column(name="bid_amount")
	private String bid_amount;
	

}
