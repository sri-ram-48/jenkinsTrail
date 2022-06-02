package pagesOfYasasiiWeb;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class EMRNurseNoteYasasiiWeb extends PageFactoryInitYasasiiWeb{
	
	public EMRNurseNoteYasasiiWeb(WebDriver driver) {

		super(driver);
	}
	
	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement MyLocation;
	@FindBy(xpath = "//li[contains(text(),'OP')]")
	public WebElement SelectOP;
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatientname;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]")
	public WebElement selectPatient;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/label[1]/i[1]")
	public WebElement Arrow;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/label[1]/i[1]")
	public WebElement LockArrow;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/app-emr-dashboard[1]/div[1]/label[2]/span[1]")
	public WebElement NurseNote;
	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement EnterChiefComplaint;	
	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement Template;
	@FindBy(xpath = "//li[contains(text(),'Nurse Note')]")
	public WebElement SelectTemplate;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[3]/div[1]/div[1]/div[1]/div[2]/button[1]")
	public WebElement Ok;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[1]/div[3]/ki-editor[1]/div[1]/div[4]")
	public WebElement EnterNote;
	@FindBy(xpath = "//div[contains(text(),'Vital Signs')]")
	public WebElement SelectVital;
	@FindBy(xpath = "//input[@id='vital000']")
	public WebElement EnterHeight;
	@FindBy(xpath = "//input[@id='vital010']")
	public WebElement EnterWeight;
	
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]")
	public WebElement SelectInsertion;
	@FindBy(xpath = "//input[@id='insertion']")
	public WebElement InsertionImplant;
	@FindBy(xpath = "//li[contains(text(),'CVLLUMEN')]")
	public WebElement Cvllumen;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/app-insertion[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ki-auto-complete-pagination[1]/div[1]/input[1]")
	public WebElement Entersite;
	@FindBy(xpath = "//li[contains(text(),'Femoral(L)')]")
	public WebElement Femoral;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/app-insertion[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[6]/div[1]/button[1]")
	public WebElement Add;	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[1]")
	public WebElement Triage;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[2]/div[2]/div[4]/div[2]/div[1]/div[1]/div[3]/label[1]/span[1]")
	public WebElement Walkin;
	@FindBy(xpath = "//input[@id='dynamic_selectHTF163']")
	public WebElement AccompaniedBy;
	@FindBy(xpath = "//li[contains(text(),'Relative')]")
	public WebElement Relative;	
	@FindBy(xpath = "//input[@id='dynamic_selectHTF194']")
	public WebElement TriagePriority;
	@FindBy(xpath = "//li[contains(text(),'Level 2')]")
	public WebElement Level2;
	@FindBy(xpath = "//div[contains(text(),'Nurse Care Plan')]")
	public WebElement NurseCarePlan;
	@FindBy(xpath = "//textarea[@id='dynamic_textarea_HTF3003']")
	public WebElement EnterAssessment;
	@FindBy(xpath = "//textarea[@id='dynamic_textarea_HTF3004']")
	public WebElement ProblemIdentified;
	@FindBy(xpath = "//div[@class='ta-r']//button[@type='button'][normalize-space()='Add']")
	public WebElement add;
	@FindBy(xpath = "//span[@class='icon emrsave']")
	public WebElement Save;
	
	
	@FindBy(xpath = "//button[contains(text(),'Edit Existing Note')]")
	public WebElement Edit;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[1]")
	public WebElement Triag;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[3]/div[2]/div[3]/div[4]/div[1]/div[1]/label[1]/span[1]")
	public WebElement NotAssessed;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[3]/div[2]/div[3]/div[4]/div[2]/div[1]/div[3]/label[4]/span[1]")
	public WebElement SelectEmoji;
	@FindBy(xpath = "//span[@class='icon emrsave']")
	public WebElement SAVE;
	
	
	
	
	
	
	
	
	public void NurseNoteAction(String firstname,String middlename,String lastname ,String age,String phoneno,String altphoneno,String homeadd1,String homeadd2,String docnumber,String MRNo) throws InterruptedException, IOException {
		
	    Thread.sleep(1000);
		MyLocation.click();
		Thread.sleep(800);
		SelectOP.click();
		Thread.sleep(1000);
		EnterPatientname.sendKeys(MRNo);
		Thread.sleep(800);
		selectPatient.click();
		Thread.sleep(1000);
		Arrow.click();
		LockArrow.click();
		NurseNote.click();
//////////////////Create a nurse note 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='chiefcomplainttext']")).clear();
		Thread.sleep(600);
		EnterChiefComplaint.sendKeys("Throat Infection");
		Template.click();
		SelectTemplate.click();
		Ok.click();
		Thread.sleep(600);
		//EnterNote.sendKeys("The patient is having severe throat infection");
		SelectVital.click();
		Thread.sleep(1000);
		EnterHeight.clear();
		EnterHeight.sendKeys("168");
		Thread.sleep(1000);
		EnterWeight.clear();
		EnterWeight.sendKeys("72");
		SelectInsertion.click();
		  Thread.sleep(1000);
		InsertionImplant.click();
		Thread.sleep(600);
		Cvllumen.click();
		Entersite.sendKeys("%");
		Thread.sleep(600);
		Femoral.click();
		Add.click();
		Triage.click();
		Walkin.click();
		AccompaniedBy.click();
		Relative.click();
		Thread.sleep(500);
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[11]/div[2]/div[3]/label[1]/span[1]"));

			js.executeScript("arguments[0].scrollIntoView(true);", element);
			}

		TriagePriority.click();
		Thread.sleep(600);
		Level2.click();
		Thread.sleep(600);
		  Thread.sleep(1000);
		  
///////////////Nurse care plan
		  
		NurseCarePlan.click();
		  Thread.sleep(1000);
		Thread.sleep(800);
		EnterAssessment.sendKeys("Patient eyes is slightly in red colour");
		Thread.sleep(600);
		ProblemIdentified.sendKeys("Dehydration");
		Thread.sleep(600);
		add.click();
		Thread.sleep(600);
		Save.click();
////////////////////Edit the nurse note 
		Thread.sleep(10000);
		NurseNote.click();
		Thread.sleep(900);
		Edit.click();
		Thread.sleep(800);
		Triag.click();
		NotAssessed.click();
		SelectEmoji.click();
		SAVE.click();
		Thread.sleep(5000);
}
}