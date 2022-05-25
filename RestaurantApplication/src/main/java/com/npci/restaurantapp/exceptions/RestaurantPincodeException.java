package com.npci.restaurantapp.exceptions;

public class RestaurantPincodeException extends RuntimeException{
	
	public String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public RestaurantPincodeException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "RestaurantPincodeException [message=" + message + "]";
	}
	

}
