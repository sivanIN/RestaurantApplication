package com.npci.restaurantapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table

public class Comment {
	
	@Id
	@Column(name="CommentId")
	Integer CId;
	
	@Column(name="Comments")
	String comments;
	
	@Column(name="RestaurantId")
	Integer restaurantId;

	public Comment(Integer cId, String comments, Integer restaurantId) {
		super();
		this.CId = cId;
		this.comments = comments;
		this.restaurantId = restaurantId;
	}

	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getcId() {
		return CId;
	}

	public void setcId(Integer cId) {
		this.CId = cId;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Integer getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
	}

	@Override
	public String toString() {
		return "Comment [cId=" + CId + ", comments=" + comments + ", restaurantId=" + restaurantId + "]";
	}
	
	
}