package Packagedemo;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Alert {
	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raja\\eclipse-workspace\\Seleniumdemo\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/alert");
		
		
		driver.findElement(By.id("accept")).click();
	    driver.switchTo().alert().accept();
		
		System.out.println("Simple alert successfully excecuted");
		
		driver.findElement(By.id("confirm")).click();
		driver.switchTo().alert().dismiss();
		System.out.println("Confirm alert successfully excecuted");
		
		Thread.sleep(2000);
		driver.findElement(By.id("prompt")).click();
		org.openqa.selenium.Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("123");
		prompt.accept();
		System.out.println("prompt alert successfully excecuted");
		
		  
		Thread.sleep(2000);
		
		Robot R=new Robot();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle=new Rectangle(screenSize);
		BufferedImage Sourcefile = R.createScreenCapture(rectangle);
	//	TakesScreenshot Ts=(TakesScreenshot) driver;
	//	File Sourcefile=Ts.getScreenshotAs(OutputType.FILE);
		File Destinationfile=new File("C:\\Users\\Raja\\eclipse-workspace\\Seleniumdemo\\Screen\\letcode.png");
	//	FileHandler.copy(Sourcefile,Destinationfile);	
	ImageIO.write(Sourcefile, "png", Destinationfile);
		
	}

}
