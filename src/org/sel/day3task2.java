package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day3task2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\laksh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("lakshmipriya@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@type='password'][1]"));
		pass.sendKeys("subbi12345");
		WebElement btnlogin = driver.findElement(By.xpath("//input[@value='Log In']"));
		btnlogin.click();
		
		
		
	}

}
