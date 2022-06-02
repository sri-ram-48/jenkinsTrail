package pagesOfYasasiiWeb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class IVSampleCollectionYasasiiWeb extends PageFactoryInitYasasiiWeb {
	
	public IVSampleCollectionYasasiiWeb(WebDriver driver) {

		
		super(driver);
	}
	
	
	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]")
	public WebElement menutoggle;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/div[1]/div[1]/div[3]")
	public WebElement Investigation;
	
	@FindBy(xpath = "//input[@id='executionlocid']")
	public WebElement executionLocation;
	
	@FindBy(xpath = "//li[contains(text(),'7th Level Sample Collection Point')]")
	public WebElement Level7th;
	
	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[2]/form[1]/div[1]/button[2]")
	public WebElement OKbutton;
	
	@FindBy(xpath = "//input[@id='mrno']")
	public WebElement TypeText;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/inv-samplecollection[1]/div[1]/lib-searchlab[1]/form[1]/div[3]/div[2]/div[1]/span[1]/i[1]")
	public WebElement Searchbutton;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/inv-samplecollection[1]/div[1]/lib-searchlab[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")
	public WebElement patientselect;
	
	@FindBy(xpath = "//button[@id='onsaveid']")
	public WebElement samplecollectionsave;
	
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	public WebElement infoOK;
	
	@FindBy(xpath = "/html/body/app-root/ki-dialog/div[2]/div/div/div[2]/div/div[3]/button")
	public WebElement ClickOKTOSAVE;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/inv-samplecollection[1]/div[1]/lib-searchlab[1]/form[1]/div[1]/div[1]/div[1]/label[1]/i[1]")
	public WebElement threedot;
	
	 public void enterIVsamplecollection() throws InterruptedException{
			
			Thread.sleep(5000);
			menutoggle.click();
			Thread.sleep(5000);
			Investigation.click();
			Thread.sleep(3000);
			executionLocation.click();
			Thread.sleep(3000);
			Level7th.click();
			OKbutton.click();
			Thread.sleep(5000);
			TypeText.sendKeys("%%%");
			Searchbutton.click();
			
			
			
		}
		    
		    public IVSampleDespatch enterIVsamplecollectionDetails() throws InterruptedException{
		    	
		    	Thread.sleep(5000);
		    	patientselect.click();
		    	Thread.sleep(5000);
		    	String information = driver.findElement(By.xpath("//body/app-root[1]/ki-dialog[1]/div[2]/div[1]/div[1]/div[1]/h6[1]")).getText();
		    	if(information.equalsIgnoreCase("Information"))
		    			{
		    		infoOK.click();
		    		Thread.sleep(5000);
		    		samplecollectionsave.click();
		    		infoOK.click();
		    			}
		    	else {
		    		
		    		samplecollectionsave.click();
		    		infoOK.click();
		    	}
		    	Thread.sleep(5000);
		    	//threedot.click();
//		    	WebElement threedots=driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/inv-samplecollection[1]/div[1]/lib-searchlab[1]/form[1]/div[1]/div[1]/div[1]/label[1]"));
//		    	WebElement threedothselect=driver.findElement(By.xpath("//body/app-root[1]/app-layout[1]/main[1]/inv-samplecollection[1]/div[1]/lib-searchlab[1]/form[1]/div[1]/div[1]/div[1]/label[1]/i[1]"));
//				act.moveToElement(threedots).build().perform();
//				Thread.sleep(10000);
//				act.moveToElement(threedothselect).click().build().perform();
//				Thread.sleep(15000);
		    return new IVSampleDespatch(driver);
		}
}

