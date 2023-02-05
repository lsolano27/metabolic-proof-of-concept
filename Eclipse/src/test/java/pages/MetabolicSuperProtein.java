package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import com.metabolic.net.core.PageObjectFactory;

public class MetabolicSuperProtein extends PageObjectFactory{

	public MetabolicSuperProtein(WebDriver driver) {
		super(driver);
	}
	
	private final static String XPATH_PAGE_LOGO = "//div[@class='desktop-logo-container']";
	private final static String XPATH_PRODUCT_NAME = "//h1[@class='product-name']";
	private final static String XPATH_CART_ICON = "//div[@class='page-header-cart cart']";
	private final static String XPATN_BAGS6UNITS = "//span[contains(text(),'6 Bags - $234')]";
	private final static String XPATH_VANILLACREA = "//li[contains(text(),'Vanilla Cream')]";
	private final static String ID_ADD_TO_CART = "add-to-cart-btn";
	
	@FindBy(how = How.XPATH, using = XPATH_PAGE_LOGO )
	WebElement pageHeader;
	
	public boolean isPageLogoDisplay() {
	
		return isElementPresent(XPATH_PAGE_LOGO);
	}

}
