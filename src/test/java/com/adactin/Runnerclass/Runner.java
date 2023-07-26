package com.adactin.Runnerclass;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


import com.base.Base;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@CucumberOptions(features = "src\\test\\java\\com\\adactin\\features\\Adactin1.feature",glue ="com.adactin.Stepdefinition")
@RunWith(Cucumber.class)
public class Runner { 
	public static WebDriver driver;

@BeforeClass
	public static void starts() throws Throwable {
		driver = Base.Browserlaunch();

	}
@AfterClass
	public static void ends() {
		driver.close();
	}

}
