 package Packagedemo;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handling3 {
	
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raja\\eclipse-workspace\\Seleniumdemo\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		Actions as=new Actions(driver);
		Robot R=new Robot();
		
		WebElement findElement1= driver.findElement(By.linkText("Travel"));
		as.contextClick(findElement1).build().perform();
		System.out.println("Windows open");
		
		R.keyPress(KeyEvent.VK_DOWN);
		R.keyRelease(KeyEvent.VK_DOWN);
		R.keyPress(KeyEvent.VK_ENTER);
		R.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement findElement2= driver.findElement(By.linkText("Appliances" ));
		as.contextClick(findElement1).build().perform();
		System.out.println("Windows Open");
		
		R.keyPress(KeyEvent.VK_DOWN);
		R.keyRelease(KeyEvent.VK_DOWN);
		R.keyPress(KeyEvent.VK_ENTER);
		R.keyRelease(KeyEvent.VK_ENTER);
		
		Set<String> windowHandle = driver.getWindowHandles();
		System.out.println(windowHandle);
		
		for (String ID : windowHandle) {
			String title = driver.switchTo().window(ID).getTitle();
			System.out.println(title);
			
		}
		
		String Mystring="Online Shopping Site for Mobiles";
		for (String ID : windowHandle) {
		if(driver.switchTo().window(ID).getTitle().equals(Mystring)) {
			break;
		}
	}
}}   


