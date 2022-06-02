package pagesOfYasasiiWeb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class OutsiderPatientYasasiiWeb extends PageFactoryInitYasasiiWeb{

	public OutsiderPatientYasasiiWeb(WebDriver driver) {
	
		super(driver);
	}
	
	
	@FindBy(xpath= "//input[@id='maincategory']")
	WebElement maincategorySearch;
	
	@FindBy(xpath= "//li[contains(text(),'Outsider')]")
	WebElement maincategoryoutsider;
	
	@FindBy(xpath= "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[3]/div[3]/div[2]/span[1]/i[1]")
	WebElement outsiderpatienticon;
	
	@FindBy(xpath= "//input[@id='fo-card-reader-firstname']")
	WebElement firstname;
	
	@FindBy(xpath= "//input[@id='middlename']")
	WebElement middlename;
	
	@FindBy(xpath= "//div[@class='card-body']//div[2]//div[3]//ki-select-control[1]//div[1]//input[1]")
	WebElement gender;
	
	@FindBy(xpath = "//input[@id='age']")
	public WebElement age;

	@FindBy(xpath = "//div[@class='form-group ng-star-inserted']//input[@id='mobilephone']")
	public WebElement phoneno;
	
	@FindBy(xpath = "//button[normalize-space()='How did you know about the hospital?']")
	public WebElement howdiduknow;
	
	@FindBy(xpath = "//label[normalize-space()='Newspaper']")
	public WebElement checknewspaper;
	
	@FindBy(xpath = "//button[@class='btn btn-dark-green active pull-right']")
	public WebElement howdiduknowOk;
	
	@FindBy(xpath = "//button[@id='saveregistrationbutton']")
	public WebElement fosave;
	
	@FindBy(xpath = "//button[contains(text(),'Register')]")
	public WebElement register;
	
	@FindBy(xpath = "//input[@id='division']")
	public WebElement organisation;

	@FindBy(xpath = "//span[contains(text(),' Contact Information ')]")
	public WebElement contInformation;

	@FindBy(xpath = "//input[@id='homeaddress1']")
	public WebElement homeadd1;

	@FindBy(xpath = "//input[@id='homeaddress2']")
	public WebElement homeadd2;

	@FindBy(xpath = "//span[contains(text(),' Document Identification ')]")
	public WebElement docIdentification;
	
	@FindBy(xpath = "//input[@id='value']")
	public WebElement docnumber;
	
	@FindBy(xpath = "//body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[3]/div[1]/div[2]/div[1]/app-document-verification[1]/form[1]/div[1]/div[1]/div[4]/div[2]/button[1]/label[1]/i[1]")
	public WebElement docadd;
	
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	public WebElement successok;
	
  
    public Outsiderappointment Outsiderentry(String firstnme,String secondname,String Age,String phone) throws InterruptedException, IOException
	{
    	
 /////////Register an outsider patient by entering the mandatory fields
    	Thread.sleep(1000);
    	maincategorySearch.click();
    	maincategoryoutsider.click();
    	outsiderpatienticon.click();
    	firstname.sendKeys(firstnme);
    	middlename.sendKeys(secondname);
    	gender.click();
    	driver.findElement(By.xpath("//li[contains(text(),'Male')]")).click();
    	age.sendKeys(Age);
		age.sendKeys(Keys.ENTER);
		phoneno.sendKeys(phone);
		Thread.sleep(5000);
		howdiduknow.click();
		checknewspaper.click();
		Thread.sleep(1000);
		howdiduknowOk.click();
		Thread.sleep(5000);
		fosave.click();
		
		
		return new Outsiderappointment(driver);
	}
    
    public void OutsiderRegistration(String Homeaddress,String documnumber,String MRNo) throws InterruptedException, IOException
    
    {
    
		Thread.sleep(2000);
		register.click();
		organisation.sendKeys("Ki");
		driver.findElement(By.xpath("//li[contains(text(),'KIMS')]")).click();
		contInformation.click();
		Thread.sleep(2000);
		homeadd1.sendKeys(Homeaddress);
		homeadd2.sendKeys("Ullas Nagar");
		docIdentification.click();
		docnumber.sendKeys(documnumber);
		docadd.click();
		Thread.sleep(5000);
		fosave.click();
		Thread.sleep(3000);
		
		Thread.sleep(3000);
        String mrno= driver.findElement(By.xpath("/html/body/app-root/ki-dialog/div[2]/div/div/div[2]/div/div[2]")).getText();
    	System.out.println(mrno);
		
    	String word[]=mrno.split("[ :] ");
		System.out.println("number of words: "+word.length);
		for(int i=0;i<word.length;i++)
		{
			System.out.println("word["+i+"]="+word[i]);
		}
		System.out.println(word[1]);
		
		File src=new File("C:\\Users\\haritha\\eclipse-workspace\\HHCYasasiiWeb\\src\\test\\resources\\excelYasasiiWeb\\TestDataYasasiiWeb.xls");
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet OutsiderPatientRegistration=wb.getSheetAt(20);	
		int i=OutsiderPatientRegistration.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		OutsiderPatientRegistration.getRow(i).createCell(7).setCellValue(word[1]);	
    	FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);
		successok.click();
		
		
	}
    

}
