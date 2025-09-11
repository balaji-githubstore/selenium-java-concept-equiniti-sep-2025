package com.eq.frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1Hdfc {
	
	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		//switch to frame using webelement
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='login_page']")));
		
		//automate --> enter userid as john
		driver.findElement(By.name("fldLoginUserId")).sendKeys("jack2233");
		
		//click on Continue
		driver.findElement(By.linkText("CONTINUE")).click();
		
		//switch to main html
		driver.switchTo().defaultContent();
		
	}
}


