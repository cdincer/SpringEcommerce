package com.hellospring.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecommerce.dao.ProductDao;
import com.ecommerce.model.Product;
import com.sun.tools.javac.util.List;

@Controller
public class HomeController {
	
	private ProductDao productDao = new ProductDao();
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}

	
	@RequestMapping("/productList")
	public String getProducts(Model model) {
		ArrayList<Product> productList = (ArrayList<Product>) productDao.getProductList();
		Product product = productList.get(0);
		model.addAttribute(product);
		return "productsList";
	}
}
