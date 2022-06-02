package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.EMR_DoctorNote_CategoryFilters_YasassiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.PatientDischarge_YasassiWeb;

public class PatientDischarge_TestCasesYW  extends TestBaseYasasiiWeb{
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass()
	public void navigateFOPage(  ) throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("3", "KAmeda123$", "KIMSHEALTH TVM");
	Thread.sleep(8000); 
	}
	
	@Test (dataProvider = "getData")
	public void patientdischarge (String MRNO , String nurseUser , String  Password,String depUser , String RADuser, String meduser , String AdminUser ,String  AdminPassword) throws InterruptedException, IOException, AWTException {
		
		Thread.sleep(8000); 
		
		PatientDischarge_YasassiWeb dis = new PatientDischarge_YasassiWeb(driver);
		
		dis.dischargeRecommendation(MRNO, nurseUser, Password);
		dis.dischargeApproval(MRNO, nurseUser, Password, depUser);
		dis.laboratoryClearance(MRNO, Password, depUser, RADuser);
		dis.radiologyClearance(MRNO, RADuser, Password, meduser);
		dis.medicalClearance(MRNO,Password, meduser, nurseUser);
		dis.PharmacyClearance(MRNO, nurseUser, Password, AdminUser, AdminPassword);
		dis.ADTAppoval(MRNO, nurseUser, Password);
		dis.financialClearance(MRNO, nurseUser, Password);
		dis.physicalDischarge(MRNO, nurseUser, AdminPassword);
		
		
		
		
		
		
		
		
	}
	
	
	
	@AfterClass
	public void logout() throws Exception
	{
		driver.quit();
		//this.hm.clickLogout();
		
	}
	
	
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("PatientDischarge");
		return data;	
	} 

	
	
	

}

