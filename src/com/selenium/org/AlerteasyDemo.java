package com.selenium.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlerteasyDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\i2356\\eclipse-workspace\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		WebElement SimpleAlert = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		SimpleAlert.click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		WebElement ConfirmAlert = driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[1]"));
		ConfirmAlert.click();
		Thread.sleep(3000);
		alert.dismiss();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		WebElement PromptAlert = driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[2]"));
		PromptAlert.click();
		alert.sendKeys("Welcome Rashmi");
		alert.accept();
	}

}
