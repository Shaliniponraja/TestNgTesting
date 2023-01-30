package Packagedemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handling1 {
	
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raja\\eclipse-workspace\\Seleniumdemo\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		Actions ac=new Actions(driver);
		WebElement findElement1 = driver.findElement(By.linkText("Today's Deals"));
		ac.contextClick(findElement1).build().perform();
		System.out.println("Windows Open");
		
		Robot R=new Robot();
		R.keyPress(KeyEvent.VK_DOWN);
		R.keyRelease(KeyEvent.VK_DOWN);
		
		R.keyPress(KeyEvent.VK_ENTER);
		R.keyRelease(KeyEvent.VK_ENTER);
		
		System.out.println("Success");
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		
		for (String ID : windowHandles) {
			String Status = driver.switchTo().window(ID).getTitle();
			System.out.println(Status);
			
		}
			String mystring="Amazon.com. Spend less. Smile more.";
			for (String ID : windowHandles) {
				if (driver.switchTo().window(ID).getTitle().equals(mystring)) {
					break;
					
				}	
			}
	}		
	}


