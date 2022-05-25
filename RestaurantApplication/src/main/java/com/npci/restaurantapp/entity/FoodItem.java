package com.npci.restaurantapp.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class FoodItem {
	
	@Id
	@Column(name="ItemId")
	Integer itemId;
	
	@Column(name="RestaurantId")
	Integer restaurantId;
	
	
	@Column(name="ItemType")
	String itemType;
	
	@Column(name="Description")
	String description;

	public FoodItem(Integer itemId, Integer restaurantId, String itemType, String description) {
		super();
		this.itemId = itemId;
		this.restaurantId = restaurantId;
		this.itemType = itemType;
		this.description = description;
	}

	public FoodItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Integer getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "FoodItem [itemId=" + itemId + ", restaurantId=" + restaurantId + ", itemType=" + itemType
				+ ", description=" + description + "]";
	}
	
	
}