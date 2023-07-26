package com.adactin.Stepdefinition;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.adactin.helpers.FileReaderManager;

public class dummy {
	public static void main(String[] args) throws Throwable {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Asus\\eclipse-workspace\\HotelBooking\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys(FileReaderManager.getInstance().getInstanceCR().getuser());
	}
}
