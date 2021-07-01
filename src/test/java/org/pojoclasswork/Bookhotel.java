package org.pojoclasswork;

import org.baseclasswork.Baseclasswork;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookhotel extends Baseclasswork{
	
public Bookhotel() {
		
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(id="first_name")
	private WebElement txtfirstname;
	
	@FindBy(id="last_name")
	private WebElement txtlastname;
	
	@FindBy(id="address")
	private WebElement txtaddress;
	
	@FindBy(id="cc_num")
	private WebElement txtcreditcardno;
	
	@FindBy(id="cc_type")
	private WebElement sltcredittype;
	
	@FindBy(id="cc_exp_month")
	private WebElement sltccexpmonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement sltccexpyear;
	
	@FindBy(id="cc_cvv")
	private WebElement txtcvvno;
	
	
	
	
	
	
	public WebElement getTxtfirstname() {
		return txtfirstname;
	}

	public WebElement getTxtlastname() {
		return txtlastname;
	}

	public WebElement getTxtaddress() {
		return txtaddress;
	}

	public WebElement getTxtcreditcardno() {
		return txtcreditcardno;
	}

	public WebElement getSltcredittype() {
		return sltcredittype;
	}

	public WebElement getSltccexpmonth() {
		return sltccexpmonth;
	}

	public WebElement getSltccexpyear() {
		return sltccexpyear;
	}

	public WebElement getTxtcvvno() {
		return txtcvvno;
	}

	public WebElement getBtnbooknow() {
		return btnbooknow;
	}


	@FindBy(id="book_now")
	private WebElement btnbooknow;
}


