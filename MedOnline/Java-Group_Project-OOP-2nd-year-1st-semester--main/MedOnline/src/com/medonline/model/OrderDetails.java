package com.medonline.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="order_details")
public class OrderDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
private int id;
	@Column(name="product_id")
private int productId;
	@Column(name="quantity")
private int quantity;
	public OrderDetails(int id, int productId, int quantity) {
		super();
		this.id = id;
		this.productId = productId;
		this.quantity = quantity;
	}
	public OrderDetails() {
		super();
	}
	

}
