package com.eq.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3Nascom {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.nasscom.in/nasscom-membership");
		
		//enter companyname as Equiniti
		driver.findElement(By.xpath("//input[@placeholder='Company Name in India*']")).sendKeys("EQ");
		
		//enter address as Chennai
		driver.findElement(By.id("edit-field-address-line-1-0-value")).sendKeys("Chennai");
		
		
		Select selectCompanyCategory=new Select(driver.findElement(By.id("edit-field-company-type")));
		selectCompanyCategory.selectByVisibleText("Indian");
		
		Select selectTech=new Select(driver.findElement(By.id("edit-field-membership-type")));
		selectTech.selectByVisibleText("Ecosystem Enablers");
		
		//city as chennai
		//state as tamil nadu
		
		//accept the all terms (select both the checkbox) 
		
		//click on submit
		
		
	}
}
