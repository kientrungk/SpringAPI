package com.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="sale")
public class Sale {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SalesmanID")
	private Long SalesmanID;

	@Column(name = "ProdID")
	private String ProdID;

	@Column(name = "SalesmanName")
	private String SalesmanName;

	@Column(name = "DOS")
	private String DOS;
	@Column(name = "SlNo")
	private int SlNo;
	
	
	
	@ManyToMany(mappedBy = "sales")

    private List<Product> products = new ArrayList<>();

	public Long getSalesmanID() {
		return SalesmanID;
	}
	public void setSalesmanID(Long salesmanID) {
		SalesmanID = salesmanID;
	}
	public String getProdID() {
		return ProdID;
	}
	public void setProdID(String prodID) {
		ProdID = prodID;
	}
	public String getSalesmanName() {
		return SalesmanName;
	}
	public void setSalesmanName(String salesmanName) {
		SalesmanName = salesmanName;
	}
	public String getDOS() {
		return DOS;
	}
	public void setDOS(String dOS) {
		DOS = dOS;
	}
	public int getSlNo() {
		return SlNo;
	}
	public void setSlNo(int slNo) {
		SlNo = slNo;
	}
	
	
	

}
