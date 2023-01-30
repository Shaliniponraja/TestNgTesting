package Packagedemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Orangepractice {
	
	public static void browser_launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raja\\eclipse-workspace\\Seleniumdemo\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.crio.do/qa-automation-testing/?leadform_open=true&utm_source=google-ads-search&utm_medium=qa-automation&utm_campaign=Automation-Kws&utm_term=online%20automation%20testing%20course&gclid=Cj0KCQiA5NSdBhDfARIsALzs2ECyuRsRzs0JoY0ODaHODdwCaitQCQw2dUnn5ALQLvKRpnHHKQTi26IaAkWaEALw_wcB");
	
		driver.manage().window().maximize();
	
	driver.findElement(By.id(":rg:")).sendKeys("srshalini@gmail.com");
	WebElement mobileno = driver.findElement(By.cssSelector("input[placeholder]"));
	mobileno.sendKeys("9176263698");
	driver.findElement(By.cssSelector("button[type=submit]")).click();
	
	WebElement name = driver.findElement(By.xpath("//input[@id=':rh:']"));
	name.sendKeys("Shalini");
	
	WebElement year = driver.findElement(By.xpath("//*[@data-value='2016']"));
	Select S=new Select(year);
	S.selectByValue("2016");
	System.out.println("Success");
	
}
	public static void main(String[] args) {
		browser_launch();
	}
}
