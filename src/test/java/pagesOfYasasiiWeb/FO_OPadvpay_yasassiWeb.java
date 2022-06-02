package pagesOfYasasiiWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class FO_OPadvpay_yasassiWeb extends PageFactoryInitYasasiiWeb{
	public FO_OPadvpay_yasassiWeb(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement SearchField;
	
	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement SearchIcon;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]")
	public WebElement patientSelect;
	
	
	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement providerName;
	
	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement EncounterAdd;
	
	
	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement EncounterSave;
	//button[@id='billingsave']
	
	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SAvesuccess;
	
	@FindBy(xpath = "//span[normalize-space()='Service']")
	public WebElement Service;
	
	@FindBy(xpath = "//span[contains(@class,'btn btn-link ng-star-inserted')]")
	public WebElement AddnewService;
	
	@FindBy(xpath = "//div[@class='panel-body card-block card-body']//div[1]//div[1]//ki-select-control[1]//div[1]//input[1]")
	public WebElement category;
	
	@FindBy(xpath = "//input[@id='serviceidBilling']")
	public WebElement servicename;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[2]/div[1]/div[1]/app-billing-details[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement Amount;
	
	@FindBy(xpath = "//label[@class='icon-btn btn-dark-green inline']")
	public WebElement Add;//label[@class='icon-btn btn-dark-green inline']
	
	@FindBy(xpath = "//span[contains(@class,'pay-style')]")
	public WebElement totalpay;
	
	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SaveOk;
	

	@FindBy(xpath = "//div[contains(@class,'page-inner-btn-group')]//button[1]")
	public WebElement Save;
	
	@FindBy(xpath = "//i[contains(@class,'ki ki-wallet icon-btn-billing btn-dark-green inline')]")
	public WebElement Wallet;
	
	@FindBy(xpath = "//span[@class='checkmark']")
	public WebElement AdvCheck;
	
	@FindBy(xpath = "//input[@id='withdrawalamount0']")
	public WebElement withdraw;
	
	@FindBy(xpath = "//button[@class='btn btn-dark-green active'][normalize-space()='OK']")
	public WebElement withdraw0k;
	
	
	@FindBy(xpath = "//button[normalize-space()='Clear']")
	public WebElement clear;
	
	
	public void opAdvpay(String MRNO , String PROVIDER ,String SERVICE1, String AMOUNT ,String SERVICE2 ) throws InterruptedException
	{
		//////Encounter
		SearchField.click();
		Thread.sleep(1000);
		SearchField.sendKeys(MRNO);
		Thread.sleep(2000);
		SearchIcon.click();
		Thread.sleep(2000);
		patientSelect.click();
		Thread.sleep(2000);
		WebElement inputBox = driver.findElement(By.xpath("//input[@id='EncBillingproviders']"));
		String textInsideInputBox = inputBox.getAttribute("value");

		// Check whether input field is blank
		if(textInsideInputBox.isEmpty())
		{
		   System.out.println("Input field is empty");
		   providerName.click();
			Thread.sleep(1000);
			providerName.sendKeys(PROVIDER);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[contains(text(),'" +PROVIDER + "')]")).click();
		}
		else {
			clear.click();
			Thread.sleep(1000);
			providerName.click();
			Thread.sleep(1000);
			providerName.sendKeys(PROVIDER);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[contains(text(),'" +PROVIDER + "')]")).click();
			
		}
		/* providerName.clear();
		 Thread.sleep(1000);
		 providerName.sendKeys(PROVIDER);
		 driver.findElement(By.xpath("//li[normalize-space()='Rohit Sharma']")).click();*/
		 Thread.sleep(1000);
		 EncounterAdd.click();
		 Thread.sleep(1000);
		 EncounterSave.click();
		 Thread.sleep(1000);
		 SAvesuccess.click();
		 
		 
		 /////advancePay
		 Thread.sleep(2000);
		 Service.click();	
		 Thread.sleep(1000);
		 AddnewService.click();
		 Thread.sleep(1000);
		 category.click();
		 driver.findElement(By.xpath("//li[normalize-space()='Advance']")).click();
		 servicename.click();
		 Thread.sleep(1000);
		 servicename.sendKeys(SERVICE1);
		 driver.findElement(By.xpath("//li[normalize-space()='"+SERVICE1+"']")).click();
		 Thread.sleep(1000);
		 Amount.clear();
		 Amount.sendKeys(AMOUNT);
		 Amount.sendKeys(Keys.ENTER);
		 Thread.sleep(1000);
		 Add.click();
		 Thread.sleep(1000);
		 JavascriptExecutor js= (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();",  totalpay);
		 Thread.sleep(1000);
		Save.click();
		Thread.sleep(1000);
		 SaveOk.click();
		 
		 //ServiceAdd
		 Thread.sleep(2000);
		 js.executeScript("arguments[0].scrollIntoView();",  Service);
		//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.HOME);
		 Thread.sleep(2000);
		 //Service.click();	
		// Thread.sleep(1000);
		// AddnewService.click();
		 Thread.sleep(2000);
		servicename.click();
		Thread.sleep(2000);
		servicename.sendKeys(SERVICE2);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//li[normalize-space()='"+SERVICE2+"']")).click();
		 Thread.sleep(1000);
		 Thread.sleep(1000);
		 Add.click();
		 Thread.sleep(1000);
		
		 
		// WalletPay
		 js.executeScript("arguments[0].scrollIntoView();", Wallet );
		 Thread.sleep(1000);
		 String Amount =  driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[2]/div[1]/div[1]/app-payment-details[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/label[1]")).getText();
		 Thread.sleep(1000);
		 Wallet.click();
		 Thread.sleep(1000);
		 AdvCheck.click();
		 withdraw.click();
		 Thread.sleep(1000);
		 withdraw.clear();
		 withdraw.sendKeys(Amount);
		 Thread.sleep(1000);
		 withdraw0k.click();
		 Save.click();
		 Thread.sleep(1000);
		 SaveOk.click();
		 
		 
		 
	 
		 
		
	}
	
	

}