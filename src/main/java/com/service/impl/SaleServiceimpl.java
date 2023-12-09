package com.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.component.SaleConvert;
import com.dto.SaleDTO;
import com.entity.Sale;
import com.repository.SaleRepository;
import com.service.SaleService;
@Service
public class SaleServiceimpl implements SaleService{

	@Autowired
	private SaleRepository repository;
	
	
	@Autowired
	private SaleConvert convert;
	 
	@Override
	public List<SaleDTO> findALL() {
		List<SaleDTO> sales = new ArrayList<>();
		
		List<Sale> entites=repository.findAll();
		for (Sale item: entites) {
			SaleDTO DTO= convert.toDTO(item);
		
			sales.add( DTO);
		}
		return sales;
	}


	
}
