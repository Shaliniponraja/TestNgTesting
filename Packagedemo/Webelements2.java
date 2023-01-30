package Packagedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements2 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raja\\eclipse-workspace\\Seleniumdemo\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
     driver.manage().window().maximize();
    WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
    search.sendKeys("smartphnoe");
    System.out.println(search.isDisplayed());
    System.out.println(search.isEnabled());
    search.sendKeys("SmartTV");
    search.click();
    
    
 
	
	}
	
	


}
