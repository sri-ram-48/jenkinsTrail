package pagesOfYasasiiWeb;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;
public class EMRMedicationYasasiiWeb extends PageFactoryInitYasasiiWeb{
	
	public EMRMedicationYasasiiWeb(WebDriver driver) {
		super(driver);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	} 
	@FindBy(xpath="//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]")
	public WebElement toggle;
	
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
	public WebElement emr;
	
	@FindBy(xpath="//span[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRhomescreen;
	
	@FindBy(xpath="//input[@id='maincategory']")
	public WebElement Menudropdown;
	
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[3]/div[1]/div[1]/ul[1]/app-list-item[1]/li[1]")
	public WebElement selectop;
	
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatientName;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement SelectPatient;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/label[1]")
	public WebElement patienthomepageicon;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/label[1]/i[1]")
	public WebElement patienthomepagelock;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/app-emr-dashboard[1]/div[1]/label[2]/span[1]")
	public WebElement docnote;
	
	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement ChiefComplaint;
	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement Template;
	@FindBy(xpath = "//li[normalize-space()='SOAP']")
	public WebElement SelectTemplate;
	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement Ok;
	
    @FindBy(xpath = "//button[contains(text(),'Create New Note')]")
     public WebElement createnote;
		
    @FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement encreate;
	
	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement template;
	@FindBy(xpath = "(//li)[23]")
	public WebElement SOAP;
	@FindBy(xpath = "//*[@class='btn btn-dark-green active']")
	public WebElement clickOK ;
	@FindBy(xpath="//label[contains(text(),'CPOE Service')]")
	public WebElement CPOEServices;
	@FindBy(xpath="//input[@id='cpoeSearchText']")
	public WebElement CPOESearch1;
	@FindBy(xpath="//*[@id='component_cpoe']/app-cpoe-container/div/div/div[2]/div/app-cpoe-order-view/div/div[3]/div/div/div/div/div/div/div[2]/div[1]/i")
	public WebElement point1;
	
	@FindBy(xpath="//span[contains(text(),'Schedule')]")
	public WebElement schedule;
	
	@FindBy(xpath="//span[contains(text(),'Weekly')]")
	public WebElement Weekly;
	@FindBy(xpath="//input[@id='weekcount']")
	public WebElement reoccur;
	@FindBy(xpath="//label[normalize-space()='Tuesday']")
	public WebElement tuesday;
	@FindBy(xpath="//label[normalize-space()='Friday']")
	public WebElement Friday;
	@FindBy(xpath="//input[@id='occurrenceCount']")
	public WebElement occurcount;
	@FindBy(xpath="//button[@class='icon-btn btn-dark-green inline min-clear-btm m0']//i[@class='ki ki-plus']")
	public WebElement scheduleadd;
	@FindBy(xpath="//button[contains(text(),'Update')]")
	public WebElement update;
	
	@FindBy(xpath="//i[@class='ki ki-reset']")
	public WebElement refresh;
	@FindBy(xpath="//input[@id='cpoeSearchText']")
	public WebElement CPOESearch2;
	
	@FindBy(xpath="//i[@class='ki ki-reset']")
	public WebElement refresh1;
	
	@FindBy(xpath="//input[@id='cpoeSearchText']")
	public WebElement CPOESearch3;
	@FindBy(xpath="//div[@class='row ng-star-inserted']//div[1]//div[1]//div[2]//div[1]//i[1]")
	public WebElement editpoint;
	@FindBy(xpath="//textarea[@id='reasonfororder']")
	public WebElement reasonforedit;
	@FindBy(xpath="//button[normalize-space()='Update']")
	public WebElement updateservice;
	@FindBy(xpath="//label[normalize-space()='Select All']//span[@class='checkmark']")
	public WebElement selectallservice;
	@FindBy(xpath="//span[@title='Delete Service']//i[@class='ki ki-trash']")
	public WebElement deleteservice;
    @FindBy(xpath="//button[@class='btn btn-dark-green active'][normalize-space()='Yes']")
    public WebElement yesdelete;
    @FindBy(xpath = "//label[contains(text(),'CPOE Pharmacy')]")
	public WebElement CPOEPharmacy;
	@FindBy(xpath = "//input[@placeholder='Search with Favorites']")
	public WebElement CPOEPharmacysearch;
	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement ADDMedicine;
	@FindBy(xpath="//div[@class='order-details']//i[@class='fa fa-ellipsis-v']")
	public WebElement editpharmacy;
	@FindBy(xpath="//input[@name='remarks']")
	public WebElement remarkedit;
	@FindBy(xpath="//button[@id='updatePharmacy']")
	public WebElement updatepharmacy;
	@FindBy(xpath="//button[@class='btn btn-dark-green active'][normalize-space()='Yes']")
	public WebElement yesdeletepharmacy;
	@FindBy(xpath="//input[@id='MedicineName']")
	public WebElement medicinename;
	@FindBy(xpath="//span[contains(@title,'Add Additive')]//i[contains(@class,'fa fa-plus')]")
	public WebElement Add;
	@FindBy(xpath="//div[contains(@class,'col-md-12 pr0 ta-r')]//button[contains(@type,'button')][normalize-space()='OK']")
	public WebElement ok;
	@FindBy(xpath="//input[@id='frequencyid']")
	public WebElement frequency;
	@FindBy(xpath="//input[@id='ivrate']")
	public WebElement addrate;
	@FindBy(xpath="//input[@id='ivrateunitid']")
	public WebElement idadd;
	@FindBy(xpath="//input[@id='mindose']")
	public WebElement mindose;
	@FindBy(xpath="//input[@id='doseunitid']")
	public WebElement doseunit;
	@FindBy(xpath="//i[@class='ki ki-calculator-dose']")
	public WebElement dosage;
	@FindBy(xpath="//form[@class='ng-untouched ng-pristine ng-valid']//button[@type='button'][normalize-space()='OK']")
	public WebElement doseok;
	@FindBy(xpath="//input[@id='routeid']")
	public WebElement routeid;
	@FindBy(xpath="//input[@id='formid']")
    public WebElement form;	
	@FindBy(xpath="//input[@id='frequencyid']")
	public WebElement frequency1;
	@FindBy(xpath="//input[@id='duration']")
	public WebElement durationinsulin;
	@FindBy(xpath="//input[@id='durationunitid']")
	public WebElement unitid;
	@FindBy(xpath="//input[@id='duration']")
	public WebElement durationpast;
	@FindBy(xpath="//div[@class='order-details']//div[@class='multi-action']")
	public WebElement editpharmacy1;
	@FindBy(xpath="//input[@id='frequencyid']")
	public WebElement frequency2;
	@FindBy(xpath="//div[@class='form-group ng-star-inserted']//input[@id='frequencyvalue']")
	public WebElement days;
	@FindBy(xpath="//input[@id='frequencyid']")
	public WebElement Frequecylink;
	@FindBy(xpath="//input[@name='remarks']")
	public WebElement remarks;
	@FindBy(xpath="//input[@id='antibioticorderingreasonid']")
	public WebElement reason;
	@FindBy(xpath="//label[normalize-space()='Linked Medicine']//span[contains(@class,'checkmark')]")
	public WebElement linkedmedicine;
	@FindBy (xpath="//label[contains(text(),'Calpol 120Mg Suspension 60Ml120 Mg , 5 Ml (120 Mg)')]//span[@class='checkmark']")
	public WebElement checkbox;
	@FindBy(xpath="//button[normalize-space()='Ok']")
	public WebElement ok1;
	@FindBy(xpath="//input[@id='mindose']")
	public WebElement mindose1;
    @FindBy(xpath="//input[@id='doseunitid']")
	public WebElement doseunit1;
    @FindBy(xpath="//input[@id='routeid']")
	public WebElement routeid1;
	@FindBy(xpath="//input[@id='formid']")
    public WebElement form1;	
	@FindBy(xpath="//input[@id='frequencyid']")
	public WebElement frequency3;
	@FindBy(xpath="//input[@id='duration']")
	public WebElement duration;
    @FindBy(xpath="//input[@id='antibioticorderingreasonid']")
	public WebElement OrderingReason;
	@FindBy(xpath="//label[normalize-space()='Add as Tapering']")
	public WebElement tapering;
	@FindBy(xpath="//input[@id='frequencyid']")
	public WebElement frequency4;
	@FindBy(xpath="//div[@class='form-group ng-star-inserted']//input[@id='frequencyvalue']")
	public WebElement dayss;
	@FindBy(xpath="//label[normalize-space()='Add as Tapering']")
	public WebElement tapering1;
	@FindBy(xpath="//body/app-root/app-layout[@class='ng-star-inserted']/main[@class='page-body']/app-emr-homescreen[@class='ng-star-inserted']/div[@class='page-container']/div[@class='ng-star-inserted']/div[@class='note-layout action-locked']/div[@class='notelayoutcontainer']/app-emrtemplateloader[@class='ng-star-inserted']/div[@class='pat-note-entry']/div[@class='pat-current-temp']/div[@class='temp-container']/div[@id='noterightregion']/div[@id='section_cpoe']/div[@id='component_cpoe']/app-cpoe-container/div[@class='card-container']/div[@class='row']/div[@class='mbl-pl5 col-md-5']/div/app-cpoe-order-view/div[@class='card card-right order-card-container']/div[@class='card-body']/div[@class='order-container-wrap']/div[@class='all-orders ng-star-inserted']/div[@class='order-list']/div[@class='row ng-star-inserted']/div[1]/div[1]/div[2]/div[1]")
	public WebElement editpharmacy3;
    @FindBy(xpath="//input[@id='doseunitid']")
    public WebElement dose;
	@FindBy(xpath="//input[@id='durationunitid']")
	public WebElement id;
	@FindBy(xpath="//div[@class='col-md-12']//div[1]//div[1]//div[5]//div[2]//label[1]//i[1]")
	public WebElement taperingedit;
	
	@FindBy(xpath="//label[normalize-space()='Update Tapering']")
	public WebElement updatetapering;
	
//Vitalsigns
	@FindBy(xpath="//div[contains(text(),'Vital Signs and Measurement')]")
	public WebElement vital;
	@FindBy(xpath="//label[@class='cat-type-label gen']//i[@class='ki ki-ellipsis-v']")
	public WebElement dotsvital;
	@FindBy(xpath="//input[@id='vital020']")
	public WebElement Height;
	@FindBy(xpath="//input[@id='vital050']")
	public WebElement Weight;

//Allergy
	@FindBy(xpath="//div[@class='item-name'][normalize-space()='Allergy']")
	public WebElement allergy;
	@FindBy(xpath="//div[@class='card card-left']//div[@class='card-body form-inputs']//div[@class='ng-star-inserted']//div[@class='row']//div[@class='col-md-12']//div[@class='empty-card-icon']//div//button[@type='button'][normalize-space()='Add New Allergy']")
	public WebElement addnewallergy;
	@FindBy(xpath="//input[@id='drugclassname']")
	public WebElement searchname;
	@FindBy(xpath="//input[@id='severityname']")
	public WebElement severity;
	@FindBy(xpath="//div[@class='col-md-12 ta-r']//button[@type='button'][normalize-space()='Add']")
	public WebElement addallergy;
	@FindBy(xpath="//i[@class='fa fa-ellipsis-v']")
	public WebElement allergypoint;
	@FindBy(xpath="//textarea[@id='description']")
	public WebElement editdescrip;
	@FindBy(xpath="//div[@class='col-md-12 ta-r']//button[@type='button'][normalize-space()='Add']")
	public WebElement editadd;
//savenote
	@FindBy(xpath="//span[@class='icon emrsave']")
	public WebElement savenote;
//allergy_log,delete& Revoke
	@FindBy(xpath="//div[@class='card card-sm left-border mild']//i[@class='fa fa-ellipsis-v']")
	public WebElement allergypoint1;
	@FindBy(xpath="//body/modal-container[@role='dialog']/div[@role='document']/div[@class='modal-content']/div[2]/div[2]/span[1]")
	public WebElement closelog;
	@FindBy(xpath="//textarea[@id='deletedreason']")
	public WebElement deletereason;
	@FindBy(xpath="//span[@class='btn btn-dark-green active']")
	public WebElement okdelete;
	@FindBy(xpath="//div[@class='card card-sm left-border is-deleted mild']//i[@class='fa fa-ellipsis-v']")
	public WebElement allergypoint2;
//otherAllergy	
	@FindBy(xpath="//button[normalize-space()='Add New Allergy']")
	public WebElement otherallergy;
	@FindBy(xpath="//input[@id='otherallergyname']")
	public WebElement serviceother;
	@FindBy(xpath="//div[@class='col-md-12 ta-r']//button[@type='button'][normalize-space()='Add']")
	public WebElement addother;
	@FindBy(xpath="//div[@class='card card-sm left-border noseverity']//div[@class='multi-action']")
	public WebElement othereditpoint;
	@FindBy(xpath="//button[@class='btn btn-dark-green active'][normalize-space()='Yes']")
	public WebElement otherdelete;
//ClicnicalWarning
	@FindBy(xpath="//div[contains(text(),'Clinical Warning')]")
	public WebElement clinical;
	@FindBy(xpath="//input[@id='onset']")
    public WebElement onsetclinical;	
	@FindBy(xpath="//modal-container[@role='dialog']//div[4]//div[2]//span[1]")
	public WebElement okclinical;
//Diagnosis&Plan
	@FindBy(xpath="//div[contains(text(),'Diagnosis and Plan')]")
	public WebElement diagnosis;
	@FindBy(xpath="//input[@id='db']")
	public WebElement searchdignosis;
	@FindBy(xpath="//div[@class='card card-sm ng-star-inserted']//i[@class='fa fa-ellipsis-v']")
	public WebElement editdignosis;
	@FindBy(xpath="/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-diagnosis-template[1]/div[2]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[1]/div[3]/ki-input-control[1]/div[1]/input[1]")
	public WebElement onsetdig;
	@FindBy(xpath="//button[@aria-label='Close'][normalize-space()='OK']")
	public WebElement okdig;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void  medication(String firstname, String gender,String age,String encounter,String MRNo,String allergys,String editallergys,String deletere,String otheraller,String editdep,String edp,String sd,String cpoe1,String cpoe2,String cpoe3,String red,String cpoep,String rem,String cpoep2,String rem1,String ad1,String ad,String rm2,String side,String rm3,String p3,String p4,String rr ,String re,String p5) throws InterruptedException {

		 Thread.sleep(1000);
		 EnterPatientName.sendKeys(MRNo);
		 Thread.sleep(800);
		 SelectPatient.click();
		 Thread.sleep(2000);
		  patienthomepageicon.click();
		  patienthomepagelock.click();
////////DocNote 
		  Thread.sleep(5000);
  	      docnote.click();
			Thread.sleep(1000);
			
			
			
			
			
//			List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));
//			
//			if(dynamicElement.size() !=0)
//			{
//				driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
//			}
//			  Thread.sleep(800);
//			ChiefComplaint.clear();
//			Thread.sleep(800);
//			ChiefComplaint.sendKeys("fever");
//			driver.findElement(By.xpath("//strong[normalize-space()='Fever']")).click();
//			Template.click();
//		  Thread.sleep(800);
//			Template.sendKeys("SOAP");
////			driver.findElement(By.xpath("//*[contains(text(),'\" + template + \"')]"));
//			SelectTemplate.click();
//			Ok.click();
			
			
			
			
			
	  //     createnote.click();
			Thread.sleep(1000);
//////TemplateSelection
 	 	  encreate.clear();
	       encreate.click();
		   Thread.sleep(1000);
		    encreate.sendKeys("Fever");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//strong[contains(text(),'Fever')]")).click();
			Thread.sleep(3000);
			template.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//li[contains(text(),'SOAP')]")).click();
			clickOK.click();
			
			Thread.sleep(1000);
//////Vital Signs
			vital.click();
			Thread.sleep(1000);
			dotsvital.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[normalize-space()='Default View']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[normalize-space()='Add new']")).click();
			Thread.sleep(1000);
			Height.click();
			Thread.sleep(1000);
			Height.clear();
			Height.sendKeys("170");
			Thread.sleep(1000);
			Weight.click();
			Thread.sleep(1000);
			Weight.clear();
			Weight.sendKeys("76");
			Thread.sleep(1000);
//Allergy
			allergy.click();
			Thread.sleep(1000);
			addnewallergy.click();
			Thread.sleep(1000);
			searchname.click();
			Thread.sleep(1000);
			searchname.sendKeys(allergys);
			searchname.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[normalize-space()='Parathyroid Hormone And Analogs']//div[@id='list0']")).click();
			severity.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//li[normalize-space()='Mild']")).click();
			Thread.sleep(1000);
			addallergy.click();
			Thread.sleep(1000);
//Editallergy
			allergypoint.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[normalize-space()='Edit']")).click();
			Thread.sleep(1000);
			editdescrip.click();
			Thread.sleep(1000);
			editdescrip.sendKeys(editallergys);
			Thread.sleep(1000);
			editadd.click();
			Thread.sleep(1000);
//savethenote 
			savenote.click();
			Thread.sleep(10000);
////////DocNote 
			  Thread.sleep(5000);
	  	      docnote.click();
				Thread.sleep(1000);
		      createnote.click();
				Thread.sleep(1000);
//////TemplateSelection
	 	 	  encreate.clear();
		       encreate.click();
			   Thread.sleep(1000);
			    encreate.sendKeys("Fever");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//strong[contains(text(),'Fever')]")).click();
				Thread.sleep(3000);
				template.click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//li[contains(text(),'SOAP')]")).click();
				clickOK.click();
				Thread.sleep(1000);	
				
//Allergy-Log view, Delete & Revoke			
				allergy.click();
				Thread.sleep(1000);
				allergypoint1.click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[normalize-space()='Log']")).click();
				Thread.sleep(1000);
				closelog.click();
				Thread.sleep(1000);
				allergypoint1.click();
				Thread.sleep(1000);
			    driver.findElement(By.xpath("//div[normalize-space()='Delete']")).click();
			    Thread.sleep(1000);
			    deletereason.click();
			    Thread.sleep(1000);
			    deletereason.sendKeys(deletere);
			    Thread.sleep(1000);
			    okdelete.click();
			    Thread.sleep(1000);
			    allergypoint2.click();
			    Thread.sleep(1000);
			    driver.findElement(By.xpath("//div[normalize-space()='Revoke']")).click();
			    Thread.sleep(1000);
//Other Allergy			
			    otherallergy.click();
			    Thread.sleep(1000);
			    serviceother.click();
			    Thread.sleep(1000);
			    serviceother.sendKeys(otheraller);
			    serviceother.sendKeys(Keys.ENTER);
			    Thread.sleep(1000);
			driver.findElement(By.xpath("//div[normalize-space()='Chicken']//div[@id='list0']")).click();
			Thread.sleep(1000);
			addother.click();
			Thread.sleep(1000);
//Edit other Allergy
			othereditpoint.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[normalize-space()='Edit']")).click();
			Thread.sleep(1000);
			editdescrip.click();
			Thread.sleep(1000);
			editdescrip.sendKeys(editdep);
			Thread.sleep(1000);
			editadd.click();
			Thread.sleep(1000);
//DeleteOtherallergy		
			othereditpoint.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[normalize-space()='Delete']")).click();
			Thread.sleep(1000);
			otherdelete.click();
			Thread.sleep(1000);
			
//Clinical Warning:
				clinical.click();
				Thread.sleep(1000);
			driver.findElement(By.xpath("//label[normalize-space()='Bleeding Disorders']//span[@class='checkmark']")).click();
			Thread.sleep(1000);
			onsetclinical.click();
			Thread.sleep(1000);
			okclinical.click();
			Thread.sleep(1000);
//Edit_Clinical Warning
			driver.findElement(By.xpath("//i[@class='ki ki-pencil']")).click();
			Thread.sleep(1000);
			editdescrip.click();
			Thread.sleep(1000);
			editdescrip.sendKeys(edp);
			Thread.sleep(1000);
			okclinical.click();
			Thread.sleep(1000);
//DeleteClinicalWarning
			driver.findElement(By.xpath("//label[normalize-space()='Bleeding Disorders']//span[@class='checkmark']")).click();
			Thread.sleep(1000);
			yesdelete.click();
			Thread.sleep(1000);
//Diagnosis&Plan
			diagnosis.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//label[@class='fav-icon']//img[@class='favorite ng-star-inserted']")).click();
			searchdignosis.click();
			Thread.sleep(1000);
			searchdignosis.sendKeys(sd);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@title='Bilious vomiting']")).click();
			Thread.sleep(1000);
//Edit Diagnosis&plan
			editdignosis.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[normalize-space()='Add Note']")).click();
			Thread.sleep(1000);
			onsetdig.click();
			Thread.sleep(1000);
			onsetdig.sendKeys("1");
			Thread.sleep(1000);
			okdig.click();
			Thread.sleep(1000);
//DeleteDiagnosis&plan
			editdignosis.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[normalize-space()='Delete']")).click();
			Thread.sleep(1000);
			yesdelete.click();
			Thread.sleep(1000);
//			 
			 
			 
			 
/////Services Adding
////////////CPOEService
				CPOEServices.click();
				Thread.sleep(1000);
				CPOESearch1.click();
				CPOESearch1.sendKeys(cpoe1);
				Thread.sleep(1000);
				//CPOESearch1.sendKeys(Keys.ENTER);
				driver.findElement(By.xpath("//div[@id='cpoeservicelist_6']//label[@class='item-name']")).click();
				Thread.sleep(1000);
				point1.click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[contains(text(),'Edit')]")).click();
				Thread.sleep(1000);
//ScheduleSetting
				schedule.click();
				Thread.sleep(1000);
				Weekly.click();
				Thread.sleep(1000);
				reoccur.click();
				reoccur.sendKeys("2");
				reoccur.sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				tuesday.click();
				Thread.sleep(1000);
				Friday.click();
				Thread.sleep(1000);
				occurcount.click();
				occurcount.sendKeys("4");
				occurcount.sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				scheduleadd.click();
				Thread.sleep(1000);
				update.click();
				Thread.sleep(1000);
			//	driver.findElement(By.xpath("//input[@id='cpoeSearchText']")).click();
				refresh.click();
				Thread.sleep(1000);
////Panel Service
				CPOESearch2.click();
				CPOESearch2.clear();
				CPOESearch2.sendKeys(cpoe2);
				CPOESearch2.sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//label[normalize-space()='Lipid Panel']")).click();
				Thread.sleep(1000);
////////Instructions
				refresh1.click();
				Thread.sleep(500);
				CPOESearch3.click();
				CPOESearch3.clear();
				CPOESearch3.sendKeys(cpoe3);
				CPOESearch3.sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//label[normalize-space()='Check Blood Pressure']")).click();
				Thread.sleep(1000);
//Service Editing 			
				editpoint.click();
				Thread.sleep(1000);
			    driver.findElement(By.xpath("//div[normalize-space()='Edit']")).click();
			    Thread.sleep(1000);
			    reasonforedit.click();
			    Thread.sleep(1000);
			    reasonforedit.sendKeys(red);
			    Thread.sleep(1000);
			    updateservice.click();
			    Thread.sleep(1000);
			    editpoint.click();
			    Thread.sleep(1000);
			    driver.findElement(By.xpath("//div[normalize-space()='Delete']")).click();
			    Thread.sleep(1000);
			    yesdelete.click();
			    Thread.sleep(1000);
	    
//DeleteAlltheAddedService
			    selectallservice.click();
			    Thread.sleep(1000);
			    deleteservice.click();
			    Thread.sleep(1000);
			    yesdelete.click();
			    Thread.sleep(1000);
////CPOE Pharmacy
			    CPOEPharmacy.click();
				Thread.sleep(1000);
//				
////1.ongoing- patient own medication	
//////////prescriptiontype
				driver.findElement(By.xpath("//span[@title='Prescription Type']//i[@class='ki ki-formulary']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[normalize-space()='Ongoing']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[normalize-space()='Patient own medication']")).click();
				CPOEPharmacysearch.sendKeys(cpoep);
				CPOEPharmacysearch.sendKeys(Keys.ENTER);
				Thread.sleep(3000);
		     	driver.findElement(By.xpath("//body/app-root/app-layout[contains(@class,'ng-star-inserted')]/main[contains(@class,'page-body')]/app-emr-homescreen[contains(@class,'ng-star-inserted')]/div[contains(@class,'page-container')]/div[contains(@class,'ng-star-inserted')]/div[contains(@class,'note-layout action-locked')]/div[contains(@class,'notelayoutcontainer')]/app-emrtemplateloader[contains(@class,'ng-star-inserted')]/div[contains(@class,'pat-note-entry')]/div[contains(@class,'pat-current-temp')]/div[contains(@class,'temp-container')]/div[@id='noterightregion']/div[@id='section_cpoe']/div[@id='component_cpoe']/app-cpoe-container/div[contains(@class,'card-container')]/div[contains(@class,'row')]/div[contains(@class,'col-md-7 mbl-pr5')]/div[contains(@class,'ng-star-inserted')]/div/div[contains(@class,'ng-star-inserted')]/div[contains(@class,'ng-star-inserted')]/app-cpoe-pharmacy-list/form[contains(@class,'ng-valid ng-touched ng-dirty')]/div[contains(@class,'card card-left list-container pharmacy-list')]/div[contains(@class,'card-body item-list-container')]/div[1]/div[1]/div[1]")).click();
		    	Thread.sleep(1000);
		  		ADDMedicine.click();
		    	Thread.sleep(1000);
//Edit_ongoing-patient own medication
		    	editpharmacy.click();
		    	Thread.sleep(1000);
			    driver.findElement(By.xpath("//div[normalize-space()='Edit']")).click();
			    Thread.sleep(1000);
			    remarkedit.click();
			    Thread.sleep(1000);
			    remarkedit.sendKeys(rem);
			    Thread.sleep(1000);
			    updatepharmacy.click();
			    Thread.sleep(1000);
//Delete-ongoing-patient own medication			    
			    editpharmacy.click();
		    	Thread.sleep(1000);
			    driver.findElement(By.xpath("//div[normalize-space()='Delete']")).click();
			    Thread.sleep(1000);
			    yesdeletepharmacy.click();
			    Thread.sleep(1000);
    
//2.Past-Outside Hospital.
			    driver.findElement(By.xpath("//span[contains(@title,'Prescription Type')]//i[contains(@class,'ki ki-formulary')]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[normalize-space()='Past']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[normalize-space()='Outside hospital']")).click();
				Thread.sleep(1000);
				CPOEPharmacysearch.click();
				CPOEPharmacysearch.clear();
				CPOEPharmacysearch.sendKeys(cpoep2);
				CPOEPharmacysearch.sendKeys(Keys.ENTER);
				Thread.sleep(3000);
				driver.findElement(By.xpath("//body/app-root/app-layout[@class='ng-star-inserted']/main[@class='page-body']/app-emr-homescreen[@class='ng-star-inserted']/div[@class='page-container']/div[@class='ng-star-inserted']/div[@class='note-layout action-locked']/div[@class='notelayoutcontainer']/app-emrtemplateloader[@class='ng-star-inserted']/div[@class='pat-note-entry']/div[@class='pat-current-temp']/div[@class='temp-container']/div[@id='noterightregion']/div[@id='section_cpoe']/div[@id='component_cpoe']/app-cpoe-container/div[@class='card-container']/div[@class='row']/div[@class='col-md-7 mbl-pr5']/div[@class='ng-star-inserted']/div/div[@class='ng-star-inserted']/div[@class='ng-star-inserted']/app-cpoe-pharmacy-list/form[@class='ng-valid ng-touched ng-dirty']/div[@class='card card-left list-container pharmacy-list']/div[@class='card-body item-list-container']/div[1]/div[1]/div[1]")).click();
				Thread.sleep(1000);
				frequency.click();
				driver.findElement(By.xpath("//li[normalize-space()='BID']")).click();
//				durationpast.click();
//				durationpast.clear();
//				durationpast.sendKeys("3");
				Thread.sleep(1000);
				
////////////////Date
//				driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/app-cpoe-pharmacy-prescription[1]/form[1]/div[2]/div[2]/div[5]/div[1]/div[1]/div[5]/ki-calender-time-military[1]/div[1]/input[1]")).click();
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/owl-date-time-container[1]/div[2]/owl-date-time-calendar[1]/div[2]/owl-date-time-month-view[1]/table[1]/tbody[1]/tr[4]/td[6]/span[1]")).click();
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//span[normalize-space()='Set']")).click();
//				Thread.sleep(1000);
				ADDMedicine.click();
				Thread.sleep(1000);
//Edit-past Outside hospital			    
				editpharmacy1.click();
		    	Thread.sleep(1000);
			    driver.findElement(By.xpath("//div[normalize-space()='Edit']")).click();
			    Thread.sleep(1000);
			    remarkedit.click();
			    Thread.sleep(1000);
			    remarkedit.sendKeys(rem1);
			    Thread.sleep(1000);
			    updatepharmacy.click();
			    Thread.sleep(1000);
//Delete-Past outside hospital			    
			    editpharmacy1.click();
		    	Thread.sleep(1000);
			    driver.findElement(By.xpath("//div[normalize-space()='Delete']")).click();
			    Thread.sleep(1000);
			    yesdeletepharmacy.click();
			    Thread.sleep(1000);
			    
//3.Additive Medicine	
		driver.findElement(By.xpath("//i[@class='ki ki-reset']")).click();
		CPOEPharmacysearch.click();
		CPOEPharmacysearch.clear();
		CPOEPharmacysearch.sendKeys(ad1);
		CPOEPharmacysearch.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[ text()=' Dextrose + 0.45% Normal Saline 500Ml - Claris, 500 Ml  by Intravenous ']")).click();
		Thread.sleep(1000);
		//mindose1.click();
		driver.findElement(By.xpath("//i[@class='ki ki-additive custom-additive']")).click();
		Thread.sleep(1000);
		medicinename.click();
		Thread.sleep(1000);
		medicinename.sendKeys(ad);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Deriphyllin Inj']")).click();
		Thread.sleep(500);
		Add.click();
		Thread.sleep(500);
		ok.click();
		Thread.sleep(500);
		frequency.click();
		driver.findElement(By.xpath("//li[normalize-space()='BID']")).click();
		Thread.sleep(1000);
		//rateadd.click();
	//	rateadd.sendKeys("5");
		Thread.sleep(500);
		 addrate.click();
		 addrate.sendKeys("500");
		 Thread.sleep(500);
		 idadd.click();
		 driver.findElement(By.xpath("//li[normalize-space()='ml/Hr']")).click();
		 Thread.sleep(500);
		ADDMedicine.click();
	//	yesadd.click();
		Thread.sleep(3000);			    
//Edit-Additivemedicine
		editpharmacy.click();
    	Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[normalize-space()='Edit']")).click();
	    Thread.sleep(1000);
	    remarkedit.click();
	    Thread.sleep(1000);
	    remarkedit.sendKeys(rm2);
	    Thread.sleep(1000);
	    updatepharmacy.click();
	    Thread.sleep(1000);
//Delete-AdditiveMedicine			    
	    editpharmacy.click();
    	Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[normalize-space()='Delete']")).click();
	    Thread.sleep(1000);
	    yesdeletepharmacy.click();
	    Thread.sleep(1000);

	    ///4. sliding scale
		driver.findElement(By.xpath("//i[@class='ki ki-reset']")).click();
		CPOEPharmacysearch.click();
		CPOEPharmacysearch.clear();
		CPOEPharmacysearch.sendKeys(side);
		CPOEPharmacysearch.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@title='Human Insulin']")).click();
		Thread.sleep(1000);
		mindose.click();
		mindose.sendKeys("2");
		Thread.sleep(1000);
		doseunit.click();
		Thread.sleep(500);
		doseunit.sendKeys("%");
		driver.findElement(By.xpath("//li[contains(text(),'%')]")).click();
		Thread.sleep(1000);
	    dosage.click();
	    Thread.sleep(1000);
	    doseok.click();
	    Thread.sleep(1000);
		routeid.click();
		driver.findElement(By.xpath("//li[normalize-space()='Intravenous']")).click();
		Thread.sleep(1000);
		form.click();
		driver.findElement(By.xpath("//li[normalize-space()='Injection']")).click();
		Thread.sleep(1000);
		frequency1.click();
		driver.findElement(By.xpath("//li[normalize-space()='Continuous Infusion']")).click();
		Thread.sleep(1000);
		durationinsulin.click();
		Thread.sleep(1000);
		unitid.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Day(s)']")).click();
		Thread.sleep(1000);
		ADDMedicine.click();
		Thread.sleep(3000);
//Edit-SlidingScale
		editpharmacy.click();
    	Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[normalize-space()='Edit']")).click();
	    Thread.sleep(1000);
	    remarkedit.click();
	    Thread.sleep(1000);
	    remarkedit.sendKeys(rm3);
	    Thread.sleep(1000);
	    updatepharmacy.click();
	    Thread.sleep(1000);
//Delete-SlidingScale			    
	    editpharmacy.click();
    	Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[normalize-space()='Delete']")).click();
	    Thread.sleep(1000);
	    yesdeletepharmacy.click();
	    Thread.sleep(1000);	    

//5.linked Medicine
		driver.findElement(By.xpath("//i[@class='ki ki-reset']")).click();
		Thread.sleep(1000);
		CPOEPharmacysearch.clear();
		CPOEPharmacysearch.click();
		CPOEPharmacysearch.sendKeys(p3);
		CPOEPharmacysearch.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		driver.findElement(By.xpath("//body/app-root/app-layout[@class='ng-star-inserted']/main[@class='page-body']/app-emr-homescreen[@class='ng-star-inserted']/div[@class='page-container']/div[@class='ng-star-inserted']/div[@class='note-layout action-locked']/div[@class='notelayoutcontainer']/app-emrtemplateloader[@class='ng-star-inserted']/div[@class='pat-note-entry']/div[@class='pat-current-temp']/div[@class='temp-container']/div[@id='noterightregion']/div[@id='section_cpoe']/div[@id='component_cpoe']/app-cpoe-container/div[@class='card-container']/div[@class='row']/div[@class='col-md-7 mbl-pr5']/div[@class='ng-star-inserted']/div/div[@class='ng-star-inserted']/div[@class='ng-star-inserted']/app-cpoe-pharmacy-list/form[@class='ng-valid ng-touched ng-dirty']/div[@class='card card-left list-container pharmacy-list']/div[@class='card-body item-list-container']/div[1]/div[1]/div[1]")).click();
		Thread.sleep(500);
		frequency2.click();
		driver.findElement(By.xpath("//li[normalize-space()='Days']")).click();
		Thread.sleep(500);
		days.click();
		days.sendKeys("3");
		Thread.sleep(1000);
		ADDMedicine.click();
		Thread.sleep(500);
//////// linkedMedicine-2		
		CPOEPharmacysearch.clear();
		CPOEPharmacysearch.click();
		CPOEPharmacysearch.sendKeys(p4);
		CPOEPharmacysearch.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[contains(text(),'by Oral')]")).click();
		Thread.sleep(1000);
		Frequecylink.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='BID']")).click();
		 Thread.sleep(1000);
		JavascriptExecutor js8 = (JavascriptExecutor) driver;
		 js8.executeScript("arguments[0].scrollIntoView();", remarks);
		 remarks.click();
		 remarks.sendKeys(rr);
		 remarks.sendKeys(Keys.ENTER);
		 Thread.sleep(1000);
		// reason.click();
		 Thread.sleep(1000);
		// driver.findElement(By.xpath("//li[normalize-space()='Culture']")).click();
		linkedmedicine.click();
        Thread.sleep(1000);
		ADDMedicine.click();
		Thread.sleep(1000);
		checkbox.click();
		Thread.sleep(500);
		ok1.click();
		Thread.sleep(500);
