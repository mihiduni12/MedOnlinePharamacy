package com.medonline.model;

import java.util.Date;
import java.util.List;


import javax.persistence.CascadeType;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToMany;


import javax.persistence.Table;

@Entity
@Table(name="order")
public class Order {
	public Order() {
		super();
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
private int id;
	@Column(name="order_date")
private Date orderDate;
	@Column(name="delivery_date")
private Date deliveryDate;
	@Column(name="customer_id")
private int customerId;
	@Column(name="status")
private int status;
	@Column(name="amount")
private double amount;

	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name="order_id")
	private List<OrderDetails> orderDetails;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public List<OrderDetails> getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(List<OrderDetails> orderDetails) {
		this.orderDetails = orderDetails;
	}
	public Order(int id, Date orderDate, Date deliveryDate, int customerId,
			int status, double amount, List<OrderDetails> orderDetails) {
		super();
		this.id = id;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.customerId = customerId;
		this.status = status;
		this.amount = amount;
		this.orderDetails = orderDetails;
	}
	
}
