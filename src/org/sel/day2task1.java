package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2task1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\laksh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(" https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement username = driver.findElement(By.id("email"));
	username.sendKeys("lakshmi@gmail.com");
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys("123456");
	
	
}
}

