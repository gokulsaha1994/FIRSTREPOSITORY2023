package com.adactin.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.Confirm_Model;
import com.pom.Login_model;
import com.pom.Logout_Model;
import com.pom.Payment_Model;
import com.pom.Search_Model;

public class ProjectObjectManager {

	
	public WebDriver driver;

	public ProjectObjectManager(WebDriver driver) {
this.driver = driver;
PageFactory.initElements(driver, this);
	}
	
public Confirm_Model confirm() {
Confirm_Model confirm = new Confirm_Model(driver);
return confirm;
}
public Login_model login() {
	Login_model login = new Login_model(driver);
	return login;
}
	public Search_Model search() {
		Search_Model search = new Search_Model(driver);
		return search;
	}
	
	public Payment_Model payment() {
		Payment_Model pay = new Payment_Model(driver);
		return pay;
	}
	public Logout_Model logout() {
		Logout_Model logout = new Logout_Model(driver);
		return logout;
	}
}
