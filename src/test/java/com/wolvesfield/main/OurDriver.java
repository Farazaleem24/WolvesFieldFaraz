package com.wolvesfield.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OurDriver {

	public OurDriver(WebDriver driver) {
		OurDriver.driver = driver;
	}
	
	private static WebDriver driver = null;
	private static OurDriver driverClassInstance = null;
	
	public static OurDriver getInstance() {
		if  (driverClassInstance == null)
			driverClassInstance = new OurDriver(driver);
		return driverClassInstance;
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebDriver openBrowserNS(String Browser) {
		if(Browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			driver.navigate().to("https://wolvesfield.com/");
		}
		else if(Browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			driver.navigate().to("https://wolvesfield.com/");
		}
		else if(Browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			driver.navigate().to("https://wolvesfield.com/");
		}
		else {
			System.out.println("Invalid Driver");
		}
		return driver;
	}

	public WebDriver openBrowserSingleton(String Browser) {
		if(driver==null) {
			if(Browser.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("https://www.google.com/");
				driver.navigate().to("https://wolvesfield.com/");
			}
			else if(Browser.equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("https://www.google.com/");
				driver.navigate().to("https://wolvesfield.com/");
			}
			else if(Browser.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("https://www.google.com/");
				driver.navigate().to("https://wolvesfield.com/");
			}
			else {
				System.out.println("Invalid Driver");
			}
		}
		return driver;
	}



}
