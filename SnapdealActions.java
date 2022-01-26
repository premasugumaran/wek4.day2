package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapdealActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--disable notification--");
		ChromeDriver driver = new ChromeDriver();
		// load url
		driver.get("https://www.snapdeal.com/");
		// Maximize the browser
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Actions builder=new Actions(driver);
		WebElement mensfashion = driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]"));
		builder.moveToElement(mensfashion);
		
		
		//driver.findElement(By.xpath(("//span[text()='Shirts']"))
		
		
		
		
		
	}

}
