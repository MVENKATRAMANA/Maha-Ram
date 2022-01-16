import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Auto suggestive drop downs... Use List Class...

public class AutoSugDrop {

	public static void main(String[] args) throws InterruptedException 
	
	
	
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chromedriver\\Chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(5000);
		
		// CSS Selector...Parent CSS space Child CSS
		List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
			for(WebElement option:options)	
			{
				if(option.getText().equalsIgnoreCase("India"))
				{
					option.click();
					break;
				}
			}
		
		
		
		
		

	}

}
