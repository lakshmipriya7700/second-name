package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2task6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\laksh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://www.swiggy.com/");
		driver.manage().window().maximize();
		WebElement locationbox = driver.findElement(By.xpath("//input[@type='text']"));
		locationbox.sendKeys("no 7,thirumalai nagar,perungudi");
		
		
		
	}

}