//Edit-Linked medicine	    
		editpharmacy.click();
    	Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[normalize-space()='Edit']")).click();
	    Thread.sleep(1000);
	    remarkedit.click();
	    Thread.sleep(1000);
	    remarkedit.sendKeys(re);
	    Thread.sleep(1000);
	    updatepharmacy.click();
	    Thread.sleep(1000);
	    ok1.click();
		Thread.sleep(500);
//Delete-Linkedmedicine	1    
	    editpharmacy.click();
    	Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[normalize-space()='Delete']")).click();
	    Thread.sleep(1000);
	    yesdeletepharmacy.click();
	    Thread.sleep(1000);
//Delete-Linkedmedicine2
	    editpharmacy.click();
    	Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[normalize-space()='Delete']")).click();
	    Thread.sleep(1000);
	    yesdeletepharmacy.click();
	    Thread.sleep(1000); 
//6.Tapering Medicine
	    CPOEPharmacysearch.clear();
		CPOEPharmacysearch.click();
		CPOEPharmacysearch.sendKeys(p5);
		CPOEPharmacysearch.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='Amoxicillin']")).click();
		Thread.sleep(1000);
		mindose1.click();
		mindose1.sendKeys("2");
		Thread.sleep(1000);
		dose.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Mg']")).click();
		Thread.sleep(1000);
		 routeid1.click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//li[normalize-space()='Ear']")).click();
		Thread.sleep(1000);
		form1.click();
		driver.findElement(By.xpath("//li[normalize-space()='Drops']")).click();
		frequency2.click();
		driver.findElement(By.xpath("//li[normalize-space()='BID']")).click();
		Thread.sleep(1000);
		duration.click();
		 duration.clear();
	     duration.sendKeys("3");
	     Thread.sleep(1000);
	     frequency2.click();
	     driver.findElement(By.xpath("//li[normalize-space()='Days']")).click();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		 js1.executeScript("arguments[0].scrollIntoView();", OrderingReason);
		 OrderingReason.click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//li[normalize-space()='Culture']")).click();
		 Thread.sleep(1000);
		 unitid.click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//li[normalize-space()='Day(s)']")).click();
		Thread.sleep(1000);
		 dayss.click();
		 dayss.sendKeys("3");
		 Thread.sleep(1000);
		 tapering1.click();
		 Thread.sleep(1000);
		 frequency2.click();
		  driver.findElement(By.xpath("//li[normalize-space()='TID']")).click();
		 Thread.sleep(1000);
		 tapering1.click();
		 Thread.sleep(1000);
		 ADDMedicine.click();
//Edit-Tapering Medicine
		    editpharmacy3.click();
	    	Thread.sleep(1000);
		    driver.findElement(By.xpath("//div[normalize-space()='Edit']")).click();
		    Thread.sleep(1000);
		    JavascriptExecutor js11 = (JavascriptExecutor) driver;
			 js11.executeScript("arguments[0].scrollIntoView();", taperingedit);
			 taperingedit.click();
		  	 Thread.sleep(1000);
		  	duration.click();
			 duration.clear();
		     duration.sendKeys("3");
		     Thread.sleep(1000);
		     JavascriptExecutor js2 = (JavascriptExecutor) driver;
			 js2.executeScript("arguments[0].scrollIntoView();", updatetapering);
			updatetapering.click();
		     Thread.sleep(1000);
		      updatepharmacy.click();
		    Thread.sleep(1000);
	    
//Delete-Tapering Medicine
		    editpharmacy3.click();
	    	Thread.sleep(1000);
		    driver.findElement(By.xpath("//div[normalize-space()='Delete']")).click();
		    Thread.sleep(1000);
		    yesdeletepharmacy.click();
		    Thread.sleep(1000);    
	    
	}
}
