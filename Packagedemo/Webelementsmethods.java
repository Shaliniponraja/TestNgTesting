package Packagedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelementsmethods {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raja\\eclipse-workspace\\Seleniumdemo\\Driver\\chromedriver.exe");		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		WebElement uname = driver.findElement(By.id("email"));
		uname.sendKeys("Shalini@gmail.com");
		WebElement passed=driver.findElement(By.name("pass"));
		passed.sendKeys("srshalini8");
		
		driver.findElement(By.name("login")).click();
	
	}

}
