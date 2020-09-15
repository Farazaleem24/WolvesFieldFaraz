package com.wolvesfield.util;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;
import com.wolvesfield.main.OurDriver;

public class WolvesUtil {

	OurDriver od = OurDriver.getInstance();
	WebDriver driver = od.getDriver();

	public void goToUrl(String url) {
		driver.get(url);
	}

	public void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public void refresh() {
		driver.navigate().refresh();
	}

	public void goBack() {
		driver.navigate().back();
	}

	public void goForward() {
		driver.navigate().forward();
	}

	public void maximize() {
		driver.manage().window().maximize();
	}

	public void sleep(int sec){
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void getTitle() {
		driver.getTitle();
	}

	public void getUrl() {
		driver.getCurrentUrl();
	}

	public void closeCurrentBrowser() {
		driver.close();
	}

	public void closeAllBrowser() {
		driver.quit();
	}

	public void clickElement(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}

	public void elementDisplayed(String xpath) {
		driver.findElement(By.xpath(xpath)).isDisplayed();
	}

	public void sendKeys(String xpath, String keys) {
		driver.findElement(By.xpath(xpath)).sendKeys(keys);
	}

	public void clearElement(String xpath) {
		driver.findElement(By.xpath(xpath)).clear();
	}

	public void takeScreenshot(String testName) {
		File sc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			Files.copy(sc, new File("C:\\Users\\Faraz Aleem\\Documents\\screenshots\\"+testName+".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
