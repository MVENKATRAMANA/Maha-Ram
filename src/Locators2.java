import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args)

	// parent child siblings Locators...

	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chromedriver\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Relative X Path... Parent to child Traverse with Sibling Concept

		System.out.println(driver.findElement(By.xpath("//header/div/button[1]")).getText());

		System.out
				.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());

		// Relative X Path... child TO Parent Traverse with Sibling Concept

		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div")).getText());

		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/parent::header")).getText());

		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[3]")).getText());

	}

}
