package Packagedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Selenium {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raja\\eclipse-workspace\\Seleniumdemo\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/frame");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("firstFr");
		driver.findElement(By.name("fname")).sendKeys("Shalini");
		driver.findElement(By.name("lname")).sendKeys("Raja");
		
		WebElement innerfram = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		driver.switchTo().frame(innerfram);
		driver.findElement(By.name("email")).sendKeys("srshalini8@gmail.com");
		
		// Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.close();

	}

}
