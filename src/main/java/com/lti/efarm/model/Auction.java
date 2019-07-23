
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
@Table(name="auction_details")
public class Auction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="auctionid_generator")
	@SequenceGenerator(name="auctionid_generator",sequenceName="auction_details100",allocationSize=1)
	@PrimaryKeyJoinColumn
	private int auction_id;
	
	@Column(name="biddername")
	private String biddername;
	
	@Column(name="biddercity")
	private String biddercity;
	
	@Column(name="bidderphone")
	private long bidderphone;
	
	@Column(name="currentbid")
	private long currentbid;
	
	@Column(name="bidamount")
	private long bidamount;

	public int getAuction_id() {
		return auction_id;
	}

	public void setAuction_id(int auction_id) {
		this.auction_id = auction_id;
	}

	public String getBiddername() {
		return biddername;
	}

	public void setBiddername(String biddername) {
		this.biddername = biddername;
	}

	public String getBiddercity() {
		return biddercity;
	}

	public void setBiddercity(String biddercity) {
		this.biddercity = biddercity;
	}

	

	public long getBidderphone() {
		return bidderphone;
	}

	public void setBidderphone(long bidderphone) {
		this.bidderphone = bidderphone;
	}

	public long getCurrentbid() {
		return currentbid;
	}

	public void setCurrentbid(long currentbid) {
		this.currentbid = currentbid;
	}

	public long getBidamount() {
		return bidamount;
	}

	public void setBidamount(long bidamount) {
		this.bidamount = bidamount;
	}

	@Override
	public String toString() {
		return "Auction [auction_id=" + auction_id + ", biddername=" + biddername + ", biddercity=" + biddercity
				+ ", bidderphone=" + bidderphone + ", currentbid=" + currentbid + ", bidamount=" + bidamount + "]";
	}


	
}
