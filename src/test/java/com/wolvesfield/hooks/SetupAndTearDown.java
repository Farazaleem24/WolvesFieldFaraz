package com.wolvesfield.hooks;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.wolvesfield.main.ObjectFactory;

public class SetupAndTearDown {

	ObjectFactory of = new ObjectFactory();

	@BeforeMethod
	public void setup() {
		of.getOd().openBrowserSingleton("chrome");
	}
	
	@AfterMethod
	public void tearDown() {
		of.getWu().closeAllBrowser();
	}
	
}
