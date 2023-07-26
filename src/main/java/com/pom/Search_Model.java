package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Model {
private WebDriver driver;

public Search_Model(WebDriver driver) {
this.driver=driver;

PageFactory.initElements(driver, this);
}

@FindBy(id="location")
WebElement loc;
public WebDriver getDriver() {
	return driver;
}
public WebElement getLoc() {
	return loc;
}
public WebElement getHot() {
	return hot;
}
public WebElement getRt() {
	return rt;
}
public WebElement getRn() {
	return rn;
}
public WebElement getDin() {
	return din;
}
public WebElement getDout() {
	return dout;
}
public WebElement getAdroom() {
	return adroom;
}
public WebElement getCdroom() {
	return cdroom;
}

@FindBy(id="hotels")
WebElement hot;
@FindBy(id="room_type")
WebElement rt;
@FindBy(id="room_nos")
WebElement rn;
@FindBy(id="datepick_in")
WebElement din;
@FindBy(id="datepick_out")
WebElement dout;
@FindBy(id="adult_room")
WebElement adroom;
@FindBy(id="child_room")
WebElement  cdroom;
@FindBy(id="Submit")
WebElement sub;

public WebElement getSub() {
	return sub;
}

}
