package Packagedemo;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raja\\eclipse-workspace\\Seleniumdemo\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/alert");
		
		//1.Simple Alert
		
		driver.findElement(By.id("accept")).click();
		driver.switchTo().alert().accept();
		System.out.println("Success");
		
		//2.Confrim alert
		
		driver.findElement(By.id("confirm")).click();
		driver.switchTo().alert().accept();
		System.out.println("Sucess");
		
		//3.Prompt alert
		
		driver.findElement(By.id("prompt")).click();
		Alert Prompt = driver.switchTo().alert();
		Prompt.sendKeys("123456");
		Prompt.accept();
		System.out.println("Success");
		
		
		Thread.sleep(2000);
		
		TakesScreenshot Ts=(TakesScreenshot) driver;
		File sourcefile=Ts.getScreenshotAs(OutputType.FILE);
		File destionationfile=new File("C:\\Users\\Raja\\eclipse-workspace\\Seleniumdemo\\Screen\\letcode.png");
	org.openqa.selenium.io.FileHandler.copy(sourcefile, destionationfile);
		
	}

}
