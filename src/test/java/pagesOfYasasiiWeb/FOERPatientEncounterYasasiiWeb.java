package pagesOfYasasiiWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class FOERPatientEncounterYasasiiWeb extends PageFactoryInitYasasiiWeb{

	public FOERPatientEncounterYasasiiWeb(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(xpath= "//input[@id='EncBillingproviders']")
	WebElement encproviderclick;
	
	@FindBy(xpath= "//li[contains(text(),'Thomas')]")
	WebElement encprovider;
			
    @FindBy(xpath= "//button[contains(text(),'Save')]")
	WebElement encsave;
	
	@FindBy(xpath="//div[contains(text(),'Patient Info')]")
	WebElement patInfo;
	
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[1]/div[1]/app-billing-details[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[3]/label[1]")
	public WebElement docadd;
	
	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement encountersave; 
	
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	public WebElement encountersaveok; 
	
  
    public ER2OPRegistration FoERencounter(String myerprovider) throws InterruptedException
	{
    	
    	Thread.sleep(3000);
		encproviderclick.click();
		Thread.sleep(1000);
		encproviderclick.sendKeys(myerprovider);
		Thread.sleep(500);
		encprovider.click();
		//encprovider.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		docadd.click();
		encountersave.click();
		Thread.sleep(500);
		encountersaveok.click();
		 
		return new ER2OPRegistration(driver);
		
	}
    
    
    
    
    
    
    
}
