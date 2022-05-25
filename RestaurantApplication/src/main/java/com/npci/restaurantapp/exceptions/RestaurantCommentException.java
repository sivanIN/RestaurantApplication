package com.npci.restaurantapp.exceptions;

public class RestaurantCommentException extends RuntimeException{
	
	public String message;

	public RestaurantCommentException(String message) {
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
		return "RestaurantCommentException [message=" + message + "]";
	}
	
	

}
