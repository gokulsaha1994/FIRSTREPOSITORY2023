package com.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class Base {
	public static WebDriver driver;

	public static WebDriver Browserlaunch() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Asus\\eclipse-workspace\\HotelBooking\\Driver1\\chromedriver.exe");
		 driver = new ChromeDriver();
		return driver;
	}

	public static void Url(String url) {
		driver.get(url);
	}

	public static void sendkey(WebElement ele, String value) {
		ele.sendKeys(value);
	}

	public static void click(WebElement ele) {
		ele.click();
	}
	public static void selectbyindex(WebElement ele, int value) {
Select sel= new Select(ele); 
sel.selectByIndex(value);
	}
	public static void Screenshot(String s) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
	File from=ts.getScreenshotAs(OutputType.FILE);
File to = new File(s);
 FileUtils.copyFile(from, to);
 }
	public ExtentReports extent;
	
	public static ExtentTest scenarioDef;
	public static ExtentTest features;
	public static String reportLocation = "/user/gokul/report/";
}  