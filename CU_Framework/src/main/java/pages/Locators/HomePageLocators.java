package pages.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageLocators 
{
	//SignIn Functionality
	@FindBy(how=How.XPATH, using="//*[@id=\"rch-select-sign-in\"]")
	public WebElement  SignInLink;
		
		@FindBy(how=How.XPATH, using="//*[@id=\"crmEmail\"]")
		public WebElement UsernameTextbox;
		
		@FindBy(how=How.XPATH, using="//*[@id=\"crmPsw\"]")
		public WebElement PasswordTextbox;

		@FindBy(how=How.XPATH, using="//*[@id=\"crmLogin\"]")
		public WebElement SignInButton;
	

}
