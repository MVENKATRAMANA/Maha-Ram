import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DropDown {

	public static void main(String[] args) throws InterruptedException 
	
	
	{
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chromedriver\\Chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(3000);
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		/*for(int i=1; i<=4 ; i++)
		
		{
		
		driver.findElement(By.id("hrefIncAdt")).click();
		
		} */
		
		int i=1;
				while(i<=4)
				{
					
					driver.findElement(By.id("hrefIncAdt")).click();
					i++;
				}
		
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		//System.out.println(driver.findElement(By.id("hrefIncAdt")).getText());
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		
		
		// Check Box Selection.. & Num of Check Boxes
		
		//System.out.println(driver.findElement(By.cssSelector("input[id*='chk_friendsandfamily']")).isSelected());
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='chk_friendsandfamily']")).isSelected());
		
		driver.findElement(By.cssSelector("input[id*='chk_friendsandfamily']")).click();
		
		//System.out.println(driver.findElement(By.cssSelector("input[id*='chk_friendsandfamily']")).isSelected());
		
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='chk_friendsandfamily']")).isSelected());
		
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		Assert.assertEquals(driver.findElements(By.xpath("//input[@type='checkbox']")).size(), "6");
		
		
		
		

	}

}
