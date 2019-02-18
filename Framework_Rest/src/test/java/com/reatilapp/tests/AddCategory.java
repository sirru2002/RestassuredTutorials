package com.reatilapp.tests;

import static io.restassured.RestAssured.given;

import java.util.Hashtable;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import com.retailapp.base.BaseTest;
import com.retailapp.base.Category;

public class AddCategory extends BaseTest {

	@Test(dataProvider = "getData")
	public void addCat(Hashtable<String, String> data) {
		
		
		System.out.println(data.get("CategoryName"));
		
		String catname = data.get("CategoryName");

		Category cat = new Category();

		cat.setCategoryname(catname);

		Response resp = given().contentType(ContentType.JSON)
				.headers("sessionid", "273763ggdg6gKksks").log().all().when().body(cat)
				.post("/category/add");

		resp.prettyPrint();

	}

}
