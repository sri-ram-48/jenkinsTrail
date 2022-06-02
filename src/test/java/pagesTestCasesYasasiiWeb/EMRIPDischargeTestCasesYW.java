package pagesTestCasesYasasiiWeb;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.EMRADTYasasiiWeb;
import pagesOfYasasiiWeb.EMRIPDischargeYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class EMRIPDischargeTestCasesYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateDO() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("TVM00001", "KAmeda123$", "KIMSHEALTH TVM");
	Thread.sleep(8000);
	
}

@Test(dataProvider="getData")
public void Schedulesettings(String firstname ,String gender,String age,String encounter,String MRNo) throws InterruptedException {
		Thread.sleep(5000);
		
		EMRIPDischargeYasasiiWeb Schedule = new EMRIPDischargeYasasiiWeb(driver);
		Schedule.DischargeSelectionn(firstname,gender,age,encounter,MRNo);
		}


@AfterClass
public void logout() throws Exception
{
	this.hm.clickLogout();
}

@DataProvider
public Object[][] getData() throws Exception {

	Object[][] data = readExcel("ERPatientFlow");
	return data;
}

}

