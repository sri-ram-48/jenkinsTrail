package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.EMRBirthRegistrationYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.EMRNurseNoteYasasiiWeb;

public class EMRNurseNotTestCasesYasasiiWeb extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("nur01", "KAmeda123$", "KIMSHEALTH TVM");
	Thread.sleep(8000);
	
}

@Test(dataProvider="getData")
public void NurseNote(String firstname,String middlename,String lastname ,String age,String phoneno,String altphoneno,String homeadd1,String homeadd2,String docnumber,String expcondition,String testtype,String MRNo) throws InterruptedException, IOException
{
	Thread.sleep(5000);
	
	EMRNurseNoteYasasiiWeb nurse = new EMRNurseNoteYasasiiWeb(driver);
	nurse.NurseNoteAction(firstname,middlename,lastname,age,phoneno,altphoneno,homeadd1,homeadd2,docnumber,MRNo);
	}

@DataProvider
public Object[][] getData() throws Exception {

	Object[][] data = readExcel("FOFullRegTest");
	return data;
}

}
