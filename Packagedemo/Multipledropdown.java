package Packagedemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multipledropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raja\\eclipse-workspace\\Seleniumdemo\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		
		WebElement Selectcourse=driver.findElement(By.id("ide"));
		Select S=new Select(Selectcourse);
		System.out.println(S.isMultiple());
		S.selectByValue("ec");
		S.selectByVisibleText("IntelliJ IDEA");
		
		//options: print the total no of elements present in the dropdown
		List<WebElement> options=S.getOptions();
		for (WebElement Opt : options) {
			System.out.println(Opt.getText());}
			
			//first selection option
			
			WebElement firstsel=S.getFirstSelectedOption();
			System.out.println(firstsel.getText());
			System.out.println();
			
			S.deselectByValue("ec");
			
			//all selection
			
			List<WebElement> allSelectedOptions = S.getAllSelectedOptions();
			for (WebElement allselect : allSelectedOptions) {
				System.out.println(allselect.getText());
				
				//driver.close();
			}
				
			}
			
		}
		
	
	
	
	


