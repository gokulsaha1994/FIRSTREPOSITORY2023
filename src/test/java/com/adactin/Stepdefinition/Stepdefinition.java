package com.adactin.Stepdefinition;



import org.openqa.selenium.WebDriver;

import com.adactin.Runnerclass.Runner;

import com.adactin.helpers.ProjectObjectManager;
import com.base.Base;


import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition extends Base  {

	public WebDriver driver =Runner.driver;
ProjectObjectManager pom = new ProjectObjectManager(driver);

@Given("User Launch The Application")
public void user_launch_the_application() throws Throwable {

       Url("https://adactinhotelapp.com/");
    
}
@When("User Enter The Username in the Username Field")
public void user_enter_the_username_in_the_username_field() throws Throwable {

sendkey(pom.login().getUser(),"golfgokul"); 
	
   
}
@When("User Enter The Password in the Password Field")
public void user_enter_the_password_in_the_password_field() throws Throwable{

	sendkey(pom.login().getPass(),"gokul@1994");


}
@Then("User Click on the Login Button and it Navigates to the search Hotel Page in the Adactin Application")
public void user_click_on_the_login_button_and_it_navigates_to_the_search_hotel_page_in_the_adactin_application() throws PendingException {
	click(pom.login().getClic());
  
}

@When("User Selects the Required Location from the Location dropdown list")
public void user_selects_the_required_location_from_the_location_dropdown_list() throws PendingException {
	selectbyindex(pom.search().getLoc(),2);

}
@When("User Selects the Required Hotel from the Hotel dropdown list")
public void user_selects_the_required_hotel_from_the_hotel_dropdown_list() throws PendingException {
	selectbyindex(pom.search().getHot(), 2);

}
@When("User Selects the Required RoomType from the RoomType dropdown list")
public void user_selects_the_required_room_type_from_the_room_type_dropdown_list() throws PendingException {
	selectbyindex(pom.search().getRt(), 3);

}
@When("User Selects the No of Rooms Required from the No of Room from the Dropdown list")
public void user_selects_the_no_of_rooms_required_from_the_no_of_room_from_the_dropdown_list() throws PendingException {
	selectbyindex(pom.search().getRn(), 2);

}
@When("User Selects the Check-In-Date From the Date Picker List")
public void user_selects_the_check_in_date_from_the_date_picker_list() throws PendingException {
	sendkey(pom.search().getDin(),"20/05/2023");

}
@When("User Selects the Check-Out-Date From the Date Picker List")
public void user_selects_the_check_out_date_from_the_date_picker_list() throws PendingException {
	sendkey(pom.search().getDout(),"22/05/2023");

}
@When("User Selects the No of Adults from the Adults per Rooom Dropdown List")
public void user_selects_the_no_of_adults_from_the_adults_per_rooom_dropdown_list() throws PendingException {
	selectbyindex(pom.search().getAdroom(), 4);

}
@When("User Selects the No of Adults from the Child per Rooom Dropdown List")
public void user_selects_the_no_of_adults_from_the_child_per_rooom_dropdown_list() throws PendingException {
	selectbyindex(pom.search().getCdroom(), 4);

}
@Then("User click the Search Button and it Navigates to the the Search Hotel Summary page")
public void user_click_the_search_button_and_it_navigates_to_the_the_search_hotel_summary_page() throws PendingException {
	click(pom.search().getSub());
}

@When("User checks the Radio Button with the Options Selected in the previous Page")
public void user_checks_the_radio_button_with_the_options_selected_in_the_previous_page() throws PendingException {
	click(pom.confirm().getRbtn());
	
	
}
@Then("User click the Continue Button and it Navigates to the Next page")
public void user_click_the_continue_button_and_it_navigates_to_the_next_page() throws PendingException{

	click(pom.confirm().getCont());
}

@When("User Enters the First Name in the Dialog box")
public void user_enters_the_first_name_in_the_dialog_box()throws PendingException {
	sendkey(pom.payment().getFname(),"Gokul");

}
@When("User Enters the Last Name in the Dialog Box")
public void user_enters_the_last_name_in_the_dialog_box()throws PendingException {
	sendkey(pom.payment().getLname(),"Saha");

}
@When("User Enters the Billing Address in the Dialog Box")
public void user_enters_the_billing_address_in_the_dialog_box() throws PendingException{
	sendkey(pom.payment().getAdd(),"Bangalore");

}
@When("Credit Card No in the Dialog Box")
public void credit_card_no_in_the_dialog_box() throws Throwable{

	sendkey(pom.payment().getCcn(),"1234567812345678");

}
@When("Credit Card Type from the Dropdown List")
public void credit_card_type_from_the_dropdown_list() throws PendingException{
	selectbyindex(pom.payment().getCct(), 3);

}
@When("Expiry Date from the Dropdown List")
public void expiry_date_from_the_dropdown_list()throws PendingException {
	selectbyindex(pom.payment().getCcem(), 3);

}
@Then("Year from the Dropdown List")
public void year_from_the_dropdown_list() throws PendingException {
	selectbyindex(pom.payment().getCcey(), 4);

}

@When("User Enters the CVV Number in the Given Dialog Box")
public void user_enters_the_cvv_number_in_the_given_dialog_box() throws Throwable {

	sendkey(pom.payment().getCccvv(),"123");

}
@Then("User click the BOOKNOW button after verifying the details It Navigates to COnfirmation Page .")
public void user_click_the_booknow_button_after_verifying_the_details_it_navigates_to_c_onfirmation_page() throws PendingException {
	click(pom.payment().getBn());
}

@When("User clicks on the Logout Button ,It Navigates to the Logout Page.")
public void user_clicks_on_the_logout_button_it_navigates_to_the_logout_page() throws PendingException {

	click(pom.logout().getLog());
}
}
 