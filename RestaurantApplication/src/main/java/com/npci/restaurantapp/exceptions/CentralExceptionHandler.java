package com.npci.restaurantapp.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;





@RestControllerAdvice
@ResponseStatus
public class CentralExceptionHandler {
	
	Logger LOGGER=LoggerFactory.getLogger(CentralExceptionHandler.class);
	
	
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(CommentDescriptionException.class)
	public String CommentDescriptionException(CommentDescriptionException e) {
		LOGGER.error("Error:{}",e.getMessage());
		return e.getMessage();
		
	}
	
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(FoodItemIdException.class)
	public String FoodItemIdException(FoodItemIdException e) {
		LOGGER.error("Error:{}",e.getMessage());
		return e.getMessage();
	}
	
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(FoodItemNullException.class)
	public String FoodItemNullException(FoodItemNullException e) {
		LOGGER.error("Error:{}",e.getMessage());
		return e.getMessage();
	}
	
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(RestaurantCommentException.class)
	public String RestaurantCommentException(RestaurantCommentException e) {
		LOGGER.error("Error:{}",e.getMessage());
		return e.getMessage();
	}
	
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(RestaurantPincodeException.class)
	public String RestaurantPincodeException(RestaurantPincodeException e) {
		LOGGER.error("Error:{}",e.getMessage());
		return e.getMessage();
	}
	
	

}
