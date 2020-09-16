package com.wolvesfield.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.wolvesfield.main.OurDriver;

public class HomePageFactory {

	public HomePageFactory(WebDriver driver) {
		driver = OurDriver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@class='main-logo']")
	public WebElement mainLogo; 
	
	@FindBy()
}
