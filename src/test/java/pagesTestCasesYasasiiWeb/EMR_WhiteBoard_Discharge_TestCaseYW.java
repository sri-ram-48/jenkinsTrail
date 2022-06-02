package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.EMR_DietitianTemplateTestCaseYW;
import pagesOfYasasiiWeb.EMR_WhiteBoard_Discharge_YasasiiWeb;
import pagesOfYasasiiWeb.FO_ADT_AdmissionEditingYasasiiWeb;
import pagesOfYasasiiWeb.FO_EncounterCreationScreenYasasiiWeb;
import pagesOfYasasiiWeb.FO_SelectPatientAndCheckin_YasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.LogingOutAndLogingIn_YasasiiWeb;

public class EMR_WhiteBoard_Discharge_TestCaseYW extends TestBaseYasasiiWeb{
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass
	public void navigateFOPage() throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("nur01", "KAmeda123$", "KIMSHEALTH TVM");
	Thread.sleep(8000);
		
	
	}
//	@Test(dataProvider="getData")
	public void foReg(String MRNo,String doctor,String id, String password,String Site,String chiefcomplaint,String Templt,String Provider,String remarks,String medicinename,String servicename,String nurseusername,String nursepassword,String AdmissionType,String Prio) throws InterruptedException, IOException, AWTException {
		Thread.sleep(5000);
		
		FO_EncounterCreationScreenYasasiiWeb foenco= new FO_EncounterCreationScreenYasasiiWeb(driver);
		foenco.takingEncounter( MRNo, doctor);
		
		LogingOutAndLogingIn_YasasiiWeb loginout=new LogingOutAndLogingIn_YasasiiWeb(driver);
		loginout.action( id,  password, Site);
		
		EMR_WhiteBoard_Discharge_YasasiiWeb foReb = new EMR_WhiteBoard_Discharge_YasasiiWeb(driver);
		foReb.selectpatient( MRNo);
		foReb.doctornote( chiefcomplaint, Templt);
		foReb.referral( Provider, remarks);
        foReb.CPOEPharmacy( medicinename);
        foReb.savedoctornote();
	
	}
	
	
	
	@Test(dataProvider="getData")
	public void appoinment(String MRNo,String doctor,String id, String password,String Site,String chiefcomplaint,String Templt,String Provider,String remarks,String medicinename,String servicename,String nurseusername,String nursepassword,String AdmissionType,String Prio) throws InterruptedException, IOException, AWTException {
		Thread.sleep(5000);
//		
//    	FO_SelectPatientAndCheckin_YasasiiWeb foenco= new FO_SelectPatientAndCheckin_YasasiiWeb(driver);
//		foenco.selectPatient( MRNo);
////		foenco.checkin();
//		
//		FO_ADT_AdmissionEditingYasasiiWeb Aadt = new FO_ADT_AdmissionEditingYasasiiWeb(driver);
//		Aadt.ADT( MRNo, AdmissionType, doctor, Prio);
//		
//		
//		LogingOutAndLogingIn_YasasiiWeb loginout=new LogingOutAndLogingIn_YasasiiWeb(driver);
//		loginout.action( id,  password, Site);
		
		EMR_WhiteBoard_Discharge_YasasiiWeb foReb = new EMR_WhiteBoard_Discharge_YasasiiWeb(driver);
//		foReb.IPPatientList( MRNo);
//		foReb.doctornote( chiefcomplaint, Templt);
//		foReb.dischargerecommendation();
//        foReb.savedoctornote();
//		foReb.loggout();
		foReb.doingdischargeinwhiteboardSelectPatient(MRNo);
		foReb.doingdischargeinwhiteboard( nurseusername, nursepassword);
		foReb.login();
		foReb.deptclearance( MRNo, nurseusername, nursepassword);
		foReb.logintoraddept();
		foReb.rad( MRNo, nurseusername, nursepassword);
		foReb.logintomeddept();
		foReb.med( MRNo, nurseusername, nursepassword);
		foReb.loggout();
		foReb.doingdischargeinwhiteboardSelectPatient(MRNo);
		foReb.pharmClearance( nurseusername, nursepassword);
		foReb.adminlogin();
		
		
		
		    	FO_SelectPatientAndCheckin_YasasiiWeb foenco1= new FO_SelectPatientAndCheckin_YasasiiWeb(driver);
	        	foenco1.selectPatient( MRNo);
	        	foenco1.discharge();
	     foReb.loggout();
	     foReb.doingdischargeinwhiteboardSelectPatient(MRNo);
	     foReb.financlearance( nurseusername, nursepassword);
	     foReb.physicaldischarge(nurseusername, nursepassword);
	     foReb.canceldischarge(MRNo);
	}
	
	
	
	
		
		
	@AfterClass
	public void logout() throws Exception
	{
		this.hm.clickLogout();
	}
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("whiteboard");
		return data;	
	}


}
