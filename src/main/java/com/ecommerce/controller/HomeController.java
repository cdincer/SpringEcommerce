package com.ecommerce.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.apache.catalina.connector.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import java.util.concurrent.ThreadLocalRandom;

import com.ecommerce.dao.ProductDao;
import com.ecommerce.model.Product;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
public class HomeController {
	
	
	private Path path;
	
	
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
	public String addProductPost(@Valid @ModelAttribute("product") Product product,HttpServletRequest request,BindingResult result)
	{
		
		if(result.hasErrors())
		{
			return "addProduct";
		}
		
		
		int randomNum = ThreadLocalRandom.current().nextInt(1, 1000);
		//TO:DO Add A randomizer function for product.
		Product CopierProduct = productDao.getProductById(randomNum);		
		product.setProductCategory(CopierProduct.getProductCategory());
		product.setProductManufacturer(CopierProduct.getProductManufacturer());
		randomNum = ThreadLocalRandom.current().nextInt(1000, 5000);
		product.setProductPrice(randomNum);
		product.setProductStatus("Avaliable");
		randomNum = ThreadLocalRandom.current().nextInt(5, 100);
		product.setUnitInStock(randomNum);
		product.setProductDescription(product.getProductName()+" Description");
		//Randomizing stops,File adding begins
		MultipartFile productImage = product.getProductImage();
		
        String rootDirectory = request.getSession().getServletContext().getRealPath("/");
        path = Paths.get(rootDirectory + "\\WEB-INF\\resources\\images\\"+product.getProductId()+".png");

        if (productImage != null && !productImage.isEmpty()) {
            try {
                productImage.transferTo(new File(path.toString()));
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("Product image saving failed", e);
            }
        }
		
		
		productDao.addProduct(product);

		return "redirect:/admin/productInventory";
	}

	
	
	@RequestMapping("/admin/deleteProduct/{id}")
	public String deleteProduct(@PathVariable int  id,Model model) 
	{
		productDao.deleteProduct(id);

		return "redirect:/admin/productInventory";
	}
	
	@RequestMapping("/admin/editProduct/{id}")
	public String editProduct(@PathVariable("id") int  id,Model model) 
	{
		Product product = productDao.getProductById(id);
		model.addAttribute(product);

		return "editProduct";
	}
	
    @RequestMapping(value = "/admin/editProduct", method = RequestMethod.POST)
	public String editProduct(@Valid @ModelAttribute("product") Product product,HttpServletRequest request,BindingResult result)
	{
    	if(result.hasErrors())
		{
			return "editProduct";
		}
    	
		productDao.editProduct(product);
		
		return "redirect:/admin/productInventory";
	}
	
	
}
