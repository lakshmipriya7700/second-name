package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day4task2 {
	public static void main(String[] args) {
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\laksh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("http://www.greenstechnologies.in/selenium-training.php");
     driver.manage().window().maximize();
     WebElement thirdpara = driver.findElement(By.xpath("//p[contains(text(),'working professionals')]"));
     String para = thirdpara.getText();
     System.out.println(para);
     
	}
}
