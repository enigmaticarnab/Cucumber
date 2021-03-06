package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import dataProvider.ConfigFileReader;
public class HomePage {
    
	WebDriver driver;
	ConfigFileReader configFileReader;
	public HomePage(WebDriver driver ){
		PageFactory.initElements(driver, this);
		
	}
	public void perform_Search(String search) {
		driver.navigate().to(configFileReader.getApplicationUrl()+"/?s=" + search + "&post_type=product");
	}
	
	public void navigateTo_HomePage() {
		driver.get(configFileReader.getApplicationUrl());
	}
}
