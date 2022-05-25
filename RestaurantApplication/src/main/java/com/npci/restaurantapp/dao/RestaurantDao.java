package com.npci.restaurantapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.npci.restaurantapp.entity.Restaurant;

public interface RestaurantDao extends JpaRepository<Restaurant, Integer> {

}
