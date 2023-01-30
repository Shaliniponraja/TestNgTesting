 package Packagedemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_qavbox {
	
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raja\\eclipse-workspace\\Seleniumdemo\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("userName")).sendKeys("Shalini");
		driver.findElement(By.id("userEmail")).sendKeys("Srshalini8@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("no:12 kallikuppam,ambattur");
		driver.findElement(By.id("permanentAddress")).sendKeys("no:12 kallikuppam,ambattur");
		driver.findElement(By.id("submit")).click();
		
		Robot R=new Robot();
		R.keyPress(KeyEvent.VK_DOWN);
		R.keyRelease(KeyEvent.VK_DOWN);
		
		R.keyPress(KeyEvent.VK_ENTER);
		R.keyRelease(KeyEvent.VK_ENTER);
		
		System.out.println("Success");

	}}

