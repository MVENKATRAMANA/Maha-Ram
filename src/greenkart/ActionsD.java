package greenkart;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chromedriver\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// run in full window
		driver.manage().window().maximize();
			
		driver.get("https://www.amazon.com/");
		
		//Move the Mouse cursor over on object with Selenium
		Actions a= new Actions(driver);
		
		WebElement move= driver.findElement(By.cssSelector("a#nav-link-accountList"));
		
			
		a.moveToElement(move).build().perform();
		
		//Select the Text box and enter the text in Capital Letters
		
		//a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("toys").build().perform();
		
		//Select the Text box and enter the text in Capital Letters and select the entered Text
		
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("toys").doubleClick().build().perform();
		
		//a.moveToElement(driver.findElement(By.cssSelector("a#nav-link-accountList"))).build().perform();
		//a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		//a.moveToElement(driver.findElement(By.className("nav-a.nav-a-2.nav-progressive-attribute"))).build().perform();
		
		
		//Right click
		a.moveToElement(move).contextClick().build().perform();
		
		
		
	}

}
