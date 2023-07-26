package com.adactin.helpers;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

	public Properties p;

	public ConfigurationReader() throws Throwable {
		File f = new File(
				"C:\\Users\\Asus\\eclipse-workspace\\HotelBooking\\src\\test\\java\\com\\adactin\\propertyfile\\Data_configuration.properties");
		FileInputStream g = new FileInputStream(f);
		p = new Properties();
		p.load(g);
	}

	public String getbrowser() {

		String property = p.getProperty("browser");
		return property;
	}

	public String geturl() {

		String prop = p.getProperty("url");
		return prop;
	}

	public String getuser() {

		String user1 = p.getProperty("Username");
		return user1;
	}

	public String getpass() {

		String pass = p.getProperty("Password");
		return pass;
	}

	public String getcardno() {

		String ccn = p.getProperty("creditcardnumber");
		return ccn;
	}

	public String cvv() {

		String cvv = p.getProperty("cvv");
		return cvv;
	}
}
