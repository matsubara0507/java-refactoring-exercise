package com.eric4tw.pair1;

import java.math.BigDecimal;
//BAd Smell of Code..There should be no comments !! 
public class Order {
	private String description;
	private BigDecimal price;
	private int quantity;

	public Order(String description, double price, int quantity) {
		super();
		this.description = description;
		this.price = BigDecimal.valueOf(price);
		this.quantity = quantity;
	}
	
	public String getDescription() {
		return description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}
}
