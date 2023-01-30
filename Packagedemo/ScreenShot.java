 package Packagedemo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raja\\eclipse-workspace\\Seleniumdemo\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://commons.apache.org/downloads/index.html");
		driver.manage().window().maximize();
		
		// Initialization
		
		TakesScreenshot Ts=(TakesScreenshot) driver;
		
		//Call method for taking screenshot
		File sourcefile= Ts.getScreenshotAs(OutputType.FILE);
		
		//Find the path.
		
		File destinationfile=new File("C:\\Users\\Raja\\eclipse-workspace\\Seleniumdemo\\Screen\\apache.png");
		
		//C:\Users\Raja\eclipse-workspace\Seleniumdemo\src\Packagedemo\ScreenShot.java
		
		//Merge sore and destination file
		
	  FileHandler.copy(sourcefile, destinationfile);
		
		
		
	}

}
