package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		// Sysytem.setProperty("webdriver.chrome.driver","c:\\users\\chromedriver.exe");")
		// launch the browser
		ChromeDriver driver = new ChromeDriver();
		// load url
		driver.get("https://www.snapdeal.com/");
		// Maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]"));
		driver.findElement(By.xpath("//span[text()=\"Sports Shoes\"]"));
		
	}

}
