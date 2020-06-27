package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\i2356\\eclipse-workspace\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		WebElement src = driver.findElement(By.id("credit2"));
		WebElement des = driver.findElement(By.id("bank"));
		Actions ac = new Actions(driver);
		ac.dragAndDrop(src, des).perform();
		Thread.sleep(3000);
		
		WebElement amount = driver.findElement(By.id("fourth"));
		WebElement dropamount = driver.findElement(By.id("amt7"));
		ac.dragAndDrop(amount, dropamount).perform();
		Thread.sleep(3000);
		
		
		WebElement src2 = driver.findElement(By.id("credit1"));
		WebElement des2 = driver.findElement(By.id("loan"));
		ac.dragAndDrop(src2, des2).perform();
		Thread.sleep(3000);
		
		WebElement amount2 = driver.findElement(By.id("fourth"));
		WebElement dropamount2 = driver.findElement(By.id("amt8"));
		ac.dragAndDrop(amount2, dropamount2).perform();
		Thread.sleep(3000);
		
		
	}

}
