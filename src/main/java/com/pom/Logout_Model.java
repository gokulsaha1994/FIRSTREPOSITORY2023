package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_Model {
public WebDriver driver;

public Logout_Model(WebDriver driver) {
this.driver=driver;

PageFactory.initElements(driver, this);

}
public WebDriver getDriver() {
	return driver;
}
public WebElement getLog() {
	return log;
}
@FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[2]/a[4]")
WebElement log;
@FindBy(id="my_itinerary")
WebElement myit;

public WebElement getMyit() {
	return myit;
	

}
}
