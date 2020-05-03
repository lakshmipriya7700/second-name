package org.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day3task3 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\laksh\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html\r\n");
		driver.manage().window().maximize();
		WebElement txtfirst = driver.findElement(By.xpath("//input[@type='text'][1]"));
		txtfirst.sendKeys("lakshmi");
		WebElement txtlast = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		txtlast.sendKeys("priya");
		WebElement txtadd = driver.findElement(By.xpath("//textarea[@rows='3']"));
		txtadd.sendKeys("no 7, 4th cross street, thirumalai nagar annexe,perungudi,chennai");
		WebElement txtemail = driver.findElement(By.xpath("//input[@type='email']"));
		txtemail.sendKeys("lakshmipriya.subi@gmail.com");
		WebElement phno = driver.findElement(By.xpath("//input[@type='tel']"));
		phno.sendKeys("9884494668");
		WebElement btngender = driver.findElement(By.xpath("//input[@value='FeMale']"));
		btngender.click();
		WebElement btncricket = driver.findElement(By.xpath("//input[@value='Cricket']"));
		btncricket.click();
		WebElement btnmovies = driver.findElement(By.xpath("//input[@value='Movies']"));
		btnmovies.click();
		WebElement lang = driver.findElement(By.id("msdd"));
		lang.click();
		WebElement eng = driver.findElement(By.xpath("//a[text()='English']"));
		eng.click();
		WebElement txtlang = driver.findElement(By.xpath("//label[text()='Languages']"));
		txtlang.click();
		WebElement btnskills = driver.findElement(By.id("Skills"));
		btnskills.click();
		Robot r = new Robot();
		for (int i = 1; i < 11; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement btncountries = driver.findElement(By.id("countries"));
		btncountries.click();

		btncountries.sendKeys("india");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement countries1 = driver.findElement(By.xpath("//span[@role='combobox']"));
		countries1.click();
		for (int i = 1; i < 6; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement btnyear = driver.findElement(By.id("yearbox"));
		btnyear.click();
		btnyear.sendKeys("1996");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
        WebElement btnmonth = driver.findElement(By.xpath("//select[@placeholder='Month']"));
        btnmonth.click();
        btnmonth.sendKeys("december");
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        WebElement btnday = driver.findElement(By.xpath("//select[@placeholder='Day']"));
        btnday.click();
        btnday.sendKeys("20");
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        WebElement pass = driver.findElement(By.id("firstpassword"));
        pass.click();
        pass.sendKeys("Lakshmi2604");
        WebElement secondpass = driver.findElement(By.id("secondpassword"));
        secondpass.click();
        secondpass.sendKeys("Lakshmi2604");
        
        
        
        
        
	}

}
