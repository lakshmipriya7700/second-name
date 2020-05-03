package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day4task1 {
	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\laksh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	 WebDriver driver= new ChromeDriver();
	 driver.get(" http://www.greenstechnologys.com ");
	 driver.manage().window().maximize();
	 WebElement textpara = driver.findElement(By.xpath("//p[contains(text(),'COMPLETE PRACTICAL TRAINING')]"));
	 String lastpara = textpara.getText();
	 System.out.println(lastpara);
	 
	 
	}

}
