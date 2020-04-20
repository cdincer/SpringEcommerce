package com.ecommerce.dao;

import java.util.ArrayList;
import java.util.List;

import com.ecommerce.model.*;

public class ProductDao {
	
	private List<Product> productList;

	public List<Product> getProductList()
	{
		Product product1= new Product();
		
		product1.setProductCategory("Item1");
		product1.setProductName("TestItem1");
		product1.setProductDescription("TestItemDescription1");
        product1.setUnitInStock(5);
        product1.setProductManufacturer("TestManufacturer1");
        product1.setProductColor("Blue");
        product1.setProductStatus("Avaliable");
        product1.setProductPrice(1.10);
        
        productList = new ArrayList<Product>();
productList.add(product1);
        return productList;
	}
	
	
}
