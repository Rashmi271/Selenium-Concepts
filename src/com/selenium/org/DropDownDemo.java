package com.selenium.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\i2356\\eclipse-workspace\\SeleniumConcepts\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        
        driver.manage().window().maximize();
		Thread.sleep(1000);
     
		WebElement day = driver.findElement(By.id("day"));
		Select d = new Select(day);
		d.selectByIndex(27);
		Thread.sleep(3000);
		
		WebElement month = driver.findElement(By.id("month"));
		Select m = new Select(month);
		m.selectByValue("11");
		Thread.sleep(3000);
		
		WebElement year = driver.findElement(By.id("year"));
		Select y = new Select(year);
		y.selectByVisibleText("1992");
		
		List<WebElement> options = d.getOptions();
	    for(WebElement dd:options) {
		System.out.println(dd.getText());
	    }
		
	}
}
