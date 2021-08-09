package TestCases;

import org.testng.annotations.Test;

import Pages.DropDownPage;
import base.baseTest;

public class DropDownTest extends baseTest
{

	@Test
	public void dropdown()
	{
	
		
		
		DropDownPage dropDownPage = homePage.clickDropdownLink();
		
		
		dropDownPage.selectDropdownOption("1");
	}
	
}
