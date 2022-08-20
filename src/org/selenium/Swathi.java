package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swathi {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"F:\\swathi\\workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.flipkart.com/ ");
		WebElement sear = driver.findElement(By.xpath("//input[@type='text']"));
	    sear.sendKeys("iphone 12");
	    WebElement btn = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
	    
	    btn.submit();
	    
	
	}

}
