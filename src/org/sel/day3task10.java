

package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day3task10 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\laksh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	    WebElement signin = driver.findElement(By.xpath("//span[text()='Hello. Sign in']"));
	    signin.click();
	    WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
	    email.sendKeys("lakshmipriya@gmail.com");
	    WebElement btncont = driver.findElement(By.xpath("//input[@id='continue']"));
	    btncont.click();
	    
	    
	    
	}

}
