package Pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage
{
	private WebDriver driver;
	
	//Constructor
	public DropDownPage(WebDriver driver)
	{
		this.driver = driver;
	}

	public void selectDropdownOption(String option)
	{

		findDropdownElements().selectByValue(option);
	}

	private Select findDropdownElements ()
	{
		return new Select(driver.findElement(By.id("dropdown"))); 
	}
	
}
