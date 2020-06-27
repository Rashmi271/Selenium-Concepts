package com.selenium.concepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DragDropDemo2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\i2356\\eclipse-workspace\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		WebElement fname = driver.findElement(By.id("fname"));
		Actions ac = new Actions(driver);
		ac.sendKeys(fname, "Automation Testing").perform();
		Thread.sleep(4000);
		
		WebElement submit = driver.findElement(By.id("idOfButton"));
	    ac.click(submit).perform();;
		Thread.sleep(4000);
		
		WebElement dbclick = driver.findElement(By.id("dblClkBtn"));
		ac.doubleClick(dbclick).perform();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		
		WebElement Gender = driver.findElement(By.id("female"));
		ac.click(Gender).perform();
		Thread.sleep(4000);
		
		WebElement Atesting = driver.findElement(By.xpath("//input[@class='Automation']"));
		ac.click(Atesting).perform();
		Thread.sleep(4000);
		
		WebElement Ptesting = driver.findElement(By.xpath("//input[@class='Performance']"));
		ac.click(Ptesting).perform();
		Thread.sleep(4000);
		
		WebElement Ddown = driver.findElement(By.id("testingDropdown"));
		Select dd = new Select(Ddown);
		dd.selectByVisibleText("Automation Testing");
		Thread.sleep(5000);
		
		WebElement src = driver.findElement(By.id("sourceImage"));
		WebElement des = driver.findElement(By.id("targetDiv"));
		ac.dragAndDrop(src, des).perform();
		Thread.sleep(5000);
		
		System.out.println("Automation Completed Successfully");
		
	}

}
