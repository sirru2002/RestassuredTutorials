package com.retailapp.base;
import java.util.List;
import java.util.Map;


public class ProductDetails {

	Map<String,List<Product>> productdetails;
	CategoryList cat;
	//Map<String,List<Map<String,String>>>
	
	
	
	public CategoryList addCategory(String catName){
		if(cat==null)
			cat = new CategoryList();
		
		cat.createNewList(catName);
		return cat;
	}
	
	public Map<String, List<Product>> getProductdetails() {
		return productdetails;
	}

	public void setProductdetails(Map<String, List<Product>> productdetails) {
		this.productdetails = productdetails;
	}
	
	
	
}
