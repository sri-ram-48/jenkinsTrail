package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class EMRJuniourSeniourDoctorVerificationYasasiiWeb extends PageFactoryInitYasasiiWeb{
	
	public EMRJuniourSeniourDoctorVerificationYasasiiWeb(WebDriver driver) {

		super(driver);

}
	
	

	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement IP;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[3]/div[1]/div[1]/ul[1]/app-list-item[3]/li[1]")
	public WebElement SelectIP;
	@FindBy(xpath = "//input[@id='subcategory']")
	public WebElement MyDepartment;
	@FindBy(xpath = "//li[contains(text(),'All IP')]")
	public WebElement AllIp;
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterName;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/span[2]")
	public WebElement SelectPatient;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/label[1]/i[1]")
	public WebElement Arrow;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/label[1]/i[1]")
	public WebElement LockArrow;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/app-emr-dashboard[1]/div[1]/label[2]/span[1]")
	public WebElement DoctorNote;
	@FindBy(xpath = "//button[normalize-space()='Create New Note']")
	public WebElement CreateNewNte;
	
	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement EnterChiefComplaint;
	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement EnterTemplate;
	@FindBy(xpath = "//li[contains(text(),'SOAP')]")
	public WebElement SelectTemplate;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[3]/div[1]/div[1]/div[1]/div[2]/button[1]")
	public WebElement OK;
	
	
	
	
	@FindBy(xpath = "//div[contains(text(),'Diagnosis and Plan')]")
	public WebElement DiagnosisAndPlan;
	@FindBy(xpath = "//div[@title='Colorado tick fever']")
	public WebElement SelectICD;
	@FindBy(xpath = "//label[contains(text(),'CPOE Service')]")
	public WebElement CPOEService;
	@FindBy(xpath = "//label[contains(text(),'Glucose 2 HR')]")
	public WebElement SelectService;
	@FindBy(xpath = "//label[contains(text(),'CPOE Pharmacy')]")
	public WebElement CPOEPharmacy;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[2]/div[1]/app-cpoe-order-view[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")
	public WebElement PatientNotInterviewed;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[2]/div[1]/app-cpoe-order-view[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[4]/button[1]")
	public WebElement aDd;
	@FindBy(xpath = "//i[@class='ki ki-admission-reconciliation']")
	public WebElement AdmissionReconsile;
	@FindBy(xpath = "//i[@class='ki ki-continue']")
	public WebElement Tick;
	@FindBy(xpath = "//i[@class='ki ki-reconciliation']")
	public WebElement Reconsile;
	@FindBy(xpath = "//button[@class='btn btn-dark-green active'][normalize-space()='Yes']")
	public WebElement yeS;
	@FindBy(xpath = "//input[@id='reason0']")
	public WebElement overridereason;
	@FindBy(xpath = "//button[@class='btn btn-dark-green active'][normalize-space()='Yes']")
	public WebElement YYes;
	
	
	
	@FindBy(xpath = "//*[contains(text(),'Ziagen')]")
	public WebElement SelectMedicine;	
	@FindBy(xpath = "//i[@class='ki ki-calendar-drug custom-calendar-drug']")
	public WebElement FrequencyDetails;
	@FindBy(xpath = "//div[@class='row mt-4 ng-star-inserted']//div[2]//div[1]//div[1]//div[2]//ki-input-control[1]//div[1]//input[1]")
	public WebElement EnterQuantity;		
	@FindBy(xpath = "//span[normalize-space()='Schedule']")
	public WebElement Schedule;
	@FindBy(xpath = "//input[@id='weeklyValue']")
	public WebElement EnterRecover;
	@FindBy(xpath = "//label[normalize-space()='Tuesday']")
	public WebElement Tuesday;
	@FindBy(xpath = "//div[@class='col-md-12 pr0 ta-r']//button[@type='button'][normalize-space()='OK']")
	public WebElement ok;
	@FindBy(xpath = "//input[@id='orderreadback']")
	public WebElement OrderRead;
	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement AddMedicine;
	@FindBy(xpath = "//img[@title='Print']")
	public WebElement Print;
	@FindBy(xpath = "//*[@id=\"sidebar\"]//print-preview-button-strip//div/cr-button[2]")
	public WebElement CancelPrint;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/app-emr-dashboard[1]/div[1]/label[10]/span[1]")
	public WebElement Save;

	//logout and then login as senior doctor
	
	
	@FindBy(xpath = "//ul[@class='navbar-nav float-right']//a[@class='nav-link dropdown-toggle pro-pic']")
	public WebElement DownArrow;
	@FindBy(xpath = "//div[@id='headitemdropdown_desktop']//span[contains(@class,'item-name')][normalize-space()='Logout']")
	public WebElement LogOut;
	@FindBy(xpath = "//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement Yes;
	@FindBy(xpath = "//input[@id='loginemail']")
	public WebElement EnterUserId;
	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement EnterPassword;
	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement Site;
	@FindBy(xpath = "//li[contains(text(),'KIMSHEALTH TVM')]")
	public WebElement SelectSite;
	@FindBy(xpath = "//button[contains(text(),'Login')]")
	public WebElement login;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[3]/div[1]/div[3]/span[1]/div[1]")
	public WebElement Task;
	@FindBy(xpath = "//span[contains(text(),'Jr doctor sr doctor verification')]")
	public WebElement JrToSrDrVerification;
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement Entername;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/img[1]")
	public WebElement SelectName;
	@FindBy(xpath = "//i[@class='fa fa-caret-right']")
	public WebElement SideArrow;
	@FindBy(xpath = "//*[@class='ki ki-check-circle-fill' and @title='Counter Sign Pending']")
	
	public WebElement CounterSignPending;
	@FindBy(xpath = "//textarea[@id='countersignremarkstxt']")
	public WebElement EnterCounterSignRemarks;
	@FindBy(xpath = "//span[contains(text(),'Save')]")
	public WebElement SaveCounterSign;
	
	
	
	
public void JuniourSeniorDoctorAction(String firstname,String gender,String age,String encounter,String MRNo) throws InterruptedException, IOException, AWTException {
/////////////////Select an IP patient		
	    Thread.sleep(600);
	    IP.click();
	    SelectIP.click();
	    MyDepartment.click();
	    AllIp.click();
		Thread.sleep(1000);
		EnterName.sendKeys(MRNo);
		Thread.sleep(800);
		SelectPatient.click();
		Thread.sleep(800);
		Arrow.click();
		LockArrow.click();
/////////////Create the doctor note
		DoctorNote.click();
		Thread.sleep(1000);
	//	CreateNewNte.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='chiefcomplainttext']")).clear();
		Thread.sleep(600);
		EnterChiefComplaint.sendKeys("Infection");
		Thread.sleep(600);
		EnterTemplate.click();
		EnterTemplate.sendKeys("SOA");
		Thread.sleep(1000);
		SelectTemplate.click();
		OK.click();
		Thread.sleep(800);
		DiagnosisAndPlan.click();
		Thread.sleep(800);
		SelectICD.click();
		CPOEService.click();
		SelectService.click();
		CPOEPharmacy.click();
		Thread.sleep(600);
		//PatientNotInterviewed.click();
		//aDd.click();
		AdmissionReconsile.click();
		Tick.click();
		Reconsile.click();
		Thread.sleep(600);
		yeS.click();
		Thread.sleep(700);
		SelectMedicine.click();
		Thread.sleep(500);
		//overridereason.sendKeys("ClinicallyRequired");
		//YYes.click();
		Thread.sleep(800);
		FrequencyDetails.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='row mt-4 ng-star-inserted']//div[2]//div[1]//div[1]//div[2]//ki-input-control[1]//div[1]//input[1]")).clear();
		Thread.sleep(600);
		EnterQuantity.sendKeys("2");
		Schedule.click();
		EnterRecover.sendKeys("1");
		Tuesday.click();
		ok.click();
		Thread.sleep(500);
		//OrderRead.sendKeys("yes");
		Thread.sleep(500);
		AddMedicine.click();
		Thread.sleep(900);
		Print.click();
		Thread.sleep(5000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(800);
//		Alert alert=driver.switchTo().alert();
//		alert.dismiss();
		
//		Robot robot = new Robot();
//		robot.mouseMove(1000, 1);
//		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//		Thread.sleep(2000);
//		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@id=\\\"sidebar\\\"]//print-preview-button-strip//div/cr-button[2]")).click();
		//CancelPrint.click();
		Save.click();
		Thread.sleep(5000);
		DownArrow.click();
		Thread.sleep(1000);
/////////Log out and log in as senior note
		LogOut.click();
		Thread.sleep(800);
		Yes.click();
		Thread.sleep(2000);
		EnterUserId.sendKeys("TVM00001");
		EnterPassword.sendKeys("KAmeda123$");
		Site.click();
		SelectSite.click();
		login.click();
		Thread.sleep(1000);
/////////Click on task and selct junior Senior doctor verification and select the patient
		Task.click();
		Thread.sleep(600);
		JrToSrDrVerification.click();
		Thread.sleep(900);
		Entername.sendKeys(MRNo);
		Thread.sleep(1000);
		SelectName.click();
		Thread.sleep(9000);
		
//		try
//		{
//			SideArrow.click();
//		}
//		catch (Exception e)
//		{
//			
//		}
		
//////////Click on red counter sign and enter the details and save it
		
		SideArrow.click();
		Thread.sleep(800);
		CounterSignPending.click();
		Thread.sleep(600);
		EnterCounterSignRemarks.sendKeys("Senior Doctor Verified");
		Thread.sleep(600);
		SaveCounterSign.click();
		Thread.sleep(600);

}
}