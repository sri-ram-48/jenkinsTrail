package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.EMRMedicationYasasiiWeb;

import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;



public class EMRMedicationTestCaseYW  extends TestBaseYasasiiWeb{
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass
	public void navigateOPfullPage() throws InterruptedException {
		
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("TVM00001", "KAmeda123$", "KIMSHEALTH TVM");
	Thread.sleep(8000);
		
	}
	@Test (dataProvider="getData")
	public void OPEMR(String firstname, String gender,String age,String encounter,String MRNo,String allergys,String editallergys,String deletere,String otheraller,String editdep,String edp,String sd,String cpoe1,String cpoe2,String cpoe3,String red,String cpoep,String rem,String cpoep2,String rem1,String ad1,String ad,String rm2,String side,String rm3,String p3,String p4,String rr,String re,String p5) throws InterruptedException, IOException {
		EMRMedicationYasasiiWeb OP = new EMRMedicationYasasiiWeb(driver) ;
		OP.medication( firstname,  gender, age,encounter, MRNo,allergys,editallergys,deletere,otheraller,editdep,edp,sd,cpoe1,cpoe2,cpoe3,red,cpoep,rem,cpoep2,rem1,ad1,ad,rm2,side,rm3,p3,p4,rr,re,p5);
	}
	
		
	@AfterClass public void logout() throws Exception { 
		  this.hm.clickLogout(); 
		  
	}
		  
		  @DataProvider
			public Object[][] getData() throws Exception {

				Object[][] data = readExcel("EMROPNote");
				return data;
		  
	}
}
