package com.ecommerce.controller;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ecommerce.dao.ProductDao;
import com.ecommerce.model.Product;

@Controller
public class HomeController {
	
	
	
	
	@Autowired
	private ProductDao productDao;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}

	
	@RequestMapping("/productList")
	public String getProducts(Model model) {
		ArrayList<Product> productList = (ArrayList<Product>) productDao.getAllProduct();
		model.addAttribute("productList",productList);
		return "productsList";
	}
	
	@RequestMapping("/productList/viewProduct/{productId}")
	public String viewProduct(@PathVariable int productId,Model model) throws IOException
	{
		Product product=productDao.getProductById(productId);
		model.addAttribute(product);
		return "viewProduct";
	}

	
	
}
