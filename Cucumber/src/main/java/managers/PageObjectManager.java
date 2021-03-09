package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import pageObjects.ProductListingPage;
//tHE BELOW CODE IS TO IMPLEMENT PAGE OBJECT PATTERN
public class PageObjectManager {

	private WebDriver driver ;
	private CartPage cartPage;
	private CheckoutPage checkoutPage;
	private HomePage homePage ;
	private ProductListingPage productListingPage ;
	
	public PageObjectManager(WebDriver driver){
		
		this.driver=driver;
	}
	public HomePage getHomePage(){

		return (homePage == null) ? homePage = new HomePage(driver) : homePage;

	}

	public ProductListingPage getProductListingPage() {

		return (productListingPage == null) ? productListingPage = new ProductListingPage(driver) : productListingPage;

	}

	

	public CartPage getCartPage() {

		return (cartPage == null) ? cartPage = new CartPage(driver) : cartPage;

	}

	

	public CheckoutPage getCheckoutPage() {

		return (checkoutPage == null) ? checkoutPage = new CheckoutPage(driver) : checkoutPage;

	}
}


