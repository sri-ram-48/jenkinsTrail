package pagesTestCasesYasasiiWeb;
import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.EMRJuniourSeniourDoctorVerificationYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.EMRJuniourSeniourDoctorVerificationYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.EMRNurseNoteYasasiiWeb;


public class EMRJuniorSeniorDoctorVerificationTestCasesYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("jur01", "KAmeda123$", "KIMSHEALTH TVM");
	Thread.sleep(8000);
	
}
@Test(dataProvider="getData")
public void NurseNote(String firstname ,String gender,String age,String encounter,String MRNo,String pasth,String presenth,String sh,String fh,String md,String fhn,String gen,String fam,String sn,String addnd,String des,String oa,String cdes,String dig,String ref,String reremarks,String search,String phsearch,String ht,String wt,String temp,String docnomb) throws InterruptedException, IOException, AWTException
{
	Thread.sleep(5000);
	
	EMRJuniourSeniourDoctorVerificationYasasiiWeb junoiur = new EMRJuniourSeniourDoctorVerificationYasasiiWeb(driver);
	junoiur.JuniourSeniorDoctorAction(firstname,gender,age,encounter,MRNo);
	}


@AfterClass
public void logout() throws Exception
{
	this.hm.clickLogout();
}

@DataProvider
public Object[][] getData() throws Exception{

	Object[][] data =readExcel("ERPatientFlow");
	return data;	
}


}
