package com.component;

import org.springframework.stereotype.Component;

import com.dto.ProductDTO;
import com.entity.Product;
@Component
public class ProductConVert {
		
	public ProductDTO toDTO(Product entity) {
		ProductDTO dto=new ProductDTO();
		dto.setId(entity.getProdID());
		dto.setName(entity.getProdName());
		dto.setDecription(entity.getDescription());
		dto.setPrice(entity.getPrice());
		dto.setDate(entity.getDateOfManf());
		return dto;
		
	}

}
