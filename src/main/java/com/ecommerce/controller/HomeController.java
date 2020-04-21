package com.ecommerce.controller;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.concurrent.ThreadLocalRandom;

import com.ecommerce.dao.ProductDao;
import com.ecommerce.model.Product;
import com.sun.tools.javac.util.List;

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

	@RequestMapping("/admin")
	public String adminPage()
	{		
		return "admin";
	}
	
	@RequestMapping("/admin/productInventory")
	public String productInventory(Model model)
	{		
		ArrayList<Product> productList = (ArrayList<Product>) productDao.getAllProduct();
		model.addAttribute("productList",productList);
		return "productInventory";
	}
	
	@RequestMapping("/admin/addProduct")
	public String addProduct(Model model)
	{		
		Product product = new Product();
		product.setProductCategory("Please Enter a Category");
		product.setProductName("Please Enter a Name");
		product.setProductColor("Please Enter a Color");
		
		model.addAttribute("product",product);

		
		return "addProduct";
	}
	
	
	@RequestMapping(value ="/admin/addProduct",method = RequestMethod.POST)
	public String addProductPost(@ModelAttribute("product") Product product)
	{
		int randomNum = ThreadLocalRandom.current().nextInt(1, 1000);
		Product CopierProduct = productDao.getProductById(randomNum);
		
		
		product.setProductCategory(CopierProduct.getProductCategory());
		product.setProductManufacturer(CopierProduct.getProductManufacturer());
		randomNum = ThreadLocalRandom.current().nextInt(1000, 5000);
		product.setProductPrice(randomNum);
		product.setProductStatus("Avaliable");
		randomNum = ThreadLocalRandom.current().nextInt(5, 100);
		product.setUnitInStock(randomNum);
		product.setProductDescription(product.getProductName()+" Description");
		
		productDao.addProduct(product);

		return "redirect:/admin/productInventory";
	}

	
	
	
	
}
