package pages;

public class Payment {
	private final static String XPATH_EMAIL = "//div[@class = 'app-form-text-input white error-border email-input']/input[@autocomplete='email']";
	private final static String XPATH_FIRST_NAME = "//div[@class='main']/div[@class='shipping-info']/form[@class ='checkout-shipping-form']/div/div/div[@class='app-form-text-input white']/input[@name = 'firstName'])";
	private final static String XPATH_LAST_NAME = "//div[@class='main']/div[@class='shipping-info']/form[@class ='checkout-shipping-form']/div/div/div[@class='app-form-text-input white']/input[@name = 'lastName'])";
	private final static String XPATH_ZIP_CODE = "//div[@class='main']/div[@class='shipping-info']/form[@class ='checkout-shipping-form']/div[@class='zip-city-state']/div/div/input[@name = 'zip']";
	private final static String XPATH_CITY = "//div[@class='main']/div[@class='shipping-info']/form[@class ='checkout-shipping-form']/div[@class='zip-city-state']/div/div/input[@name = 'city']";
	private final static String XPATH_STATE = "//div[@class='main']/div[@class='shipping-info']/form[@class ='checkout-shipping-form']/div[@class='zip-city-state']/div/div/input[@name = 'state']";
	
	private final static String XPATH_CC_NUMBER = "//div[@class ='main']/div/div/ul/li/div/form[@class ='payment-form']/div/div/input[@autocomplete='cc-number']";
	private final static String XPATH_EXP_MONTH = "//div[@class ='main']/div/div/ul/li/div/form[@class ='payment-form']/div/div/input[@autocomplete='cc-exp-month']";
	private final static String XPATH_EXP_YEAR = "//div[@class ='main']/div/div/ul/li/div/form[@class ='payment-form']/div/div/input[@autocomplete='cc-exp-year']";
	private final static String XPATH_CVV = "//div[@class ='main']/div/div/ul/li/div/form[@class ='payment-form']/div/div/div/input[@autocomplete='cc-csc']";
	private final static String XPATH_BUTTON = "//div[@class ='main']/div/div/ul/li/div/form[@class ='payment-form']/button";
}
