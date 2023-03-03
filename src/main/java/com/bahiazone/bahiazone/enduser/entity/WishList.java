package com.bahiazone.bahiazone.enduser.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "wishList")
public class WishList {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="wishlistId")
	private int wishlistId;
	
	@Column(name="productId")
	private int productId;
	
	@Column(name="userId")
	private int userId;
	
	@Column(name="quantity")
	private int quantity;
	
	
}