package utils;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class Helper {

    public static boolean isElementPresent(WebElement webElement) 
    {
        try 
        {
            boolean isPresent = webElement.isDisplayed();
            return isPresent;
        } 
        catch (NoSuchElementException e) 
        {
            return false;
        }
        
    }
}
