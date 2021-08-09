package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.HomePage;

public class baseTest 
{

	private WebDriver driver;
	protected HomePage homePage;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		homePage = new HomePage(driver);
		
	}
	
	
}
