package Packagedemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raja\\eclipse-workspace\\Seleniumdemo\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/select.xhtml;jsessionid=node01w9qad7r99qct17ymrgdcushxs65321.node0");
		driver.manage().window().maximize();
		WebElement element= driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select S=new Select(element);
				S.selectByVisibleText("Selenium");
				S.getAllSelectedOptions();
				System.out.println(S);
				
			List<WebElement> options = S.getOptions();
				for (WebElement alloption : options) {
					System.out.println(alloption.getText());
				}
					
	}}