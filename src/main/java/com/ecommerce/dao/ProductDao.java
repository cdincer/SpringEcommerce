package com.ecommerce.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.ecommerce.model.*;

public class ProductDao {
	
	private List<Product> productList;

	public List<Product> getProductList()
	{
		Product product1= new Product();
		product1.setProductId("1");
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
		product1= new Product();
		product1.setProductId("2");
		product1.setProductCategory("Item2");
		product1.setProductName("TestItem2");
		product1.setProductDescription("TestItemDescription2");
		product1.setUnitInStock(5);
		product1.setProductManufacturer("TestManufacturer2");
		product1.setProductColor("Red");
		product1.setProductStatus("Avaliable");
		product1.setProductPrice(1.20);
		
		productList.add(product1);
		
		
		product1= new Product();
		product1.setProductId("3");
		product1.setProductCategory("Item3");
		product1.setProductName("TestItem3");
		product1.setProductDescription("TestItemDescription3");
		product1.setUnitInStock(5);
		product1.setProductManufacturer("TestManufacturer3");
		product1.setProductColor("Yellow");
		product1.setProductStatus("Avaliable");
		product1.setProductPrice(1.30);
		productList.add(product1);


        return productList;
	}

	public Product getProductById(String productId) throws IOException
	{
		for(Product product: getProductList())
		{
			if(product.getProductId().equals(productId))
			{
				return product;
			}
		}
		
		throw new IOException("No product found");
	}
	
	
}
