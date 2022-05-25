package com.npci.restaurantapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.npci.restaurantapp.entity.FoodItem;

public interface FoodItemDao extends JpaRepository<FoodItem, Integer>{

	public List<FoodItem> findByRestaurantId(Integer restaurantId);
}
