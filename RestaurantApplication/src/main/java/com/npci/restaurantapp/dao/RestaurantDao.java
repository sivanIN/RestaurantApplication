package com.npci.restaurantapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.npci.restaurantapp.entity.Restaurant;

public interface RestaurantDao extends JpaRepository<Restaurant, Integer> {

	public List<Restaurant> findBysNameOrCityOrStateOrPincode(String sName, String city,String state,Integer pincode);
}
