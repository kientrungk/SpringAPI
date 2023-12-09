package com.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.component.ProductConVert;
import com.dto.ProductDTO;
import com.entity.Product;
import com.repository.ProductRepository;
import com.service.ProductService;
@Service
public class ProductServiceimpl implements ProductService {
    
	@Autowired
	private ProductRepository repon;
	
	   
	@Autowired
	private ProductConVert convert;

	@Override
	public List<ProductDTO> findAll() {
		List<ProductDTO> products = new ArrayList<>();
		
		List<Product> entites=repon.findAll();
		for (Product item: entites) {
			ProductDTO DTO= convert.toDTO(item);
		
			products.add( DTO);
		}
		return products;
	}




	

}
