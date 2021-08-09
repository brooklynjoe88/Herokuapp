package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {

	private WebDriver driver;
	//private By accountOverviewLink = By.xpath("//*[@id='loginPanel']/form/div[3]/input");

	
	public HomePage(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public DropDownPage clickDropdownLink()
	{
		
		clickLink("Dropdown");
		
		return new DropDownPage(driver);
	}
	
	public CheckboxPage clickCheckboxLink()
	{
		
		clickLink("Checkboxes");
		
		return new CheckboxPage(driver);
	}

	//Helper method for clicking links by linktext
	private void clickLink(String linkText)
	
	{
		driver.findElement(By.linkText(linkText)).click();
				
	}

}
