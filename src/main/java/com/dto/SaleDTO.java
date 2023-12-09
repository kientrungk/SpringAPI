package com.dto;

import java.util.ArrayList;
import java.util.List;

public class SaleDTO {
	
	private Long saleid;
	private String productid;
	private String salename;	
	private String dos;
	private int slno;
	
	List<SaleDTO> listresult=new ArrayList<SaleDTO>();

	public Long getSaleid() {
		return saleid;
	}

	public void setSaleid(Long saleid) {
		this.saleid = saleid;
	}

	public String getProductid() {
		return productid;
	}

	public void setProductid(String productid) {
		this.productid = productid;
	}

	public String getSalename() {
		return salename;
	}

	public void setSalename(String salename) {
		this.salename = salename;
	}

	public String getDos() {
		return dos;
	}

	public void setDos(String dos) {
		this.dos = dos;
	}

	public int getSlno() {
		return slno;
	}

	public void setSlno(int slno) {
		this.slno = slno;
	}

	public List<SaleDTO> getListresult() {
		return listresult;
	}

	public void setListresult(List<SaleDTO> listresult) {
		this.listresult = listresult;
	}
	
	
	
}
