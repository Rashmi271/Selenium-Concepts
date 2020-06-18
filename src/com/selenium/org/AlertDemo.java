package com.selenium.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\i2356\\eclipse-workspace\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement SimpleAlert = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
		SimpleAlert.click();
		Thread.sleep(2000);
		WebElement sAlert = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		sAlert.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		WebElement ConfirmAlert = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		ConfirmAlert.click();
		Thread.sleep(2000);
		WebElement cAlert = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		cAlert.click();
		Thread.sleep(2000);
		alert.dismiss();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		WebElement PromptAlert = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		PromptAlert.click();
		Thread.sleep(2000);
		WebElement pAlert = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		pAlert.click();
		alert.sendKeys("Rashmi");
		alert.accept();
		}

}
