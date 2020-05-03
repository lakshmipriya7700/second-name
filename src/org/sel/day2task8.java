package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2task8 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\laksh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(" https://www.instagram.com/accounts/login/?hl=en) login page");
	driver.manage().window().maximize();
   WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
   username.sendKeys("lakshmipriya");
   WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
   pass.sendKeys("23445757");
   
   
   
   
   

    
	
	
}
}
