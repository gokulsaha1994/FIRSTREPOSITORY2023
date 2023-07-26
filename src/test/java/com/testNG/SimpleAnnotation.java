package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotation {
public static WebDriver driver;
@BeforeSuite
	private void BrowserLaunch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\eclipse-workspace\\HotelBooking\\Driver1\\chromedriver.exe");
	 driver=new ChromeDriver(); 
	}
@BeforeTest
public void url() {
	driver.get("https://adactinhotelapp.com/");

}
	@Test
	public void username() {
		WebElement user=driver.findElement(By.id("username"));
		user.sendKeys("golfgokul");

	}
	
	@Test
	public void password() {
		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys("gokul@1994");
	}
	
	@AfterTest(timeOut=3000)
	
	public void submit() throws InterruptedException {
		WebElement cli=driver.findElement(By.id("login"));
		cli.click();
		Thread.sleep(2000);

	}
} 
