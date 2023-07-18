package HashtagTestClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import LibraryFiles.BaseClass;
import Module1_page.HashtagWebPage;

public class Hashtag_TestButton extends BaseClass

{

	HashtagWebPage hashHashtagWebPage;
	
	int TCID;
	
	@BeforeClass
	
	public void openBrowser() throws IOException, InterruptedException
	{
		intilizeBrowser();
		Thread.sleep(2000);
		HashtagWebPage hashtagWebPage = new HashtagWebPage(driver);
		
	}
	
	
	@Test
	public void verifyHashtagDDWordpressBtn() throws InterruptedException
	{
		int TCID=122;
		Thread.sleep(2000);
		boolean actResult = hashHashtagWebPage.verifyHashtagDDWordpressBtn();
		Assert.assertTrue(actResult,"----TC 122 pass----");
		
	}
	
	@Test
	public void verifyHashtagDDBlockchainBtn() throws InterruptedException
	{
		int TCID=123;
		Thread.sleep(2000);
		boolean actResult = hashHashtagWebPage.verifyHashtagWebDDBlochainBtn();
		Assert.assertTrue(actResult,"----TC 123 pass----");
		
	}
	
	@Test
	public void verifyHashtagDDDesignBtn() throws InterruptedException
	{
		int TCID=124;
		Thread.sleep(2000);
		boolean actResult = hashHashtagWebPage.verifyHashtagWebDDdesignBtn();
		Assert.assertTrue(actResult,"----TC 124 pass----");
		
	}
	
	@Test
	public void verifyHashtagDDUIBtn() throws InterruptedException
	{
		int TCID=125;
		Thread.sleep(2000);
		boolean actResult = hashHashtagWebPage.verifyHashtagWebDDUIBtn();
		Assert.assertTrue(actResult,"----TC 125 pass----");
		
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
}
