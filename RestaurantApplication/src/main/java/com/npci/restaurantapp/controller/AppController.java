package com.npci.restaurantapp.controller;

import java.util.List;

import javax.persistence.PostUpdate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.npci.restaurantapp.entity.Comment;
import com.npci.restaurantapp.entity.FoodItem;
import com.npci.restaurantapp.entity.Restaurant;
import com.npci.restaurantapp.services.IRestaurantServices;

@RestController
@RequestMapping("/resturent")
public class AppController {
	
	@Autowired
	IRestaurantServices irestaurantservices;
	
	@PostMapping("/newresturent")
	public ResponseEntity<Restaurant> newResturent(@RequestBody Restaurant restaurant) {
		
		Restaurant newRestaurant = irestaurantservices.newRestaurant(restaurant);
		
		return new ResponseEntity<>(newRestaurant,HttpStatus.CREATED);
		
	}
	
	@PostMapping("/newfooditem")
	public ResponseEntity<FoodItem> newFoodItem(@RequestBody FoodItem fooditem) {
		FoodItem newFoodItem = irestaurantservices.newFoodItem(fooditem);
        return new ResponseEntity<>(newFoodItem,HttpStatus.CREATED);
        
		
	}
	
//	@PutMapping("/reviseFoodItem")
//	public ResponseEntity<FoodItem> reviseFoodItem(@RequestBody FoodItem fooditem) {
//		
//		
////		return new ResponseEntity<>(changeUserDateOfBirth,HttpStatus.OK);
//		
//	}
	
	@DeleteMapping("/cutoutFoodUtem/{ItemID}")
	public  ResponseEntity<String> cutoutFoodUtem(@PathVariable(value="ItemID") Integer ItemID ) {
		String cutoutFoodItem = irestaurantservices.cutoutFoodUtem(ItemID);
		
		return new ResponseEntity<>(cutoutFoodItem,HttpStatus.NO_CONTENT);
		

	}
	
	
	@PostMapping("/newComment")
	public ResponseEntity<Comment> newComment(@RequestBody Comment comment) {
		Comment newComment = irestaurantservices.newComment(comment);
		return new ResponseEntity<>(newComment,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/Comments/{restID}")
	public ResponseEntity<List<Comment>> Comments(@PathVariable(value="restID") Integer restID){
		List<Comment> comments = irestaurantservices.Comments(restID);
		return new ResponseEntity<>(comments,HttpStatus.ACCEPTED);
		
		
		
	}
	

}
