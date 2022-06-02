package pagesTestCasesYasasiiWeb;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.baseYasasiiWeb.TestBaseYasasiiWeb;
import pagesOfYasasiiWeb.EMRADTYasasiiWeb;
import pagesOfYasasiiWeb.EMRAppointmentPageYasasiiWeb;
import pagesOfYasasiiWeb.EMRDoctorsNote;
import pagesOfYasasiiWeb.EMRDoctorsNoteSOAPYasasiiWeb;
import pagesOfYasasiiWeb.EMRHSLogYasasiiWeb;
import pagesOfYasasiiWeb.EMRHomePageYasasiiWeb;
import pagesOfYasasiiWeb.EMReditDoctorsNoteYasasiiWeb;
import pagesOfYasasiiWeb.FOFullPatientRegistrationYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class EMRHomePageYW extends TestBaseYasasiiWeb {

	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;

	@BeforeClass
	public void navigateEMRPage() throws InterruptedException {

		this.login = new LoginPageYasasiiWeb(driver);
		this.hm = login.enterloginDetails("TVM00001", "KAmeda123$", "KIMSHEALTH TVM");
		Thread.sleep(8000);

	}

	@Test(dataProvider="getData")
	public void EMRscreen(String firstname ,String gender,String age,String encounter,String MRNo,String pasth,String presenth,String sh,String fh,String md,String fhn,String gen,String fam,String sn,String addnd,String des,String oa,String cdes,String dig,String ref,String reremarks,String search,String phsearch,String ht,String wt,String temp,String docnomb) throws InterruptedException, IOException {
		EMRHomePageYasasiiWeb emrpatientscreen = new EMRHomePageYasasiiWeb(driver);
		
		EMRDoctorsNote emrdoctorsnote =emrpatientscreen.enterEMRHomePage(firstname,gender,age,encounter,MRNo);
		//emrdoctorsnote.EMRdocnoteReconcillation();
		emrdoctorsnote.EMRdocnote();
		EMRDoctorsNoteSOAPYasasiiWeb docsoap = new EMRDoctorsNoteSOAPYasasiiWeb(driver);
		docsoap.medicalhistory(pasth,presenth, sh, fh, md, fhn,gen,fam,sn );
		docsoap.vitals(ht,wt,temp);
		docsoap.allergy(addnd,des,oa);
		docsoap.clinicalwarning(cdes);
		docsoap.diagnosisandplan(dig);
		docsoap.referral(ref,reremarks);
		docsoap.cpoeservice(search);
		docsoap.cpoepharmacy(phsearch);
		EMRHSLogYasasiiWeb emrhmlog = new EMRHSLogYasasiiWeb(driver);
	EMReditDoctorsNoteYasasiiWeb emredit = emrhmlog.EMRHomeLogpage();
		emredit.EMReditIPRecommendation();
//		EMRADTYasasiiWeb Schedule = new EMRADTYasasiiWeb(driver);
//		Schedule.AdtSelectionn();
	}
	

	
	  @AfterClass public void logout() throws Exception { 
		  this.hm.clickLogout(); 
		  }
	  
	 

	@DataProvider
	public Object[][] getData() throws Exception {

		Object[][] data = readExcel("ERPatientFlow");
		return data;
	}

}
