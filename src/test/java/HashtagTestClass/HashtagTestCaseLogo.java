package HashtagTestClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import LibraryFiles.BaseClass;
import LibraryFiles.UtilityClass;
import Module1_page.HashtagWebPage;

public class HashtagTestCaseLogo extends BaseClass
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
	public void verifylinkdnlogo() throws EncryptedDocumentException, IOException
	{
		int TCID=116;
		boolean actResult = hashHashtagWebPage.verifyHashtagWebPagelinkdnlogo();
		String expResult = UtilityClass.getID(0,0);
		Assert.assertEquals(actResult, actResult,"----TC 116 Pass----");
		
	}
	
	@Test
	public void verifyFacebooklogo() throws EncryptedDocumentException, IOException
	{
		int TCID=117;
		boolean actResult = hashHashtagWebPage.verifyHashtagWebPageFacebooklogo();
		String expResult = UtilityClass.getID(0,0);
		Assert.assertEquals(actResult, actResult,"----TC 117 Pass----");
		
	}
	
	@Test
	public void verifyInstagramlogo() throws EncryptedDocumentException, IOException
	{
		int TCID=118;
		boolean actResult = hashHashtagWebPage.verifyHashtagWebPageInstagramlogo();
		String expResult = UtilityClass.getID(0,0);
		Assert.assertEquals(actResult, actResult,"----TC 118 Pass----");
		
	}
	
	
	@Test
	public void verifyDevelopmentlogo() throws EncryptedDocumentException, IOException
	{
		int TCID=120;
		boolean actResult = hashHashtagWebPage.verifyHashtagWebPageDevelopmentlogo();
		String expResult = UtilityClass.getID(0,0);
		Assert.assertEquals(actResult, actResult,"----TC 120 Pass----");
		
	}
	
	@Test
	public void verifyWedeliverlogo() throws EncryptedDocumentException, IOException
	{
		int TCID=121;
		boolean actResult = hashHashtagWebPage.verifyHashtagWebPageWedeliverlogo();
		String expResult = UtilityClass.getID(0,0);
		Assert.assertEquals(actResult, actResult,"----TC 122 Pass----");
		
	}
	
	
	
	
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
}
