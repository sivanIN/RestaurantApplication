package com.npci.restaurantapp.services;



import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.npci.restaurantapp.dao.CommentDao;
import com.npci.restaurantapp.dao.FoodItemDao;
import com.npci.restaurantapp.dao.RestaurantDao;
import com.npci.restaurantapp.entity.Comment;
import com.npci.restaurantapp.entity.FoodItem;
import com.npci.restaurantapp.entity.Restaurant;
import com.npci.restaurantapp.exceptions.CommentDescriptionException;
import com.npci.restaurantapp.exceptions.FoodItemIdException;
import com.npci.restaurantapp.exceptions.FoodItemNullException;
import com.npci.restaurantapp.exceptions.RestaurantCommentException;
import com.npci.restaurantapp.exceptions.RestaurantPincodeException;

@Service
public class RestaurantServices implements IRestaurantServices{
	
	@Autowired
	RestaurantDao restaurantdao;
	@Autowired
	FoodItemDao foodItemdao;
	@Autowired
	CommentDao commentdao;

	Logger LOGGER=LoggerFactory.getLogger(RestaurantServices.class);
	
	@Override
	public Restaurant newRestaurant(Restaurant restaurant) {
		String Pincocoderegx="^[0-9]{1,6}$";
		Integer pincode = restaurant.getPincode();
		if(String.valueOf(pincode).matches(Pincocoderegx)) {
			throw new RestaurantPincodeException("Pincode Should be six Digit");
		}
		Restaurant newRestaurant = restaurantdao.save(restaurant);
		LOGGER.info("Resturent detail:{}",newRestaurant);
		return newRestaurant;
	}

	@Override
	public FoodItem newFoodItem(FoodItem fooditem) {
		if(fooditem.getItemType()==null) {
			throw new FoodItemNullException("FoodItem type is null ");
		}
		FoodItem Fooditem = foodItemdao.save(fooditem);
		LOGGER.info("FoodItem detail:{}",Fooditem);
		return Fooditem;
	}



	@Override
	public String cutoutFoodUtem(Integer ItemID) {
		LOGGER.info("ItemId :{}",ItemID);
		Optional<FoodItem> FoodItem = foodItemdao.findById(ItemID);
		if(!FoodItem.isPresent()) {
			throw new FoodItemIdException("There is no Food Item with ItemID:"+ItemID);
		}
		
		foodItemdao.deleteById(ItemID);
		return "Food Item with ID:" + ItemID +"  deleted Successfully";
	}


	

	public Comment newComment(@RequestBody Comment comment) {
		
		if(comment.getComments()== null) {
			throw new CommentDescriptionException("Comment Field is Empty");
			
		}
		Comment commentsave = commentdao.save(comment);
		LOGGER.info("Comment saved in table is:{}",commentsave);
		return commentsave;
		
	}

	@Override
	public List<Comment> Comments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comment> Comments(Integer restID) {
		LOGGER.info("Resturent ID :{}",restID);
		List<Comment> findByRestaurantIdOrderByCIdAsc = commentdao.findByRestaurantIdOrderByCIdDesc(restID);
		if(findByRestaurantIdOrderByCIdAsc.isEmpty()) {
			throw new RestaurantCommentException("The is no comment for this restaurant id:"+restID);
		}
		LOGGER.info("Comment for Resturent ID {}",findByRestaurantIdOrderByCIdAsc);
		return findByRestaurantIdOrderByCIdAsc;
	}



	

	

	
	

	
	
	
}
