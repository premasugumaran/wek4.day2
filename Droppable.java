package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Droppable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		// Sysytem.setProperty("webdriver.chrome.driver","c:\\users\\chromedriver.exe");")
		// launch the browser
		ChromeDriver driver = new ChromeDriver();
		// load url
		driver.get("https://jqueryui.com/droppable");
		// Maximize the browser
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		Actions builder=new Actions(driver);
		WebElement dragme = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dropme = driver.findElement(By.xpath("//div[@id='droppable']"));
		builder.dragAndDrop(dragme, dropme).perform();
		
		
	}

}
