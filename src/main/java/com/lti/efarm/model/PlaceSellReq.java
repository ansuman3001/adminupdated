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
@Table(name="place_sell_req")
public class PlaceSellReq {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="SellReq_generator")
	@SequenceGenerator(name="SellReq_generator",sequenceName="sell_req_details100",allocationSize=1)
	private int req_id;
	
	@Column(name="crop_type")
	private String crop_type;
	
	@Column(name="crop_name")
	private String crop_name;
	
	@Column(name="fertilizer_type")
	private String fertilizer_type;
	
	@Column(name="Quantity")
	private long Quantity;

	public int getReq_id() {
		return req_id;
	}

	public void setReq_id(int req_id) {
		this.req_id = req_id;
	}

	public String getCrop_type() {
		return crop_type;
	}

	public void setCrop_type(String crop_type) {
		this.crop_type = crop_type;
	}

	public String getCrop_name() {
		return crop_name;
	}

	public void setCrop_name(String crop_name) {
		this.crop_name = crop_name;
	}

	public String getFertilizer_type() {
		return fertilizer_type;
	}

	public void setFertilizer_type(String fertilizer_type) {
		this.fertilizer_type = fertilizer_type;
	}

	public long getQuantity() {
		return Quantity;
	}

	public void setQuantity(long quantity) {
		Quantity = quantity;
	}

	@Override
	public String toString() {
		return "PlaceSellReq [req_id=" + req_id + ", crop_type=" + crop_type + ", crop_name=" + crop_name
				+ ", fertilizer_type=" + fertilizer_type + ", Quantity=" + Quantity + "]";
	} 
	
	
	
	

}
