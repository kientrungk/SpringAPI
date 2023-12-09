package com.component;

import org.springframework.stereotype.Component;

import com.dto.SaleDTO;
import com.entity.Sale;

@Component
public class SaleConvert {
	public SaleDTO toDTO(Sale entity) {
		SaleDTO dto=new SaleDTO();
		dto.setSaleid(entity.getSalesmanID());
		dto.setSalename(entity.getSalesmanName());
		dto.setProductid(entity.getProdID());
		dto.setDos(entity.getDOS());
		dto.setSlno(entity.getSlNo());
		return dto;
		
	}

}
