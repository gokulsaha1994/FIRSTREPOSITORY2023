package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirm_Model {
public WebDriver driver;

public Confirm_Model(WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver, this);

}
@FindBy(id="radiobutton_0")
WebElement rbtn;
public WebDriver getDriver() {
	return driver;
}
public WebElement getRbtn() {
	return rbtn;
}
public WebElement getCont() {
	return cont;
}
@FindBy(id="continue")
WebElement cont;
}