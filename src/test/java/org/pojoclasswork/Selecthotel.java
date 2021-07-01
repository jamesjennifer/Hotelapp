package org.pojoclasswork;

import org.baseclasswork.Baseclasswork;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selecthotel extends Baseclasswork {
	
public Selecthotel() {
		
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(id="radiobutton_0")
	private WebElement btnselect;
	
	@FindBy(id="continue")
	private WebElement btncontinue;
	
	
	

	public WebElement getBtnselect() {
		return btnselect;
	}

	public WebElement getBtncontinue() {
		return btncontinue;
	}
	
	
	
	
	
	
}
