package LibraryFiles;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass
{
	//@Author Name: Dipali
	public static String  getID(int rowindex,int collindex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Arnav\\eclipse-workspace\\Hashtag_Project\\TestData\\TestData_data.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		 String value = sh.getRow(rowindex).getCell(collindex).getStringCellValue();
		return value;
		
	}
	
	public static void captureSS(WebDriver driver,int TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Arnav\\eclipse-workspace\\Hashtag_Project\\TestData\\FailedTestScreenshot\\abc.jpg");
		FileHandler.copy(src,dest);
		
	}
	
	public static String getPFData(String key) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Arnav\\eclipse-workspace\\Hashtag_Project\\Property.properties");
		Properties p=new Properties();
		p.load(file);
		
		String value = p.getProperty(key);
		return  value;
		
		
	}

	
	
}
