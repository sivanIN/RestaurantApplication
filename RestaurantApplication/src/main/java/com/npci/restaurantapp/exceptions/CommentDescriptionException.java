package com.npci.restaurantapp.exceptions;

public class CommentDescriptionException extends RuntimeException {
	
public String message;

public CommentDescriptionException(String message) {
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
	return "CommentDescriptionException [message=" + message + "]";
}



}
