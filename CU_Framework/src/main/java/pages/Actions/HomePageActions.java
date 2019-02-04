package pages.Actions;

import org.openqa.selenium.support.PageFactory;

import pages.Locators.HomePageLocators;
import utils.SeleniumDriver;

public class HomePageActions 
{
	HomePageLocators loc=null;
	
	public HomePageActions()
	{
		this.loc=new HomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), loc);
	}
	
	public void ClickonSigninButton()
	{
		loc.SignInLink.click();
	}
	
			public void EnterUsernam()
			{
				loc.UsernameTextbox.sendKeys("jagatkishoremishra@hotmail.com");
			}
			
			public void EnterPassword()
			{
				loc.PasswordTextbox.sendKeys("12345");
			}
			
			public void ClickSignInButton()
			{
				loc.SignInButton.click();
			}

}
