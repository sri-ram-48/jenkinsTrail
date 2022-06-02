package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class FO_queueDisplayYasassiweb extends PageFactoryInitYasasiiWeb {
	
	public FO_queueDisplayYasassiweb(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/app-header[1]/header[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]")
	public WebElement Menutoggle;
	
	@FindBy(xpath = "//span[normalize-space()='Queue Display']")
	public WebElement QueueMaster;
	
	@FindBy(xpath = "//input[@id='queuetypeid']")
	public WebElement QueueType;
	
	@FindBy(xpath = "//input[@id='queueid']")
	public WebElement QueueName;
	
	@FindBy(xpath = "//button[@class='btn btn-dark-green active']")
	public WebElement ok;
	
	@FindBy(xpath = "//input[@id='loginemail']")
	public WebElement userid;
	
	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement password;
	
	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement site;
	
	@FindBy(xpath = "//button[@id='login_spinner']")
	public WebElement login;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]")
	public WebElement patientSelect;
	
	@FindBy(xpath = "//i[@class='ki ki-token-call']")
	public WebElement callcurrentToken;
	
	//html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]
	public void tokenview() throws AWTException, InterruptedException {
	
		
		///QueueMaster setup
		
		Menutoggle.click();
		QueueMaster.click();
		QueueType.click();
		driver.findElement(By.xpath("//li[normalize-space()='Encounter Queue']")).click();
		QueueName.click();
		driver.findElement(By.xpath("//li[normalize-space()='4th level OP']")).click();
		ok.click();
		Thread.sleep(1000);
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(5000);
		driver.get("http://192.168.0.240:75/login");
		Thread.sleep(5000);
		 
		userid.click();
		userid.sendKeys("doc01");
		password.click();
		password.sendKeys("KAmeda123$");
		site.click();
		
		driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
		login.click();
		Thread.sleep(3000);
		patientSelect.click();
		Thread.sleep(3000);
		callcurrentToken.click();
		Thread.sleep(5000);
			
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(8000);
		
		
	}

}