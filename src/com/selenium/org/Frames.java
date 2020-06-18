package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\i2356\\eclipse-workspace\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[1]")).click();
		Thread.sleep(4000);
		
		WebElement Frame1 = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(0);
		System.out.println("Switched to first frame");
		Thread.sleep(4000);
		
		WebElement textbox = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		textbox.sendKeys("Automation Testing");
		driver.switchTo().defaultContent();
		Thread.sleep(4000);
		
	   driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
	   Thread.sleep(4000);
	   
	   WebElement Frame2 = driver.findElement(By.xpath("//div[@id=\"Multiple\"]/iframe"));
	   driver.switchTo().frame(Frame2);
	   System.out.println("Switched to second frame");
	   Thread.sleep(4000);
	   
	   WebElement Frame3 = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
	   driver.switchTo().frame(Frame3);
	   System.out.println("Switched to third frame");
	   Thread.sleep(4000);
	   
	   WebElement textbox2 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	   textbox2.sendKeys("Testing");
	   driver.switchTo().defaultContent();
	   Thread.sleep(4000);
	}
	

}
