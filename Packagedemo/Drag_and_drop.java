package Packagedemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Drag_and_drop {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raja\\eclipse-workspace\\Seleniumdemo\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropable");
		Actions ac=new Actions(driver);
		WebElement Source = driver.findElement(By.id("draggable"));
		WebElement dest = driver.findElement(By.id("droppable"));
		ac.dragAndDrop(Source, dest).build().perform();
		System.out.println("Target successfully");
		
		driver.navigate().to("https://www.amazon.in/");
		WebElement accountL = driver.findElement(By.id("nav-link-accountList"));
		ac.moveToElement(accountL).build().perform();
		System.out.println("Box visible");
		
		WebElement Kitchen = driver.findElement(By.linkText("Electronics"));
		ac.contextClick(Kitchen).build().perform();
		System.out.println("Sucessfully click");
		
		
		//Keyboard Actions:
		Robot R=new Robot();
		// Keypress
		R.keyPress(KeyEvent.VK_DOWN);
		//Keyrelease
		R.keyRelease(KeyEvent.VK_DOWN);
		
		R.keyPress(KeyEvent.VK_ENTER);
		R.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.linkText("Mobiles")).click();
		System.out.println("Successfully clicked");
		
		TakesScreenshot Ts=(TakesScreenshot) driver;
		File sourcefile=Ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Raja\\eclipse-workspace\\Seleniumdemo\\Screen\\amazon.png");
		FileHandler.copy(sourcefile, destination);
		
		driver.navigate().back();
		System.out.println("Running Sucessfully");
		
	}
	
	

}
