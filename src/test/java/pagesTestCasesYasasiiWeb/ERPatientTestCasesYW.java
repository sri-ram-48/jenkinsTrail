package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.ER2OPRegistration;
import pagesOfYasasiiWeb.ERADTYasasiiWeb;
import pagesOfYasasiiWeb.ERPatientYasasiiWeb;
import pagesOfYasasiiWeb.FOERPatientEncounterYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class ERPatientTestCasesYW extends TestBaseYasasiiWeb {
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	

	@BeforeClass
	public void navigateERPage() throws InterruptedException {
		
		
		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("admin","KAmeda123$","KIMSHEALTH TVM");
		Thread.sleep(8000);
		
	}
	//Register ER Patient and create encounter, then edit profile and save
	
	
	@Test(dataProvider="getData")
	public void addERReg(String firstname ,String gender,String age,String encounter,String MRNo,String pasth,String presenth,String sh,String fh,String md,String fhn,String gen,String fam,String sn,String addnd,String des,String oa,String cdes,String dig,String ref,String reremarks,String search,String phsearch,String ht,String wt,String temp,String docnomb) throws InterruptedException, IOException {
		ERPatientYasasiiWeb ERReg = new ERPatientYasasiiWeb(driver) ;
		FOERPatientEncounterYasasiiWeb foerencounter = ERReg.enterERRegDetails(firstname, gender, age);
		ER2OPRegistration er2op =foerencounter.FoERencounter(encounter);
	//	ER2OPRegistration er2op =  new ER2OPRegistration(driver) ;
		er2op.ER2OPEditYasasiiWeb(docnomb);
		}
		
		

	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("ERPatientFlow");
		return data;	
	}
	
	@AfterClass
	public void logout() throws Exception
	{
		this.hm.clickLogout();
	}


}



