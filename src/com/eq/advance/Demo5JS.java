package com.eq.advance;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo5JS {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.malaysiaairlines.com/us/en/home.html");
		
		driver.findElement(By.xpath("//span[text()='Accept all cookies']")).click();
		
		//approach 1
		//driver.findElement(By.xpath("//div[@id='book-flight']//input[@name='dateDeparture']")).sendKeys("29 Sep 2025");

		//approach 2 - automate calendar 
		
		//approach 3 - js 
		//document.querySelector("div[id='book-flight'] input[name='dateDeparture']").value='20 Sep 2025'
		
		//pure js
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.querySelector(\"div[id='book-flight'] input[name='dateDeparture']\").value='20 Sep 2025'");
		
		//js and webelement
		var ele1= driver.findElement(By.xpath("//div[@id='book-flight']//input[@name='dateDeparture']"));
		js.executeScript("arguments[0].value='20 Sep 2025'",ele1);
		
		//var a=10.2;
		
	//	js.executeScript("document.querySelector('[deployment-dev-name=\"page_builder_miaw_ui\"]').shadowRoot.querySelector('button[data-testid=\"minimize-button\"]').click()");
	
		
		//document.querySelector('[deployment-dev-name="page_builder_miaw_ui"]').shadowRoot.querySelector('button[data-testid="minimize-button"]')
		
		var shadow1= driver.findElement(By.cssSelector("[deployment-dev-name=\"page_builder_miaw_ui\"]")).getShadowRoot();
		shadow1.findElement(By.cssSelector("button[data-testid=\"minimize-button\"]")).click();
		
		String value= (String) js.executeScript("return document.querySelector(\"div[id='book-flight'] input[name='dateDeparture']\").value");
		
	}
}


