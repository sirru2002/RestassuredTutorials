package com.reatilapp.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Temp {
	SoftAssert softAssert;
	
	@BeforeTest
	public void befreTest(){
		softAssert = new SoftAssert();
	}
	
	
	public void reportFailure(String errMsg,boolean stop){
		
		softAssert.fail(errMsg);
		
		if(stop)
			softAssert.assertAll();
		
	}
	
	@Test
	public void testApp(){
		reportFailure("ccc",false);
		reportFailure("xx",true);
		softAssert.assertAll();

	}
}
