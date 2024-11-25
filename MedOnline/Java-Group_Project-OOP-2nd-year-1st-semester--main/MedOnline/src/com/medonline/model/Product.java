package com.medonline.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="product")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
private int id;
@Column(name="name")
private String name;
@Column(name="description")
private String description;
@Column(name="price")
private float price;
@Column(name="expiry_date")
private Date expiryDate;
public Product() {
	super();
}
@Column(name="manufacturing_date")
private Date manufacturingDate;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public Date getExpiryDate() {
	return expiryDate;
}
public void setExpiryDate(Date expiryDate) {
	this.expiryDate = expiryDate;
}
public Date getManufacturingDate() {
	return manufacturingDate;
}
public void setManufacturingDate(Date manufacturingDate) {
	this.manufacturingDate = manufacturingDate;
}
public Product(int id, String name, String description, float price,
		Date expiryDate, Date manufacturingDate) {
	super();
	this.id = id;
	this.name = name;
	this.description = description;
	this.price = price;
	this.expiryDate = expiryDate;
	this.manufacturingDate = manufacturingDate;
}
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", description="
			+ description + ", price=" + price + ", expiryDate=" + expiryDate
			+ ", manufacturingDate=" + manufacturingDate + "]";
}

}
