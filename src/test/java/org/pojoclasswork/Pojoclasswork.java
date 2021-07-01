package org.pojoclasswork;

import org.baseclasswork.Baseclasswork;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojoclasswork extends Baseclasswork{
	
	
public Pojoclasswork() {
		
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="username")
	private WebElement txtUsername;

	@FindBy(id="password")
	private WebElement txtPassword;
		
	@FindBy(id="login")
	private WebElement btnLogin;
	
	
	

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}	
	
	
	
	
	
	
}
