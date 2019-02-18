package com.retailapp.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CategoryList {
	
	Map<String,List<Product>> categoryProducts;
	List<Product> productList;
	String categoryName;
	
	public CategoryList(){
		
		if(categoryProducts==null)
			categoryProducts = new HashMap<String,List<Product>>();
		
	}
	
	public void createNewList(String categoryName){
		this.categoryName=categoryName;
		productList = new ArrayList<Product>();
		categoryProducts.put(categoryName, productList);
		
	}

	
	public Map<String,List<Product>> addProduct(Product p) {
		productList.add(p);
		categoryProducts.put(categoryName, productList);
		System.out.println(categoryProducts.toString());
		return categoryProducts;
	}
	
	
	
}
