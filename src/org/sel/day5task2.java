package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class day5task2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\laksh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html \r\n");

		WebElement s = driver.findElement(By.xpath("//a[@class='button button-orange'][1]"));
		WebElement d = driver.findElement(By.xpath("//li[@class='placeholder'][1]"));
		Actions acc = new Actions(driver);
		acc.dragAndDrop(s, d).perform();

	}
}


