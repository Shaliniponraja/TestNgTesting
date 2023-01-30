package Packagedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethods {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chrome", "C:\\Users\\Raja\\eclipse-workspace\\Seleniumdemo\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();//Maximize the screen
driver.getCurrentUrl();
System.out.println("Sucess");
driver.getTitle();
System.out.println("Tittle");
driver.navigate().to("https://www.flipkart.com/");
driver.navigate().back();
driver.navigate().refresh();

	}

}
