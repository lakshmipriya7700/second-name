package org.sel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day8task1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\laksh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html\r\n");
		driver.manage().window().maximize();
		WebElement btnsimpleal = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		btnsimpleal.click();
		
		//alert
		Alert alt=driver.switchTo().alert();
		
		//simple alert
		alt.accept();
		
		WebElement btnconfirm = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		btnconfirm.click();
		WebElement btntocheck = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		btntocheck.click();
		// confirm alert 
		alt.dismiss();
		
		WebElement btntext = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		btntext.click();
		WebElement text = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		text.click();
		//prompt alert(text)
		
		Alert alt2=driver.switchTo().alert();
	    alt2.sendKeys("lakshmi");
	    alt2.accept();
		
		
		
		
		
		
		
		
	}

}
