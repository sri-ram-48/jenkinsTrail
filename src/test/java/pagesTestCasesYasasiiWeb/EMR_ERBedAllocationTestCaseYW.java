package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.EMRBirthRegistrationYasasiiWeb;
import pagesOfYasasiiWeb.EMR_ERBedAllocation;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class EMR_ERBedAllocationTestCaseYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("Mithu01", "KAmeda123$", "KIMSHEALTH TVM");
	Thread.sleep(8000);
	
}

//Register ER Patient 

@Test(dataProvider="getData")
public void ERBirth(String Patientname,String MRNo,String age,String doctor) throws InterruptedException, IOException {
		Thread.sleep(5000);
		
		EMR_ERBedAllocation Schedule1 = new EMR_ERBedAllocation(driver);
		Schedule1.ERBedAllocation(Patientname,MRNo,age,doctor);
		}

@AfterClass
public void logout() throws Exception
{
	this.hm.clickLogout();
}
@DataProvider
public Object[][] getData() throws Exception {

	Object[][] data = readExcel("ERBedAllocation");
	return data;
}

}