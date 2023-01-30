package Packagedemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multipledropdown1 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raja\\eclipse-workspace\\Seleniumdemo\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		WebElement findElement = driver.findElement(By.id("fruits"));
	Select S=new Select(findElement);
	S.selectByIndex(1);
	//WebElement findElement2 = driver.findElement(By.id("superheros"));)
		WebElement findElement3 = driver.findElement(By.id("superheros"));
Select S1=new Select(findElement3);
		S1.selectByVisibleText("Batwoman");
		
		WebElement findElement2 = driver.findElement(By.id("lang"));
	Select S3 =new Select(findElement2);
	List<WebElement> alltheoption = S3.getOptions();
	for (WebElement Totaloption : alltheoption) {
		System.out.println(Totaloption.getText());
		
	}
	
	}
	}

