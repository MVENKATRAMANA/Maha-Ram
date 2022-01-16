import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyanaDropDown {

	public static void main(String[] args) throws InterruptedException

	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chromedriver\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		// driver.findElement(By.xpath("//a[@value='MAA']")).click();

		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='MAA']"))
				.click();

		// div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='MAA']

		// driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();

		Thread.sleep(2000);

		// driver.findElement(By.xpath("(//a[@value='IXM'])[2]")).click();

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='IXM']"))
				.click();

		// .ui-state-default.ui-state-highlight.ui-state-active

		Thread.sleep(10000);

		// driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active.ui-state-hover")).click();
		// driver.findElement(By.className("ui-state-default.ui-state-highlight.ui-state-active")).click();

		// class="ui-state-default ui-state-highlight ui-state-active"

		// driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		// driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		// driver.findElement(By.className("ui-state-default.ui-state-highlight.ui-state-hover")).click();

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {

			System.out.println(" Its enabled");

		}

	}

}
