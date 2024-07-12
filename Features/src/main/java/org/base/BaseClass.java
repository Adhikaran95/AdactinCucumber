package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;
	
	public static void browser() {
		
		
		driver= new ChromeDriver();
	}
	
	
	public static void url(String s) {
		driver.get(s);
	}
	
	public static void Click(WebElement s) {
		s.click();

}
public static void SendKeys(WebElement Element,String s) {
	Element.sendKeys(s);
}

}

