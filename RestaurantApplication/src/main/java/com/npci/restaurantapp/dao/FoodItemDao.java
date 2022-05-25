package com.npci.restaurantapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.npci.restaurantapp.entity.FoodItem;

public interface FoodItemDao extends JpaRepository<FoodItem, Integer>{

}
