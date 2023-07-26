package com.main;



import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.base.Base;
import com.pom.Confirm_Model;
import com.pom.Login_model;
import com.pom.Logout_Model;
import com.pom.Payment_Model;

import com.pom.Search_Model;

public class Mainbooking extends Base {
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
Login_model log=new Login_model(driver);
sendkey(log.getUser(), "golfgokul");
sendkey(log.getPass(), "Gokul@1994");
click(log.getClic());

Search_Model searc=new Search_Model(driver);
selectbyindex(searc.getLoc(),2);
selectbyindex(searc.getHot(), 2);
selectbyindex(searc.getRt(), 3);
selectbyindex(searc.getRn(), 2);
sendkey(searc.getDin(),"20/05/2023");
sendkey(searc.getDout(),"22/05/2023");
selectbyindex(searc.getAdroom(), 4);
selectbyindex(searc.getCdroom(), 4);
click(searc.getSub());

Confirm_Model con=new Confirm_Model(driver);
click(con.getRbtn());
click(con.getCont());

Payment_Model pay=new Payment_Model(driver);

sendkey(pay.getFname(),"Gokul");
sendkey(pay.getLname(),"Saha");
sendkey(pay.getAdd(),"Bangalore");
sendkey(pay.getCcn(),"1234567812345678");
selectbyindex(pay.getCct(), 3);
selectbyindex(pay.getCcem(), 3);
selectbyindex(pay.getCcey(), 4);
sendkey(pay.getCccvv(),"123");
click(pay.getBn());

Logout_Model log1=new Logout_Model(driver);
click(log1.getLog());


}
}
