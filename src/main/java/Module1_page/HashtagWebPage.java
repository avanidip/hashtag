package Module1_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HashtagWebPage 
{
	@FindBy(xpath="//img[@id='logo']")private WebElement logoimgbtn;
	@FindBy(xpath="//a[text()='Shopify ']")private WebElement shopifybtn;
	@FindBy(xpath="//a[@class='nav-link ']")private WebElement servicesDD;
	@FindBy(xpath="//input[@name='name']")private WebElement name;
	@FindBy(xpath="//input[@name='phone']")private WebElement phone;
	@FindBy(xpath="//input[@name='email']")private WebElement email;
	@FindBy(xpath="//textarea[@name='description']")private WebElement description;
	@FindBy(xpath="//button[@class='btn form-button font-12 font-bold']") private WebElement applybtn; 
	@FindBy(xpath="//img[@id='footer-linkedin']")private WebElement linkdnlogo;
	@FindBy(xpath="//img[@id='footer-fb']")private WebElement facebooklogo;
	@FindBy(xpath="//img[@id='footer-instagram']")private WebElement instagramlogo;
	@FindBy(xpath="//img[@class='footer-img']")private WebElement devWeblogo;
	@FindBy(xpath="//img[@class='footer-img-clutch']")private WebElement wedeliverlogo; 
	@FindBy(xpath="//a[text()='Wordpress Development']")private WebElement DDWordpressbtn;
	@FindBy(xpath="//a[text()='Blockchain Development']")private WebElement DDBlockchainbtn;
	@FindBy(xpath="//a[text()='Design and Prototyping']")private WebElement DDDesignPbtn;
	@FindBy(xpath="//a[text()='UI Development']")private WebElement DDUidevbtn;
	
	public HashtagWebPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public boolean verifyHashtagWebPagelogo()
	{
		 boolean actText = logoimgbtn.isDisplayed();
		 return actText;
		
	}
	
	public boolean verifyHashtagWebPageBtn()
	{
		boolean actText = logoimgbtn.isEnabled();
		return actText;
		
	}
	
	public boolean verifyHashtagWebShopifyBtn()
	{
		 boolean actText = shopifybtn.isEnabled();
		 return actText;
		
	}
	
	public String verifyHashtagWebShopifyText()
	{
			String text = shopifybtn.getTagName();
			return text;
		
	}
	
	public boolean verifyHashtagWebPageServicesDD(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(servicesDD).perform();
		boolean text = servicesDD.isDisplayed();
		return text;
	}
	
	public String verifyHashtagWebPageServicesDDText()
	{
		String text = servicesDD.getText();
		return text;
	}
	
	public void inpHashtagWebPageName(String Fname)
	{
		name.sendKeys(Fname);
	}
	
	public void inpHashtagWebPagePhone(String no)
	{
		phone.sendKeys(no);
	}
	
	
	public void inpHashtagWebPageEmail(String emailid)
	{
		email.sendKeys(emailid);
	}
	
	public void inpHashtagWebPageDescrip(String info)
	{
		description.sendKeys(info);
	}
	
	public void clickHashtagWebPageApplyBtn()
	{
		applybtn.click();
	}
	
	public boolean verifyHashtagWebPagelinkdnlogo()
	{
		boolean result = linkdnlogo.isDisplayed();
		return result;
	}
	
	public boolean verifyHashtagWebPageFacebooklogo()
	{
		boolean result = facebooklogo.isDisplayed();
		return result;
	}
	
	public boolean verifyHashtagWebPageInstagramlogo()
	{
		boolean result = instagramlogo.isDisplayed();
		return result;
	}
	
	public boolean verifyHashtagWebPageDevelopmentlogo()
	{
		boolean result = devWeblogo.isDisplayed();
		return result;
	}
	
	public boolean verifyHashtagWebPageWedeliverlogo()
	{
		boolean result = wedeliverlogo.isDisplayed();
		return result;
	}
	
	
	public boolean verifyHashtagDDWordpressBtn()
	{
		 boolean actText = DDWordpressbtn.isEnabled();
		 return actText;
		
	}
	
	public boolean verifyHashtagWebDDBlochainBtn()
	{
		 boolean actText = DDBlockchainbtn.isEnabled();
		 return actText;
		
	}
	
	public boolean verifyHashtagWebDDdesignBtn()
	{
		 boolean actText = DDDesignPbtn.isEnabled();
		 return actText;
		
	}
	
	public boolean verifyHashtagWebDDUIBtn()
	{
		 boolean actText = DDUidevbtn.isEnabled();
		 return actText;
		
	}
	
}
