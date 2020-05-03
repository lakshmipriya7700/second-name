package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class day3task1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\laksh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		WebElement cont = driver.findElement(By.xpath("//a[text()='CONTACT US']"));
		cont.click();
		WebElement name = driver.findElement(By.xpath("//input[@type='text'][1]"));
		name.sendKeys("lakshmipriya");
		WebElement email = driver.findElement(By.xpath("//input[@id='InputName']"));
		email.sendKeys("lakshmipriya@gmail.com");
		WebElement phno = driver.findElement(By.xpath("//input[@name='phone'][1]"));
		phno.sendKeys("8946050375");
		WebElement course = driver.findElement(By.xpath("//select[@name='courses'][1]"));
		course.click();
		Select s=new Select(course);
		s.selectByIndex(6);
		WebElement branch = driver.findElement(By.xpath("//select[@name='branch'][1]"));
		branch.click();
		Select s1=new Select(branch);
		s1.selectByVisibleText("OMR");
		WebElement time = driver.findElement(By.xpath("//select[@name='time'][1]"));
		time.click();
		Select s2=new Select(time);
		s2.selectByIndex(1);
		WebElement message = driver.findElement(By.xpath("//textarea[@placeholder='Message*']"));
		message.sendKeys("course details are given");
		
		
		
		
		
		
		
	}

}
