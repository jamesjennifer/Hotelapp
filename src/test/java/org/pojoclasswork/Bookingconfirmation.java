package org.pojoclasswork;

import org.baseclasswork.Baseclasswork;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookingconfirmation extends Baseclasswork {
	
	
	
public Bookingconfirmation() {
		
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(id="order_n")
	private WebElement rtnorderno;

	

	public WebElement getRtnorderno() {
		return rtnorderno;
	}

}

