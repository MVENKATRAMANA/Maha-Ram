import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.testng.Assert;

public class Locators {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chromedriver\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Implicit wait for Synchronization Issue
		// Waiting for Objects to visible
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.google.com");
		// System.out.println(driver.getTitle());

		Locators l = new Locators();
		String pw = l.getPassword(driver);

		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.id("inputUsername")).sendKeys("Ram");
		driver.findElement(By.name("inputPassword")).sendKeys(pw);
		// driver.findElement(By.className("signInBtn")).click();
		driver.findElement(By.className("submit")).click();

		Thread.sleep(2000);

		String s1 = driver.findElement(By.tagName("p")).getText();

		System.out.println(s1);

		Assert.assertEquals(driver.findElement(By.cssSelector("p")).getText(), "You are successfully logged in.");

		driver.findElement(By.className("logout-btn")).click();
		driver.close();

	}

	public String getPassword(WebDriver driver) throws InterruptedException

	{

		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String s = driver.findElement(By.xpath("//form/p")).getText();

		String[] pw1 = s.split("'");

		String[] pw2 = pw1[1].split("'");

		return pw2[0];

	}

}
