package TestCases;

import org.testng.annotations.Test;

import Pages.CheckboxPage;
import base.baseTest;

public class CheckboxTest extends baseTest
{

	@Test
	public void checkbox()
	{
		
		CheckboxPage checkboxPage = homePage.clickCheckboxLink();		
	
		checkboxPage.clickCheckbox();
	
	}
	
	
}
