package pagesTestCasesYasasiiWeb;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

//import pagesOfYasasiiWeb.EMRCPOEAdminstrationYasasiiWeb;
import pagesOfYasasiiWeb.EMRFollowupNoteYasasiiWeb;
import pagesOfYasasiiWeb.FOEncounterYasasiiWeb;
import pagesOfYasasiiWeb.FOFollowUpNoteYasasiiWeb;
import pagesOfYasasiiWeb.FORegEditYasasiiWeb;
import pagesOfYasasiiWeb.FORegistrationYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
//import pagesOfYasasiiWeb.MastersResourceCategoryYasassiiWeb;

import org.testng.annotations.BeforeClass;

public class FOFollowUpNoteTestcaseYW extends TestBaseYasasiiWeb{
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass()
	public void navigateFOPage() throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "KAmeda123$", "KIMSHEALTH TVM");
	
	}
	
	
	



@Test (priority=1,dataProvider="getData")

public void FOfollowup(String firstname ,String gender,String age,String encounter,String MRNo) throws InterruptedException, IOException {
	FOFollowUpNoteYasasiiWeb note = new FOFollowUpNoteYasasiiWeb(driver);
	note.FOfollowup(firstname,gender,age,encounter,MRNo);

}
		
@Test (priority=2,dataProvider="getData")
public void EMRFollowup(String firstname ,String gender,String age,String encounter,String MRNo) throws InterruptedException, IOException {
		Thread.sleep(5000);
		
		EMRFollowupNoteYasasiiWeb followup = new EMRFollowupNoteYasasiiWeb(driver);
        followup.EMRFollowup(firstname,gender,age,encounter,MRNo);
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
