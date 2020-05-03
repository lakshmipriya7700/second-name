package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day3task9 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\laksh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		WebElement btncreate = driver.findElement(By.xpath("//a[text()='New to Flipkart? Create an account']"));
		btncreate.click();
		WebElement phno = driver.findElement(By.xpath("//input[@maxlength='10']"));
		phno.sendKeys("8946050375");
		WebElement sumit = driver.findElement(By.xpath("//button[@type='submit'][2]"));
		sumit.click();
		

	}
}
