 package Packagedemo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raja\\eclipse-workspace\\Seleniumdemo\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement EmailAddress = driver.findElement(By.name("email"));
	EmailAddress.sendKeys("srshalini@123");
	
	WebElement Password = driver.findElement(By.id("pass"));
	Password.sendKeys("Shalini");
	
	WebElement next = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	next.click();
	
	
	WebElement Firstname1=driver.findElement(By.name("firstname"));	
	Firstname1.sendKeys("Shalini");
	
	WebElement surname=driver.findElement(By.name("lastname"));	
	surname.sendKeys("Raja");
	
	WebElement Mobileno=driver.findElement(By.name("reg_email__"));	
	Mobileno.sendKeys("91234");
	
	WebElement Newpasswd=driver.findElement(By.id("password_step_input"));	
	Newpasswd.sendKeys("1234@a");
	
WebElement day=driver.findElement(By.id("day"));
Select S=new Select(day);
S.selectByValue("16");

WebElement month=driver.findElement(By.name("birthday_month"));
Select S1=new Select(month);

S1.selectByVisibleText("Jan");
	
WebElement year=driver.findElement(By.id("year"));
Select S2=new Select(year);
S2.selectByVisibleText("1991");

TakesScreenshot TS= (TakesScreenshot) driver;
File sourcefile = TS.getScreenshotAs(OutputType.FILE);
File destinationfile=new File("C:\\Users\\Raja\\eclipse-workspace\\Seleniumdemo\\Screen\\facebook.png");
FileHandler.copy(sourcefile, destinationfile);

	
	}
}
