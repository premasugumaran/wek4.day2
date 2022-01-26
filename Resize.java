package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Resize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		// Sysytem.setProperty("webdriver.chrome.driver","c:\\users\\chromedriver.exe");")
		// launch the browser
		ChromeDriver driver = new ChromeDriver();
		// load url
		driver.get("https://jqueryui.com/resizable");
		// Maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		Actions builder=new Actions(driver);
		WebElement resizeme = driver.findElement(By.xpath("//div[@id='resizable']"));
		builder.clickAndHold(resizeme).moveByOffset(150, 100).perform();  
	}

}
