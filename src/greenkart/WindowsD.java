package greenkart;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chromedriver\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// run in full window
		//driver.manage().window().maximize();
		
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.className("blinkingText")).click();
		//driver.findElement(By.cssSelector(".blinkingText")).click();
		
		Set<String> windows = driver.getWindowHandles(); //parentid, childid, subchildid
		
		Iterator<String> it= windows.iterator();
		String parentid =it.next();
		String childid =it.next();
		driver.switchTo().window(childid);		
		
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		
		String Email=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		System.out.println(Email);
		
		driver.switchTo().window(parentid);	
		
		driver.findElement(By.id("username")).sendKeys(Email);
		

	}

}
