package com.npci.restaurantapp.exceptions;

public class FoodItemIdException extends RuntimeException {
	
	public String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "FoodItemIdException [message=" + message + "]";
	}

	public FoodItemIdException(String message) {
		super();
		this.message = message;
	}

	
	
	

}
