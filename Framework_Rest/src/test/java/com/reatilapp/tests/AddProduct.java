package com.reatilapp.tests;

import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.retailapp.base.BaseTest;
import com.retailapp.base.CategoryList;
import com.retailapp.base.Product;
import com.retailapp.base.ProductDetails;

public class AddProduct extends BaseTest{

	@Test()
	public void addprod() {
		

		ProductDetails prod = new ProductDetails();
		Product nike = new Product();
		nike.setName("A");
		nike.setQuantity("67");
		nike.setPrice("44");


		CategoryList catList = prod.addCategory("books");
		catList.addProduct(nike);
		

		Product book1 = new Product();
		book1.setName("AB");
		book1.setQuantity("45");
		book1.setPrice("34");

		Product book2 = new Product();
		book2.setName("Abb");
		book2.setQuantity("45");
		book2.setPrice("66");

		catList = prod.addCategory("books");
		catList.addProduct(book1);
		catList.addProduct(book2);

		Map<String, List<Product>> cat = catList.addProduct(book2);

		prod.setProductdetails(cat);

		Response resp = given().contentType(ContentType.JSON)
				.header("sessionid", "785567474hghfh56b54").log().body()
				.body(prod).post("/product/add");
		
		
		resp.prettyPrint();

	}

}
