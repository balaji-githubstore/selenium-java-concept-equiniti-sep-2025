package com.eq.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3SalesForce {

	public static void main(String[] args) {

		// span[text()='Next']
		// driver.findElement(By.linkText("NEXT")).click();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.name("UserFirstName")).sendKeys("John");

		driver.findElement(By.name("UserLastName")).sendKeys("wick");

		driver.findElement(By.name("UserTitle")).sendKeys("IT Manager");

		driver.findElement(By.xpath("//a[@data-page-cntrl='next']")).click();

		Select obj = new Select(driver.findElement(By.name("CompanyEmployees")));

		obj.selectByVisibleText("21 - 200 employees");

		driver.findElement(By.xpath("//input[@data-cs-override-id='CompanyName']")).sendKeys("Equiniti");

		Select obj1 = new Select(driver.findElement(By.xpath("//select[@data-cs-override-id='CompanyCountry']")));
		obj1.selectByValue("GB");

		driver.findElement(By.xpath("//span[text()='Next']")).click();

		driver.findElement(By.name("UserEmail")).sendKeys("john@gmail.com");

		driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[2]")).click();

		driver.findElement(By.xpath("//button[text()='Submit']")).click();

//				System.out.println(driver.findElement(By.xpath("//input[@name='UserPhone']//following-sibling::span")).getText());	

	}

}
