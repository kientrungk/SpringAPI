package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.ProductDTO;
import com.dto.SaleDTO;
import com.service.ProductService;
import com.service.SaleService;

@Controller
public class Homecontroller {
	
	@Autowired
	private ProductService productService;
	
	
	@Autowired 
	private SaleService saleService; 
	
	
	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public ModelAndView productPage(HttpServletRequest request) {
		
	
		ProductDTO model=new ProductDTO();
	    model.setListresult(productService.findAll());
		ModelAndView mav = new ModelAndView("listpro");
		request.setAttribute("model", model);
		
		
		return mav;
	}

	
	@RequestMapping(value = "/sale", method = RequestMethod.GET)
	public ModelAndView salePage() {
	    SaleDTO model=new SaleDTO();
		ModelAndView mav = new ModelAndView("list");
		model.setListresult(saleService.findALL());
		mav.addObject("model",model);
		
		
		return mav;
	}


}
