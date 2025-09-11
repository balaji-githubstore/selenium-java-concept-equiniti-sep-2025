package com.eq.tabs;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2Tabs {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.db4free.net/");

		driver.findElement(By.partialLinkText("phpMyAdmin")).click();
		
		//switch to 2nd tab 
		ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));
		
		//enter username as admin
		//enter password as admin123
		//click on login
		
		driver.close(); //check what is happening? 
		
		//switch to 1st tab
		driver.switchTo().window(windows.get(0));
		
		System.out.println(driver.getTitle());
		
		driver.quit(); //close browser
	}

}
