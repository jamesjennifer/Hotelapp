package org.stepdefinition;

import java.io.IOException;
import java.util.Map;

import org.baseclasswork.Baseclasswork;
import org.junit.Assert;
import org.pojoclasswork.Bookhotel;
import org.pojoclasswork.Bookingconfirmation;
import org.pojoclasswork.Pojoclasswork;
import org.pojoclasswork.Searchpage;
import org.pojoclasswork.Selecthotel;

import io.cucumber.datatable.dependency.com.fasterxml.jackson.core.io.SegmentedStringWriter;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition extends Baseclasswork {
	
	
	
	@Given("User should be in Adactin login page")
	public void user_should_be_in_Adactin_login_page() {
	  launchUrl("http://adactinhotelapp.com/index.php");
	}

	@When("User should give valid username and valid password and enter login button")
	public void user_should_give_valid_username_and_valid_password_and_enter_login_button(io.cucumber.datatable.DataTable d) {
	   Map<String,String> map = d.asMap(String.class, String.class);
	  Pojoclasswork  l=new Pojoclasswork();

	   sendKeys(l.getTxtUsername(),map.get("username") );
	   sendKeys(l.getTxtPassword(),map.get("password") );
	   btnclick(l.getBtnLogin());
	   
	}


	@When("User should be in valid Search Hotel Page")
	public void user_should_be_in_valid_Search_Hotel_Page() {
	    String title = getTitle();
	Assert.assertTrue("Current Title", title.contains("Search Hotel"));
		System.out.println(title);
	}

	@When("User should select the location,Hotels, Room Type,No of rooms,Check in date,Check out date,Adults per room, Children per room, from the drop down and click search button")
	public void user_should_select_the_location_Hotels_Room_Type_No_of_rooms_Check_in_date_Check_out_date_Adults_per_room_Children_per_room_from_the_drop_down_and_click_search_button() {
	   Searchpage s=new Searchpage();
		selectbyindex(s.getSltlocation(), 1);
		selectbyindex(s.getSlthotel(), 2);
		selectbyindex(s.getSltroomtype(), 3);
		selectbyindex(s.getSltroomnos(), 1);
		textclear(s.getTxtcheckindate());
		sendKeys(s.getTxtcheckindate(), "29/06/2021");
		textclear(s.getTxtcheckoutdate());
		sendKeys(s.getTxtcheckoutdate(), "01/07/2021");
		selectbyindex(s.getSltadultperroom(), 2);
		selectbyindex(s.getSltchildperroom(), 1);
		btnclick(s.getBtnsearch());
	}

	@When("User should be in valid select hotel page")
	public void user_should_be_in_valid_select_hotel_page() {
	   String title1 = getTitle();
	   Assert.assertTrue("Current title", title1.contains("Select Hotel"));
	   System.out.println(title1);
	}

	@When("User should select the radio button and then click continue button for the selected Hotel")
	public void user_should_select_the_radio_button_and_then_click_continue_button_for_the_selected_Hotel() {
		Selecthotel e=new Selecthotel();
		 btnclick(e.getBtnselect());
		 btnclick(e.getBtncontinue());
	}

	@When("User should be in valid Book a Hotel page")
	public void user_should_be_in_valid_Book_a_Hotel_page() {
	   String title2 = getTitle();
	   Assert.assertTrue("current url", title2.contains("Book A Hotel"));
	   System.out.println(title2);
	}

	@When("User should enter first name, last name,billing address,Sixteen digits credit card number,credit card type,the Expiry month and year,valid cvv number, and click the book now button")
	public void user_should_enter_first_name_last_name_billing_address_Sixteen_digits_credit_card_number_credit_card_type_the_Expiry_month_and_year_valid_cvv_number_and_click_the_book_now_button() throws InterruptedException, IOException {
	    Bookhotel b=new Bookhotel();
//	    sendKeys(b.getTxtfirstname(), excelValue(0, 0));
//	    sendKeys(b.getTxtlastname(), excelValue(1, 0));
    
	    
		jsSendkeys("james",b.getTxtfirstname());
		jsSendkeys("praveen", b.getTxtlastname());
		Thread.sleep(3000);
		sendKeys(b.getTxtaddress(), "kannakuruchi salem tamilnadu");
		jsSendkeys("1231231231231231", b.getTxtcreditcardno());
		selectbyindex(b.getSltcredittype(), 2);
		selectbyindex(b.getSltccexpmonth(), 5);
		selectbyindex(b.getSltccexpyear(), 6);
		jsSendkeys("123", b.getTxtcvvno());
		btnclick(b.getBtnbooknow());
	}

	@When("User should be in valid Booking confimation page")
	public void user_should_be_in_valid_Booking_confimation_page() {
//	    String title3 = getTitle();
//	    Assert.assertTrue("check title", title3.contains("Booking Confirmation"));
//	    System.out.println(title3);
		String url = pageUrl();
		System.out.println(url);
		if(url.contains("http://adactinhotelapp.com/BookingConfirm.php")) {
			System.out.println("user in valid page");
		}
	}

	@Then("User should get the Order ID for the room booking")
	public void user_should_get_the_Order_ID_for_the_room_booking() {
		Bookingconfirmation g=new Bookingconfirmation();
	    String getvalue = getvalue(g.getRtnorderno());
	    System.out.println("booking id"+getvalue);
	}


}
