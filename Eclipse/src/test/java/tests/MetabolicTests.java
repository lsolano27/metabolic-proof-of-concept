package tests;

import java.time.Duration;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.metabolic.net.core.DriverFactory;

import core.asserts.Asserts;
import pages.MetabolicSuperProtein;

public class MetabolicTests extends DriverFactory{
	Asserts asserts = new Asserts();
	
	
	@Parameters({ "appURL","browser" })
	@Test
	public void TestSuperProtein(String appURL, String browser) throws Exception {
		setDriver(appURL, browser);
		
		MetabolicSuperProtein superProteinPage = new MetabolicSuperProtein(driver);
		superProteinPage.isPageLogoDisplay();
		
	}
	
}
