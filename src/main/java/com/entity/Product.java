package com.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ProdID")
	private Long ProdID;

	@Column(name = "ProdName")
	private String ProdName;

	@Column(name = "Description")
	private String Description;

	@Column(name = "DateOfManf")
	private String DateOfManf;
	@Column(name = "Price")
	private int Price;
	
	
	
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinTable(name = "product_sale", joinColumns = @JoinColumn(name = "productid"), 
								  inverseJoinColumns = @JoinColumn(name = "saleid"))
	
	private List<Sale> sales = new ArrayList<>();
	public Long getProdID() {
		return ProdID;
	}
	public void setProdID(Long prodID) {
		ProdID = prodID;
	}
	public String getProdName() {
		return ProdName;
	}
	public void setProdName(String prodName) {
		ProdName = prodName;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getDateOfManf() {
		return DateOfManf;
	}
	public void setDateOfManf(String dateOfManf) {
		DateOfManf = dateOfManf;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}


	

	


}
