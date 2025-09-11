package com.eq.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2MeddibuddyBasics {

	public static void main(String[] args)  {

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.medibuddy.in/");  //wait for page load to complete
		
		//findElement checks for the locator in 0.5s (500ms) 
		
		
//		By locator= By.linkText("Login");
//		WebElement element= driver.findElement(locator);
//		element.click();
		

//		WebElement element= driver.findElement(By.linkText("Login"));
//		element.click();
		
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.id("phone")).sendKeys("38838747");
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();

	}

}
