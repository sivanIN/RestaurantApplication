package com.npci.restaurantapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Restaurant {

	@Id
	@Column(name="RestaurantId")
	Integer restaurantId;
	
	@Column(name="DoorNo")
	Integer doorNo;
	
	@Column(name="StreetName")
	String sName;
	
	@Column(name="City")
	String city;
	
	@Column(name="State")
	String state;
	
	@Column(name="Pincode")
	Integer pincode;

	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Restaurant(Integer restaurantId, Integer doorNo, String sName, String city, String state, Integer pincode) {
		super();
		this.restaurantId = restaurantId;
		this.doorNo = doorNo;
		this.sName = sName;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public Integer getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
	}

	public Integer getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(Integer doorNo) {
		this.doorNo = doorNo;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", doorNo=" + doorNo + ", sName=" + sName + ", city=" + city
				+ ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	
	
}