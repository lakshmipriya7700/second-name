package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day4task6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\laksh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("lakshmipriya@gmail.com");
		String mailid = email.getText();
		System.out.println(mailid);
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("Subbi1234");
		String pass = password.getText();
		System.out.println(pass);

	}
}
