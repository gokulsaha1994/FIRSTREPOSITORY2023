package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_model {

	public WebDriver driver;

	public Login_model(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getClic() {
		return clic;
	}

	@FindBy(id = "username")
	WebElement user;
	@FindBy(id = "password")
	WebElement pass;
	@FindBy(id = "login")
	WebElement clic;

}
