package Packagedemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows {
	public static void main(String[] args) throws InterruptedException {
		
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raja\\eclipse-workspace\\Seleniumdemo\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://leafground.com/window.xhtml");
	driver.manage().window().maximize();

	String parentwindow = driver.getWindowHandle();
	WebElement findElement = driver.findElement(By.xpath("//*[@id=\"j_idt88:new\"]/span"));
	findElement.click();

	Set<String> allwindow = driver.getWindowHandles();
	Iterator<String> iterator = allwindow.iterator();
	while (iterator.hasNext()) {
		String childwindow = iterator.next();
		if (parentwindow.equals(childwindow)) {
			driver.switchTo().window(childwindow).getTitle();
		}
		System.out.println(driver.switchTo().window(childwindow));
			
		driver.close();
	}
	driver.switchTo().window(parentwindow);
	}}
	

	