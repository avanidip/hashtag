package HashtagTestClass;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import LibraryFiles.BaseClass;
import LibraryFiles.UtilityClass;
import Module1_page.HashtagWebPage;




public class Hashtag_TestClass extends BaseClass
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
	public void VerifyHashtagLogo() throws EncryptedDocumentException, IOException, InterruptedException
	{
		int TCID=101;
		Thread.sleep(2000);
		boolean actResult = hashHashtagWebPage.verifyHashtagWebPagelogo();
		Assert.assertTrue(actResult,"-----TC 101 pass-----");
	}
	
	@Test
	public void verifyHashtagLogoBtn() throws InterruptedException
	{
		int TCID=102;
		Thread.sleep(2000);
		boolean actResult = hashHashtagWebPage.verifyHashtagWebPageBtn();
		Assert.assertTrue(actResult,"----TC 102 pass----");
		
	}
	
	@Test
	public void verifyHashtagShopifybtn()
	{
		int TCID=103;
		boolean actText = hashHashtagWebPage.verifyHashtagWebShopifyBtn();
		Assert.assertTrue(actText,"----TC 103 pass---");
		
	}
	
	@Test
	public void verifyHashtagShopifyText() throws EncryptedDocumentException, IOException
	{
		int TCID=104;
		String actResult = hashHashtagWebPage.verifyHashtagWebShopifyText();
		String expResult = UtilityClass.getID(0,2);
		Assert.assertEquals(actResult, expResult,"------TC 104 pass----");
	}
	
	@Test
	public void verifyHashtagWebPageservicesDD()
	{
		int TCID=105;
		
		boolean actResult = hashHashtagWebPage.verifyHashtagWebPageServicesDD(driver);
		Assert.assertTrue(actResult,"---TC 105 pass---");
	}
	
   @Test
	public void verifyHashtagWebPageservicesDDText() throws EncryptedDocumentException, IOException
   {
	   int TCID=105;
	   boolean actResult = hashHashtagWebPage.verifyHashtagWebPageServicesDD(driver);
	   String expResult = UtilityClass.getID(0,1);
		Assert.assertEquals(actResult, expResult,"------TC 104 pass----");

   }
   
   
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
}
