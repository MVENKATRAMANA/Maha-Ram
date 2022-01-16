import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args)

	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chromedriver\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Running Browser in Maximize mode

		driver.manage().window().maximize();

		// .get method will wait till the browser load all elements page before it move
		// to next page.

		driver.get("http://google.com");
		// .navigate method will NOT wait till the browser load all elements page before
		// it move to next page.

		driver.navigate().to("https://rahulshettyacademy.com");

		driver.navigate().back();

		driver.navigate().forward();

	}

}
