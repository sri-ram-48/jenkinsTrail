package pagesOfYasasiiWeb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.RefreshPage;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class FOEncounterYasasiiWeb extends PageFactoryInitYasasiiWeb{

	public FOEncounterYasasiiWeb(WebDriver driver) {
	
		super(driver);
	}

		
	@FindBy(xpath= "//input[@id='EncBillingproviders']")
	WebElement encproviderclick;
	
	@FindBy(xpath= "//li[contains(text(),'Kumar')]")
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
	 
	public FORegEditYasasiiWeb Foencounter(String myprovider) throws InterruptedException
	{
		
		Thread.sleep(5000);
		encproviderclick.click();
		Thread.sleep(5000);
		encproviderclick.sendKeys(myprovider);
		Thread.sleep(1000);
		encprovider.click();
		//encprovider.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		docadd.click();
		
///////////Registration type
		
		driver.findElement(By.xpath("//div[@class='items ng-star-inserted']")).click();
		driver.findElement(By.xpath("//input[@id='regiType']")).click();
		driver.findElement(By.xpath("//li[normalize-space()='Life Time Registration']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-dark-green active sm']")).click();

		
		
		
		encountersave.click();
		Thread.sleep(500);
		encountersaveok.click();
		Thread.sleep(4000);
		patInfo.click();
		Thread.sleep(1000);
		return new FORegEditYasasiiWeb(driver);
		
	}
	
	

}
