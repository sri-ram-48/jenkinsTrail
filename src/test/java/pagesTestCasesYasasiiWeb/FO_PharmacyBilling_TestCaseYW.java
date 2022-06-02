package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.FO_EncounterCreationScreenYasasiiWeb;
import pagesOfYasasiiWeb.FO_OPadvpay_yasassiWeb;
import pagesOfYasasiiWeb.FO_PharmacyBilling_YasassiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.LogingOutAndLogingIn_YasasiiWeb;

public class FO_PharmacyBilling_TestCaseYW  extends TestBaseYasasiiWeb {
	
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass()
	public void navigateFOPage() throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("3", "KAmeda123$", "KIMSHEALTH TVM");
	Thread.sleep(8000); 
	}

	

	@Test (dataProvider = "getData")
	public void pharmacy(String MRNo , String PROVIDER , String CHEIFCOMPLAINT , String MEDICINE,String doctor,String id, String password,String Site) throws InterruptedException, IOException {
		
//		FO_EncounterCreationScreenYasasiiWeb enc = new FO_EncounterCreationScreenYasasiiWeb(driver);
//		enc.takingEncounter( MRNo, doctor);
//		
//		LogingOutAndLogingIn_YasasiiWeb login= new LogingOutAndLogingIn_YasasiiWeb(driver);
//		login.action( id,  password, Site);
				
				
		FO_PharmacyBilling_YasassiWeb  bill = new   FO_PharmacyBilling_YasassiWeb (driver);
		 bill.pharmacybill(MRNo, PROVIDER, CHEIFCOMPLAINT, MEDICINE);
		
	}
	
	@AfterClass
	public void logout() throws Exception
	{
		this.hm.clickLogout();
		//Thread.sleep(2000);
		//this.hm.clickLogout();
	}
	
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("pharmacyBill");
		return data;
		}
	

}