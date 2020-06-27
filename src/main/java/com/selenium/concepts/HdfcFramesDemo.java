package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcFramesDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\i2356\\eclipse-workspace\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		WebElement frame1 = driver.findElement(By.xpath("/html/frameset/frameset/frame[1]"));
		driver.switchTo().frame(frame1);
		System.out.println("Switched to first frame");
		Thread.sleep(4000);
		
		WebElement textbox = driver.findElement(By.xpath("//input[@class='input_password']"));
		textbox.sendKeys("123456");
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		

	}

}
