package pagesTestCasesYasasiiWeb;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.baseYasasiiWeb.TestBaseYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.IVSampleDespatch;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.EMRCPOEAdminstrationYasasiiWeb;
import pagesOfYasasiiWeb.EMROPNoteYasasiiWeb;
import pagesOfYasasiiWeb.OutsiderPatientYasasiiWeb;
import pagesOfYasasiiWeb.Outsiderappointment;

public class EMROPNoteTestCaseYW  extends TestBaseYasasiiWeb{
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass
	public void navigateOPfullPage() throws InterruptedException {
		
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("TVM00001", "KAmeda123$", "KIMSHEALTH TVM");
	Thread.sleep(8000);
		
	}
	
	@Test(dataProvider="getData")
	public void OPEMR(String firstname,String middlename,String lastname ,String age,String phoneno,String altphoneno,String homeadd1,String homeadd2,String docnumber,String expcondition,String testtype,String MRNo ) throws InterruptedException, IOException {
		EMROPNoteYasasiiWeb OP = new EMROPNoteYasasiiWeb(driver) ;
		OP.OP_EMRReg(firstname,MRNo);
	}
		
	
	
	
	
	
	@Test
	   public void cpoeadmin() throws InterruptedException {
			Thread.sleep(5000);
			
			EMRCPOEAdminstrationYasasiiWeb admin = new EMRCPOEAdminstrationYasasiiWeb(driver);
	        admin.EMRCPOE();
			}
			
		
		
	@AfterClass public void logout() throws Exception { 
		  this.hm.clickLogout(); 
	}
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("FOFullRegTest");
		return data;	
	}
}
