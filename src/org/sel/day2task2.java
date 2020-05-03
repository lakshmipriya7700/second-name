package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2task2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\laksh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.redbus.in/ ");
	driver.manage().window().maximize();
	WebElement txtfrom = driver.findElement(By.id("src"));
	txtfrom.sendKeys("chennai");
	WebElement txtdest = driver.findElement(By.id("dest"));
	txtdest.sendKeys("manali");
	
	
	
	
}
}
