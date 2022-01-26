package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nyka {
	public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.nykaa.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	//2) Mouseover on Brands
	
	Actions builder=new Actions(driver);
	WebElement brands = driver.findElement(By.xpath("//a[text()='brands']"));
	builder.moveToElement(brands).perform();
	//Search L'Oreal Paris
	
	driver.findElement(By.xpath("//input[@id=\"brandSearchBox\"]")).sendKeys("L'Oreal Paris");
	
	//3) Click L'Oreal Paris
	driver.findElement(By.xpath("//a[text()=\"L'Oreal Paris\"]")).click();
	
	//4) Check the title contains L'Oreal Paris(Hint-GetTitle)
	String title = driver.getTitle();
	System.out.println(title);
	
	//5) Click sort By and select customer top rated
	
	driver.findElement(By.xpath("//button[@class=' css-p2rfnw']")).click();
	driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
	
	//Click Category
	
	driver.findElement(By.xpath("(//div[@class=\"filter-open css-nbw8dp\"])[1]")).click();
	
	//click Hair
	
	driver.findElement(By.xpath("//span[text()='Hair']")).click();
	
	//Click haircare->Shampoo
	
	driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
	
	driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
	
	
	//Click->Concern->Color Protection
	
	driver.findElement(By.xpath("//span[text()='Concern']")).click();
	
	
	driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
	
	//8)check whether the Filter is applied with Shampoo
	
	WebElement filter = driver.findElement(By.xpath("//span[@class=\"filter-value\"]"));
	
	if(filter.getText()=="Shampoo")
		
	{
		System.out.println("verified filter is applied to shampoo");
	}
	
	//9) Click on L'Oreal Paris Colour Protect Shampoo
	driver.findElement(By.xpath("(//div[text()=\"L'Oreal Paris Colour Protect Shampoo\"])[1]")).click();
	
	
	//10) GO to the new window and select size as 175ml
	Set<String> windows = driver.getWindowHandles();
	List<String> list=new ArrayList<String>(windows);
		
	String windowHandle = list.get(1);
	
	driver.switchTo().window(windowHandle);
	
	//11) Print the MRP of the product
	
	WebElement mrp = driver.findElement(By.xpath("//span[contains(text(),'150')]"));
	String MRP = mrp.getText();
	System.out.println(MRP);
	
	//12) Click on ADD to BAG
	
	driver.findElement(By.xpath("(//span[contains(text(),'ADD TO BAG')])[1]")).click();
	//13) Go to Shopping Bag 
		
	driver.findElement(By.xpath("//span[@class=\"cart-count\"]")).click();
		
	driver.switchTo().frame(0);
	//14) Print the Grand Total amount
	WebElement grandtotal = driver.findElement(By.xpath("//div[@class='value medium-strong']"));
	
	String text = grandtotal.getText();
	
	System.out.println(text);
	
	//15) Click Proceed
	
	driver.findElement(By.xpath("//span[text()='PROCEED']")).click();
	
	//16) Click on Continue as Guest
	
	driver.findElement(By.xpath("//button[@class='btn full big']")).click();
	
	//17) Check if this grand total is the same in step 14
	
	WebElement grt = driver.findElement(By.xpath("//div[@class='payment-details-tbl grand-total-cell prl20']"));
	String text2 = grt.getText();
	System.out.println(text2);
	if(text.equals(text2)) {
		System.out.println("Grand Total is verified");
		
	}
//		18) Close all windows
	driver.close();
	
	
	
}
}