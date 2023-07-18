package HashtagTestClass;

import java.io.IOException;
import java.util.jar.Attributes.Name;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import LibraryFiles.BaseClass;
import LibraryFiles.UtilityClass;
import Module1_page.HashtagWebPage;

public class HashTagApplynowTest extends BaseClass 
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
	public void verifyApplyNow() throws EncryptedDocumentException, IOException
	{
		   int TCID=106;
	       hashHashtagWebPage.inpHashtagWebPageName(UtilityClass.getID(0,3));
	       hashHashtagWebPage.inpHashtagWebPagePhone(UtilityClass.getID(0,4));
	       hashHashtagWebPage.inpHashtagWebPageEmail(UtilityClass.getID(0,5));
	       hashHashtagWebPage.inpHashtagWebPageDescrip(UtilityClass.getID(0,6));
	       hashHashtagWebPage.clickHashtagWebPageApplyBtn();
	}
	
	@Test
	public void verifyApplyNowWithBlankData() throws EncryptedDocumentException, IOException
	{
		   int TCID=107;
	       hashHashtagWebPage.inpHashtagWebPageName(UtilityClass.getID(0,7));
	       hashHashtagWebPage.inpHashtagWebPagePhone(UtilityClass.getID(0,8));
	       hashHashtagWebPage.inpHashtagWebPageEmail(UtilityClass.getID(0,9));
	       hashHashtagWebPage.inpHashtagWebPageDescrip(UtilityClass.getID(1,0));
	       hashHashtagWebPage.clickHashtagWebPageApplyBtn();
	}
	
	@Test
	public void verifyApplyNowInvalid() throws EncryptedDocumentException, IOException
	{
		   int TCID=108;
	       hashHashtagWebPage.inpHashtagWebPageName(UtilityClass.getID(0,1));
	       hashHashtagWebPage.inpHashtagWebPagePhone(UtilityClass.getID(0,2));
	       hashHashtagWebPage.inpHashtagWebPageEmail(UtilityClass.getID(0,3));
	       hashHashtagWebPage.inpHashtagWebPageDescrip(UtilityClass.getID(0,4));
	       hashHashtagWebPage.clickHashtagWebPageApplyBtn();
	}
	
	@Test
	public void verifyApplyNowNameonly() throws EncryptedDocumentException, IOException
	{
		   int TCID=109;
	       hashHashtagWebPage.inpHashtagWebPageName(UtilityClass.getID(0,3));
	      
	       hashHashtagWebPage.clickHashtagWebPageApplyBtn();
	}
	
	@Test
	public void verifyApplyNowNPonly() throws EncryptedDocumentException, IOException
	{
		   int TCID=110;
	       hashHashtagWebPage.inpHashtagWebPageName(UtilityClass.getID(0,3));
	       hashHashtagWebPage.inpHashtagWebPagePhone(UtilityClass.getID(0,4));
	       
	       hashHashtagWebPage.clickHashtagWebPageApplyBtn();
	}
	
	@Test
	public void verifyApplyNowphone() throws EncryptedDocumentException, IOException
	{
		   int TCID=111;
	        hashHashtagWebPage.inpHashtagWebPagePhone(UtilityClass.getID(0,4));
	        hashHashtagWebPage.clickHashtagWebPageApplyBtn();
	}
	
	
	@Test
	public void verifyApplyNowEmail() throws EncryptedDocumentException, IOException
	{
		   int TCID=112;
	       
	       hashHashtagWebPage.inpHashtagWebPageEmail(UtilityClass.getID(0,5));
	      
	       hashHashtagWebPage.clickHashtagWebPageApplyBtn();
	}
	
	
	@Test
	public void verifyApplyNowPE() throws EncryptedDocumentException, IOException
	{
		   int TCID=113;
	       
	       hashHashtagWebPage.inpHashtagWebPagePhone(UtilityClass.getID(0,4));
	       hashHashtagWebPage.inpHashtagWebPageEmail(UtilityClass.getID(0,5));
	      
	       hashHashtagWebPage.clickHashtagWebPageApplyBtn();
	}
	
	@Test
	public void verifyApplyNowDesc() throws EncryptedDocumentException, IOException
	{
		   int TCID=114;
	       
	       hashHashtagWebPage.inpHashtagWebPageDescrip(UtilityClass.getID(0,6));
	       hashHashtagWebPage.clickHashtagWebPageApplyBtn();
	}
	
	@Test
	public void verifyApplyNowNameDe() throws EncryptedDocumentException, IOException
	{
		   int TCID=115;
	       hashHashtagWebPage.inpHashtagWebPageName(UtilityClass.getID(0,3));
	      
	       hashHashtagWebPage.inpHashtagWebPageDescrip(UtilityClass.getID(0,6));
	       hashHashtagWebPage.clickHashtagWebPageApplyBtn();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
}
