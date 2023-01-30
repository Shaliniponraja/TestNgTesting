package Packagedemo;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1 {
	
	public static void main(String[] args) throws IOException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raja\\eclipse-workspace\\Seleniumdemo\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/");
		driver.manage().window().maximize();
		
		//TakesScreenshot Sc=(TakesScreenshot) driver;
		//File sourcefile=Sc.getScreenshotAs(OutputType.FILE);
		//File destination=new File("C:\\Users\\Raja\\eclipse-workspace\\Seleniumdemo\\Screen\\globalsqa.png ");
	// FileHandler.copy(sourcefile,destination);
	 
	 Robot R=new Robot();
	 Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
	 Rectangle rectangle=new Rectangle(screensize);
		BufferedImage source = R.createScreenCapture(rectangle);
		File destination1=new File("C:\\Users\\Raja\\eclipse-workspace\\Seleniumdemo\\Screen\\globalsqa.png");
		ImageIO.write(source, "png", destination1);
	}

}
