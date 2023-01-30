package Packagedemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable3 {
	
	
public static WebDriver driver;
	
	public static void browser_launch() {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raja\\eclipse-workspace\\Seleniumdemo\\Driver\\chromedriver.exe");		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		System.out.println("Browser Launched");
	}
		
		public static void getallthedatas() {
		List<WebElement> alldata = driver.findElements(By.xpath("//div[@class='rt-td']"));
		for (WebElement getdata : alldata) {
			System.out.println(getdata.getText());
			
		}}
		/*private static void getrowdata() {
			List<WebElement> rowdata = driver.findElements(By.id("//div[@class='rt-td'][2]"));
			for (WebElement getrowdata : rowdata) {
				System.out.println(getrowdata.getText());
				}
				
			}*/
		
	
public static void main(String[] args) {
	browser_launch() ;
	getallthedatas();
	//getrowdata();
	
}
}
