package Packagedemo;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Adactin_miniproject {
	
	public static void main(String[] args) throws InterruptedException, Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raja\\eclipse-workspace\\Seleniumdemo\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement Username = driver.findElement(By.id("username"));
		Username.sendKeys("Shaliniraja");
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("Sshaliniraja@1234");
		
		// login click
		
		WebElement login=driver.findElement(By.xpath("//*[@name='login']"));
		login.click();
		
		// dropdown
		
		WebElement Selectcountry = driver.findElement(By.xpath("//*[@value='London']"));
		Selectcountry.click();
		
		WebElement Hotels = driver.findElement(By.xpath("//option[@value='Hotel Creek']"));
		Hotels.click();
		
		WebElement TypeofHotels = driver.findElement(By.xpath("//option[@value='Standard']"));
		TypeofHotels.click();
		
		WebElement Nooffrooms = driver.findElement(By.xpath("//option[@value='2']"));
		Nooffrooms.click();
		
		Thread.sleep(2000);
		
		WebElement Intime = driver.findElement(By.xpath("//*[@name='datepick_in']"));
		Intime.clear();
		Intime.sendKeys("26/12/2022");
		
		//WebElement CheckInDate = driver.findElement(By.id("datepick_in"));
		//CheckInDate.sendKeys("26122022");
		
		
		WebElement CheckoutDate = driver.findElement(By.id("datepick_out"));
		CheckoutDate.clear();
		CheckoutDate.sendKeys("30/12/2022");
		
		WebElement Room = driver.findElement(By.xpath("//option[@value='2']"));
		Room.click();
		
		WebElement Child = driver.findElement(By.xpath("//option[@value='3']"));
		Child.click();
		
		WebElement Status = driver.findElement(By.xpath("//input[@name='Submit']"));
		Status.click();
		
		WebElement radioButt = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		radioButt.click();
		
		WebElement Status2 = driver.findElement(By.xpath("//input[@name='continue']"));
		Status2.click();
		
		WebElement Firstname = driver.findElement(By.name("first_name"));
		Firstname.sendKeys("Shalini");
		
		WebElement Lastname = driver.findElement(By.name("last_name"));
		Lastname.sendKeys("Raja");
		
		WebElement Billingadd = driver.findElement(By.name("address"));
		Billingadd.sendKeys("No:14 Kallikuppam,Ambattur,Chennai-600053");
		
		WebElement CCard = driver.findElement(By.name("cc_num"));
		CCard.sendKeys("1234567891234123");
		
		
		WebElement Credit  = driver.findElement(By.xpath("//option[@value='MAST']"));
		Credit.click();
		
		WebElement Expiry = driver.findElement(By.xpath("//option[@value='1']"));
		Expiry.click();
		
		
		WebElement Year = driver.findElement(By.xpath("//option[@value='2013']"));
		Year.click();
		
		WebElement CCV = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		CCV.sendKeys("1122334455");
		
		WebElement Book = driver.findElement(By.xpath("//input[@name='book_now']"));
		Book.click();
		
		Thread.sleep(2000);
		
		Robot R=new Robot();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle=new Rectangle(screenSize);
		BufferedImage source = R.createScreenCapture(rectangle);
		File destination=new File("C:\\Users\\Raja\\eclipse-workspace\\Seleniumdemo\\Screen\\Adactin.png");
		ImageIO.write(source, "png", destination);
		
		
	}}



