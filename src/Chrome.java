import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Chrome {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chromedriver\\Chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//Implicit wait for Synchronization Issue
		//Waiting for Objects to visible
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");
		//System.out.println(driver.getTitle());
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");		
		driver.findElement(By.id("inputUsername")).sendKeys("Ram");
		driver.findElement(By.name("inputPassword")).sendKeys("Laxman");
		//driver.findElement(By.className("signInBtn")).click();
		driver.findElement(By.className("submit")).click();
		
		String e =driver.findElement(By.cssSelector("p.error")).getText();
		
		System.out.println(e);
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//for Stable screen..
		
		//Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Ram");
		
		//driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Ram@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("Ram@gmail.com");
		
		//driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("1234567890");
		
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("1234567890");
		
		//driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).clear();
		
		//driver.findElement(By.xpath("//form/input[3]")).sendKeys("******7890");
		
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		String s=driver.findElement(By.xpath("//form/p")).getText();
		System.out.println(s);
		
		driver.findElement(By.cssSelector(".go-to-login-btn")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("chkboxOne")).click();
		
		//driver.findElement(By.name("chkboxTwo")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.className("submit")).click();
		
		
		
		
		
		
	}

}
