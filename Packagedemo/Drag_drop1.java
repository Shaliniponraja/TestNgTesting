package Packagedemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop1 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raja\\eclipse-workspace\\Seleniumdemo\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		Actions ac=new Actions(driver);
		
	WebElement result = driver.findElement(By.linkText("Become a Seller"));
ac.contextClick(result).build().perform();
 System.out.println("Performed sucessfully");
 
 Robot R=new Robot();
 R.keyPress(KeyEvent.VK_DOWN);
 R.keyRelease(KeyEvent.VK_DOWN);
 
 R.keyPress(KeyEvent.VK_ENTER);
 R.keyRelease(KeyEvent.VK_ENTER);
 
 driver.navigate().back();
 
 System.out.println("Sucess");
 
 
	}

	
}
