package com.dto;

import java.util.ArrayList;
import java.util.List;

public class ProductDTO {
	
		
	private Long id;

	private String name;

	private String decription;

	private String date;
	
	private int price;

	
	List<ProductDTO> listresult=new ArrayList<ProductDTO>();
	
	
	
	public List<ProductDTO> getListresult() {
		return listresult;
	}

	public void setListresult(List<ProductDTO> listresult) {
		this.listresult = listresult;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDecription() {
		return decription;
	}

	public void setDecription(String decription) {
		this.decription = decription;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


}
