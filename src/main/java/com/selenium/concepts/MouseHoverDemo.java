package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseHoverDemo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\i2356\\eclipse-workspace\\SeleniumConcepts\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
	WebElement SignIn = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
	SignIn.click();
	Thread.sleep(4000);
	
	WebElement CreateMail = driver.findElement(By.id("email_create"));
	CreateMail.sendKeys("Rashmi123.g@yahoo.com");
	Thread.sleep(4000);

	WebElement CreateAccount = driver.findElement(By.id("SubmitCreate"));
	CreateAccount.click();
	Thread.sleep(4000);
	
	WebElement Title = driver.findElement(By.id("id_gender2"));
	Title.click();
	Thread.sleep(4000);
	
	WebElement FirstName = driver.findElement(By.id("customer_firstname"));
	FirstName.sendKeys("Rashmi");
	Thread.sleep(4000);
	
	WebElement LastName = driver.findElement(By.id("customer_lastname"));
	LastName.sendKeys("G");
	Thread.sleep(4000);
	
	WebElement Password = driver.findElement(By.id("passwd"));
	Password.sendKeys("Rashmi@12356");
	Thread.sleep(4000);
	
	WebElement day = driver.findElement(By.id("days"));
	Select d = new Select(day);
	d.selectByIndex(3);
	Thread.sleep(4000);
	
	WebElement month = driver.findElement(By.id("months"));
	Select m = new Select(month);
	m.selectByValue("4");
	Thread.sleep(4000);
	
	WebElement year = driver.findElement(By.id("years"));
	Select y = new Select(year);
	y.selectByVisibleText("2016  ");
	Thread.sleep(4000);
	
	WebElement Signup = driver.findElement(By.id("newsletter"));
	Signup.click();
	Thread.sleep(4000);
	
	WebElement SpecialOffers = driver.findElement(By.id("optin"));
	SpecialOffers.click();
	Thread.sleep(4000);
	
	WebElement Company = driver.findElement(By.id("company"));
	Company.sendKeys("ABC");
	Thread.sleep(4000);
	
	WebElement Address1 = driver.findElement(By.id("address1"));
	Address1.sendKeys("123 Main St,PO BOX 7530,ABC Company");
	Thread.sleep(4000);
	
    WebElement Address2 = driver.findElement(By.id("address2"));
    Address2.sendKeys("Awwd,60/23,2nd floor");
	Thread.sleep(4000);
	
	WebElement City = driver.findElement(By.id("city"));
	City.sendKeys("US");
	Thread.sleep(4000);
	
	WebElement State = driver.findElement(By.id("id_state"));
	Select s = new Select(State);
	s.selectByVisibleText("California");
	Thread.sleep(4000);
	
	WebElement ZipCode = driver.findElement(By.id("postcode"));
	ZipCode.sendKeys("76547");
	Thread.sleep(4000);
	
	WebElement Country = driver.findElement(By.id("id_country"));
	Select c = new Select(Country);
	c.selectByVisibleText("United States");
	Thread.sleep(4000);
	
	WebElement AdditionalInfo = driver.findElement(By.id("other"));
	AdditionalInfo.sendKeys("Yes");
	Thread.sleep(4000);
	
	WebElement hPhone = driver.findElement(By.id("phone"));
	hPhone.sendKeys("1234567890");
	Thread.sleep(4000);
	
	WebElement mPhone = driver.findElement(By.id("phone_mobile"));
	mPhone.sendKeys("7834567899");
	Thread.sleep(4000);
	
	WebElement Ref = driver.findElement(By.id("alias"));
	Ref.sendKeys("12324ref");
	Thread.sleep(4000);
	
	WebElement Register = driver.findElement(By.id("submitAccount"));
	Register.click();
	Thread.sleep(4000);
	
	System.out.println("Registered Successfully");
	
	WebElement Women = driver.findElement(By.xpath("//a[@title='Women']"));
	Actions ac = new Actions(driver);
	ac.moveToElement(Women).perform();
	Thread.sleep(4000);
	
	WebElement tShirt = driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]"));
	tShirt.click();
	Thread.sleep(4000);
}
}
