package steps;
import cucumber.api.java.Before;
import utils.SeleniumDriver;

public class DriverStepUp  {

	@Before
    public static void setUp()
    {
    	System.out.println("Before");
       SeleniumDriver.setUpDriver();
    }
}
