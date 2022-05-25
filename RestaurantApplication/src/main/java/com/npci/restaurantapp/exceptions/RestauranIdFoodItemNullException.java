package com.npci.restaurantapp.exceptions;

public class RestauranIdFoodItemNullException extends RuntimeException{

	public String message;

	public RestauranIdFoodItemNullException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "RestauranIdFoodItemNullException [message=" + message + "]";
	}
	
}
