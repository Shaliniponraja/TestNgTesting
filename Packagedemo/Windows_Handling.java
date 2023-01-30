 package Packagedemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling {
	 
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raja\\eclipse-workspace\\Seleniumdemo\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		Actions ac=new Actions(driver);
		Robot R=new Robot();
		
		WebElement grocery = driver.findElement(By.linkText("Grocery"));
		ac.contextClick(grocery).build().perform();
		System.out.println("Window Open");
		
		R.keyPress(KeyEvent.VK_DOWN);
		R.keyRelease(KeyEvent.VK_DOWN);
		
		R.keyPress(KeyEvent.VK_ENTER);
		R.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement click1 = driver.findElement(By.linkText("Become a Seller"));
		ac.contextClick(click1).build().perform();
		System.out.println("Windows open");
		
		
		R.keyPress(KeyEvent.VK_DOWN);
		R.keyRelease(KeyEvent.VK_DOWN);
		
		R.keyPress(KeyEvent.VK_ENTER);
		R.keyRelease(KeyEvent.VK_ENTER);
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		System.out.println();
		
		for (String ID : windowHandles) {
			String mystring = driver.switchTo().window(ID).getTitle();
			System.out.println(mystring);
			
		}
		String mystring="flipkart.com-Grocery";
		for (String ID : windowHandles) {
			if (driver.switchTo().window(ID).getTitle().equals(mystring)){
				 break;
				
			}
				
		}		
		
		System.out.println("Success");
	
		
	}

}
