package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day4task3 {
	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\laksh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("http://www.greenstechnologies.in/selenium-training.php");
    driver.manage().window().maximize();
    WebElement firstpara = driver.findElement(By.xpath("//p[contains(text(),'companies')]"));
    String para1 = firstpara.getText();
    System.out.println(para1);
    WebElement secondpara = driver.findElement(By.xpath("//p[contains(text(),'industry')]"));
    String para2 = secondpara.getText();
    System.out.println(para2);
	}
}
