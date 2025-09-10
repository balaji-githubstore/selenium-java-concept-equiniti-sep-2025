package com.eq.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1LaunchBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.medibuddy.in/");
		
		String actualTitle= driver.getTitle();
		System.out.println(actualTitle);

		String actualUrl= driver.getCurrentUrl();
		System.out.println(actualUrl);
		
		String actualSource= driver.getPageSource();
		System.out.println(actualSource);
		
	}
}
