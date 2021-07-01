package org.baseclasswork;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclasswork {

public static WebDriver driver;
	
	public static void chromeBrowser() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		}

		public static void implicitWait() {
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		}

		public static void deleteCookies() {
			driver.manage().deleteAllCookies();
		}

		public static void maxBrowser() {
		driver.manage().window().maximize();
		}

		public static void sendKeys(WebElement locators,String Entertext) {
			locators.sendKeys(Entertext);
		}
		

		

		public static void launchUrl(String url) {
			driver.get(url);
		}

		public static void btnclick(WebElement locator) {
			locator.click();
		}
		
		public static void textclear(WebElement locator) {
			locator.clear();
		}

		public static String pageUrl() {
			String url = driver.getCurrentUrl();
		return url;
		}
		
		public static void selectbyindex(WebElement locator,int index) {
			Select S=new Select(locator);
			S.selectByIndex(index);
		}
		
		public static void selectbyvalue(WebElement locator,String value) {
			Select S=new Select(locator);
			S.selectByValue(value);
		}
		
		public static void selectbytext(WebElement locator,String text) {
	         Select S=new Select(locator);
	         S.selectByVisibleText(text);
		}
		
		public static String getvalue(WebElement locator) {
			String value = locator.getAttribute("value");
            return value;
		}

		public static void quitWindow() {
			driver.quit();

		}
		public static void closeWindow() {
			driver.close();

		}
		
		public static String getTitle() {
		String title = driver.getTitle();
        return title;
		}
		public static void jsSendkeys(String entertext,WebElement locator) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].setAttribute('value', '"+entertext+"')",locator);

		}
		
		public static String jsGetvalue(WebElement locator) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
        Object script = js.executeScript("return argument[0].getAttribute('value')", locator);
        System.out.println(script);
        String s=(String)script;
        System.out.println(s);
        String s1 = (String)js.executeScript("return argument[0].getAttribute('value')", locator);
        System.out.println(s1);
return s1;
		}
		
		public static void takesSnap(String filename) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\ADMIN\\eclipse-workspace\\Adactincucu\\src\\test\\resources\\screenshot\\"+filename+".png");
		FileUtils.copyFile(src, dest);
		}
			
//		public static String excelValue(int rowno, int cellno)throws IOException {
//		XSSFWorkbook wb=new XSSFWorkbook("C:\\Users\\ADMIN\\eclipse-workspace\\Adactincucu\\excel\\excelbook.xlsx");
//		XSSFSheet sh=wb.getSheet("Sheet1");
//		String value =sh.getRow(rowno).getCell(cellno).getStringCellValue();
//        wb.close();
//        return value;
				
}

	
	
	

