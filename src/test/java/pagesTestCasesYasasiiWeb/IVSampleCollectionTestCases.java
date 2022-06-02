package pagesTestCasesYasasiiWeb;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.IVSampleProcessingAfterDespatch;
import pagesOfYasasiiWeb.IVSampleDespatch;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

import pagesOfYasasiiWeb.IVSampleCollectionYasasiiWeb;

public class IVSampleCollectionTestCases extends TestBaseYasasiiWeb {
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
		@BeforeClass
	public void navigateFOPage() throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "Kameda Medical Center");
	Thread.sleep(8000);
		
	}
	
	@Test(priority=1)
	public void addSampleCollection() throws InterruptedException {
		Thread.sleep(5000);
		IVSampleCollectionYasasiiWeb ivsample = new IVSampleCollectionYasasiiWeb(driver);
		ivsample.enterIVsamplecollection();
		ivsample.enterIVsamplecollectionDetails();
		
}
	
		@Test(priority=2)
	   public void addSampleDespatch() throws InterruptedException {
			Thread.sleep(5000);
			
			IVSampleDespatch ivSample = new IVSampleDespatch(driver);
	        ivSample.enterIVSampleCollectionDeTails();
			}
		
		
		
		@Test(priority=3)
		public void addSampleProcessing() throws InterruptedException, IOException {
			Thread.sleep(5000);
			IVSampleProcessingAfterDespatch ivsample = new IVSampleProcessingAfterDespatch(driver);
		ivsample.enterIVSampleprocessingDeTails();
		
}
	@AfterClass
	public void logout() throws Exception
	{
		this.hm.clickLogout();
	}

	
}
