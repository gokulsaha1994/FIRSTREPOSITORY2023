Feature: Hotel Booking in Adactin Application

Scenario: Login to the Adactin Application

Given User Launch The Application

When User Enter The Username in the Username Field 

And User Enter The Password in the Password Field

Then User Click on the Login Button and it Navigates to the search Hotel Page in the Adactin Application

Scenario: User Search the Hotel with the Available options

When User Selects the Required Location from the Location dropdown list

And User Selects the Required Hotel from the Hotel dropdown list

And User Selects the Required RoomType from the RoomType dropdown list

And User Selects the No of Rooms Required from the No of Room from the Dropdown list

And User Selects the Check-In-Date From the Date Picker List 

And User Selects the Check-Out-Date From the Date Picker List

And User Selects the No of Adults from the Adults per Rooom Dropdown List

And User Selects the No of Adults from the Child per Rooom Dropdown List

Then User click the Search Button and it Navigates to the the Search Hotel Summary page 

Scenario: User Confirms the selected options summary

When User checks the Radio Button with the Options Selected in the previous Page 

Then User click the Continue Button and it Navigates to the Next page 


Scenario: User Enters the Personal details and payment details 

When User Enters the First Name in the Dialog box

And User Enters the Last Name in the Dialog Box

And User Enters the Billing Address in the Dialog Box

And Credit Card No in the Dialog Box 

And Credit Card Type from the Dropdown List

And Expiry Date from the Dropdown List

Then Year from the Dropdown List 

And User Enters the CVV Number in the Given Dialog Box

Then User click the BOOKNOW button after verifying the details It Navigates to COnfirmation Page . 

Scenario: User Confirms the Personal details and payment details   

And User clicks on the Logout Button ,It Navigates to the Logout Page. 