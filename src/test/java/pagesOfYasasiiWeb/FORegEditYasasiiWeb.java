
package pagesOfYasasiiWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

import pagesOfYasasiiWeb.FORegistrationYasasiiWeb;

public class FORegEditYasasiiWeb extends PageFactoryInitYasasiiWeb {

	public FORegEditYasasiiWeb(WebDriver driver) {
		super(driver);
	} 
	
	
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-patient-information[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[2]/i[1]")
	public WebElement foediticon;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[6]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement altphoneno;
	
	
	  @FindBy(xpath="//span[contains(text(),'Related MRNo(s)')]")
	  public WebElement foRelatedMrnotab;
	  
	  @FindBy(xpath="//input[@id='relatedmrno']") 
	  public WebElement relatedmrno;
	  
	  @FindBy(xpath="//input[@id='relation']") 
	  public WebElement relation;
	  
	  @FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[5]/div[1]/div[2]/div[1]/app-related-mrno[1]/form[1]/div[1]/div[1]/div[3]/div[2]/button[1]") 
	  public WebElement add;
	  
	  @FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[5]/div[1]/div[2]/div[1]/app-related-mrno[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/label[1]/i[1]") 
	  public WebElement emcontact;
	
	  @FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[5]/div[1]/div[2]/div[1]/app-related-mrno[1]/form[1]/ki-dialog-confirm[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/button[1]")
	  public WebElement emcontactConfirmation;
	  
	  @FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[6]/div[1]/div[1]/div[1]/div[1]")
	  public WebElement emergencycontact;
	
	  @FindBy(xpath = "//button[contains(text(),'Update')]")
	  public WebElement foupdate;
	  
	  @FindBy(xpath = "//button[contains(text(),'OK')]")
	  public WebElement foupdateok;
	
public void FOEditYasasiiWeb(String myaltphoneno) throws InterruptedException {
	/////////////From patient info screen click on edit icon	
		foediticon.click();
		Thread.sleep(2000);
		altphoneno.sendKeys(myaltphoneno);
		Thread.sleep(1000);
		foRelatedMrnotab.click();
	    relatedmrno.sendKeys("G00000006821"); 
	    relatedmrno.sendKeys(Keys.ENTER);
	    Thread.sleep(2000);
		relation.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[contains(text(),'Others')]")).click(); 
		add.click();
		Thread.sleep(1000);
		emcontact.click();
		Thread.sleep(1000);
		emcontactConfirmation.click();
		Thread.sleep(2000);
		emergencycontact.click();
		Thread.sleep(3000);
		foupdate.click();
		Thread.sleep(3000);
		foupdateok.click();
		
	}
}
