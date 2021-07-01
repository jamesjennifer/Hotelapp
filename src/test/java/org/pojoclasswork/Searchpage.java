package org.pojoclasswork;

import org.baseclasswork.Baseclasswork;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchpage extends Baseclasswork{
	
	
public Searchpage() {
		
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(id="location")
	private WebElement sltlocation;
	
	@FindBy(id="hotels")
	private WebElement slthotel;
	
	@FindBy(id="room_type")
	private WebElement sltroomtype;
	
	@FindBy(id="room_nos")
	private WebElement sltroomnos;
	
	@FindBy(id="datepick_in")
	private WebElement txtcheckindate;
	
	@FindBy(id="datepick_out")
	private WebElement txtcheckoutdate;
	
	@FindBy(id="adult_room")
	private WebElement sltadultperroom;
	
	@FindBy(id="child_room")
	private WebElement sltchildperroom;
	
	

	public WebElement getSltlocation() {
		return sltlocation;
	}

	public WebElement getSlthotel() {
		return slthotel;
	}

	public WebElement getSltroomtype() {
		return sltroomtype;
	}

	public WebElement getSltroomnos() {
		return sltroomnos;
	}

	public WebElement getTxtcheckindate() {
		return txtcheckindate;
	}

	public WebElement getTxtcheckoutdate() {
		return txtcheckoutdate;
	}

	public WebElement getSltadultperroom() {
		return sltadultperroom;
	}

	public WebElement getSltchildperroom() {
		return sltchildperroom;
	}

	public WebElement getBtnsearch() {
		return btnsearch;
	}


	@FindBy(id="Submit")
	private WebElement btnsearch;
}


