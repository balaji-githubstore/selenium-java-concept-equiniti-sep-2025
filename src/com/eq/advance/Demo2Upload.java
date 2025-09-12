package com.eq.advance;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2Upload {

	public static void main(String[] args) {

		File file=new File("session notes/xpath.txt");
		String absPath= file.getAbsolutePath();
		System.out.println(absPath);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.ilovepdf.com/pdf_to_word");
	
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(absPath);
		
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		x
//		driver.get("https://www.ilovepdf.com/pdf_to_word");
	}

}
