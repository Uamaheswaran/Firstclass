package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
 
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class WasteBatch {


	public static void main(String[] args) throws InterruptedException, IOException {
		

			System.setProperty("webdriver.chrome.driver",
					"F:\\Uma\\workspace\\Selenium\\Drivers\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver ();
			
			driver.get("http://greenstech.in/selenium-course-content.html");
			Thread.sleep(5000);
	TakesScreenshot ts=(TakesScreenshot)driver;
	
	File src= ts.getScreenshotAs(OutputType.FILE);
			
	File green=new File("C:\\Users\\91861\\eclipse-workspace\\org.selenium\\Screenshot\\green.png");
		Files.copy(src,green);
			
		}

	






		
		}

	


