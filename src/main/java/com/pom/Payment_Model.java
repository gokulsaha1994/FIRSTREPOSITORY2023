package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Model {
public WebDriver driver;

public Payment_Model(WebDriver driver) {
this.driver=driver;
 PageFactory.initElements(driver, this);
 
}
@FindBy(id="first_name")
WebElement fname;
public WebDriver getDriver() {
	return driver;
}
public WebElement getFname() {
	return fname;
}
public WebElement getLname() {
	return lname;
}
public WebElement getAdd() {
	return add;
}
public WebElement getCcn() {
	return ccn;
}
public WebElement getCct() {
	return cct;
}
public WebElement getCcem() {
	return ccem;
}
public WebElement getCcey() {
	return ccey;
}
public WebElement getCccvv() {
	return cccvv;
}
public WebElement getBn() {
	return bn;
}
@FindBy(id="last_name")
WebElement lname;
@FindBy(id="address")
WebElement add;
@FindBy(id="cc_num")
WebElement ccn;
@FindBy(id="cc_type")
WebElement cct;
@FindBy(id="cc_exp_month")
WebElement ccem;
@FindBy(id="cc_exp_year")
WebElement ccey;
@FindBy(id="cc_cvv")
WebElement cccvv;
@FindBy(id="book_now")
WebElement bn;
}
