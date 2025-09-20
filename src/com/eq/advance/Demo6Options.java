package com.eq.advance;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo6Options {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized");
		//options.addArguments("--headless");
		options.addArguments("--disable-notifications");
		
		HashMap<String, String> map=new HashMap<String, String>();
		map.put("deviceName", "Nexus 5");
		 
		options.setExperimentalOption("mobileEmulation", map);
		
		WebDriver driver = new ChromeDriver(options);
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.malaysiaairlines.com/us/en/home.html");
		
		//approach 1
		//driver.findElement(By.xpath("//div[@id='book-flight']//input[@name='dateDeparture']")).sendKeys("29 Sep 2025");

		System.out.println(driver.getTitle());
		//span[text()='Accept all cookies']
		//driver.quit();
	}

}
