package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day4task5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\laksh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" http://www.greenstechnologys.com/index.html");
		driver.manage().window().maximize();
		WebElement address = driver.findElement(By.xpath("//*[@id=\"article-wrapper\"]/div[2]/p"));
		String add = address.getText();
		System.out.println(add);
		
		
		
		
	}

}
