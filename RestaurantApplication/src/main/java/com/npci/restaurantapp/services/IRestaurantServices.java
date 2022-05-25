package com.npci.restaurantapp.services;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import com.npci.restaurantapp.entity.Comment;
import com.npci.restaurantapp.entity.FoodItem;
import com.npci.restaurantapp.entity.Restaurant;

public interface IRestaurantServices {

	 Restaurant newRestaurant( Restaurant restaurant); 
	 
	 FoodItem newFoodItem(FoodItem fooditem) ;
//	 FoodItem reviseFoodItem( FoodItem fooditem) ;
	 
	 String cutoutFoodUtem( Integer ItemID ) ;
	 
	 Comment newComment( Comment comment);
	 
	 List<Comment>  Comments();

	List<Comment> Comments(Integer restID);
	 Stream<List<FoodItem>> getByfirstSNameOrCityOrStateOrPincode(String sName, String city, String state, Integer pincode);

	FoodItem updateFood(FoodItem fooditem);
			
			
			
			
		
			

}
