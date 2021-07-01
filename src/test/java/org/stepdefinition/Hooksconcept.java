package org.stepdefinition;

import java.io.IOException;

import org.baseclasswork.Baseclasswork;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooksconcept extends Baseclasswork{

	@Before
	public void beforeScenario() {
		chromeBrowser();
        maxBrowser();
        implicitWait();
	}
	
	@After
	public void afterScenario(Scenario s) throws IOException {
		if(s.isFailed()) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
		s.embed(screenshot, "image/png");
//		String name = s.getName();
//	takesSnap("orderid");
	//quitWindow();

	
	}	
	}}
