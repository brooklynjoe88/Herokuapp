package Pages;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckboxPage {

	public WebDriver driver;
	
	public CheckboxPage (WebDriver driver)
	{
		this.driver = driver;
		
	}

	
	public void clickCheckbox()
	{
		
		driver.findElement(By.xpath("//*[@id=\'checkboxes\']/input[1]")).click();
		driver.findElement(By.xpath("//*[@id='checkboxes']/input[2]")).click();

		
        }
		
	}
		
	

