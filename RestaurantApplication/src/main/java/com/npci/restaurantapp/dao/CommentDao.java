package com.npci.restaurantapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.npci.restaurantapp.entity.Comment;

public interface CommentDao extends JpaRepository<Comment, Integer> {

}
