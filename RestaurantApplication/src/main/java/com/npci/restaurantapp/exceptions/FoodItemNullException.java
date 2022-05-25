package com.npci.restaurantapp.exceptions;

public class FoodItemNullException extends RuntimeException{
	
	public String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public FoodItemNullException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "FoodItemNullException [message=" + message + "]";
	}
	
	

}
