package Java.NoBrokerTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RentFunctionality {
	public static void main(String[] args) throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	 driver.manage().window().maximize();
	 
	 driver.get("https://www.nobroker.in/");
	 driver.findElement(By.xpath("//div[@class='nb__3JaWD']//div[contains(@class,'nb__17yFj')][contains(text(),'Rent')]")).click();
	//Select City
	 
	 driver.findElement(By.xpath("//div[@id='searchCity']")).click();	
	 Actions a=new Actions(driver);
	 for(int i=0;i<1;i++) {
		 a.sendKeys(Keys.DOWN).perform();
	 }
	 a.sendKeys(Keys.ENTER).perform();
	//Select Locality 
	 driver.findElement(By.xpath("//div[@class='form-group form-group-lg no-label ']//input[@id='listPageSearchLocality']")).click();
	
	 WebDriverWait wait = new WebDriverWait(driver, 8);
		
	 driver.findElement(By.xpath("//div[@class='form-group form-group-lg no-label ']//input[@id='listPageSearchLocality']")).sendKeys("Marthalli");
	
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("listPageSearchLocality")));
	 Thread.sleep(1000);
	 Actions a1=new Actions(driver);
	 for(int i=0;i<1;i++) {
		 a1.sendKeys(Keys.DOWN).perform();
     }
	  a1.sendKeys(Keys.ENTER).perform();
	    //Click on Full House
	    driver.findElement(By.xpath("//div[@class='prop-search-options nb__1Ktnl']//label[@class='nb-radio radio-inline']//input[@id='RENT']")).click();
	  
	    //select Apartment Type
		driver.findElement(By.xpath("//div[@class='css-1hwfws3 nb-select__value-container nb-select__value-container--is-multi']")).click();
		Actions a2=new Actions(driver);
		for(int i=0;i<2;i++) {
			a2.sendKeys(Keys.DOWN).perform();
		}
		a2.sendKeys(Keys.ENTER).perform();
		
		//select Availability
		driver.findElement(By.xpath("//div[@class='css-v2nw5i-control nb-select__control']//div[@class='css-1hwfws3 nb-select__value-container']")).click();
		Actions a3=new Actions(driver);
		for(int i=0;i<1;i++) {
			a3.sendKeys(Keys.DOWN).perform();
		}
		a3.sendKeys(Keys.ENTER).perform();
		
		//Click on Search
		driver.findElement(By.xpath("//button[@class='prop-search-button btn btn-primary btn-lg']")).click();
	}
}
