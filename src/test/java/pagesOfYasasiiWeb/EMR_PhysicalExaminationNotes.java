package pagesOfYasasiiWeb;

import java.io.IOException;
import java.util.List;

//import org.apache.commons.math3.ode.events.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class EMR_PhysicalExaminationNotes extends PageFactoryInitYasasiiWeb{
	
	public EMR_PhysicalExaminationNotes(WebDriver driver) {

		super(driver);

}
	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement Hamburger;
	@FindBy(xpath = "//i[@class='ki ki-sthethescope']")
	public WebElement EMR;
	@FindBy(xpath = "//a[@title='EMRHomeScreen']//span[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRHomeScreen;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]")
	public WebElement PatientSelection;
	@FindBy(xpath = "//div[@class='action-bar-lock']//div//i[@class='ki ki-chevron-up']")
	public WebElement UpArrow;
	@FindBy(xpath = "//i[@class='ki ki-lock-open']")
	public WebElement Lock;
	@FindBy(xpath = "//span[@class='icon doctornote']")
	public WebElement DoctorNote;
	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement ChiefComplaint;
	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement Template;
	@FindBy(xpath = "//li[normalize-space()='Fever']")
	public WebElement SelectTemplate;
	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement Ok;
	
	@FindBy(xpath = "//div[contains(text(),'Physical Examination')]")
	public WebElement ClickonPhysicalExamination;
	@FindBy(xpath = "//div[@id='canvaswrapper_drawing-tool-canvas-1']//div[@class='column left ng-star-inserted']//i[@class='ki ki-arrow-right']")
	public WebElement Drawline;
	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement Skeleton;
	@FindBy(xpath = "//div[@id='canvaswrapper_drawing-tool-canvas-3']//i[@class='fa fa-circle-o']")
	public WebElement Circle;
	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement Preview;
	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement Save;
	
	
	
	
	public void PhysicalExamination() throws InterruptedException, IOException {
///////////	Select the patient and create the doctor note
		
	    Thread.sleep(1000);
		Hamburger.click();
		EMR.click();
		EMRHomeScreen.click();
		PatientSelection.click();
		Thread.sleep(1000);
		UpArrow.click();
		Lock.click();
		DoctorNote.click();
	    Thread.sleep(1000);
	    
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));
		
		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}
		  Thread.sleep(800);
		ChiefComplaint.clear();
		Thread.sleep(800);
		ChiefComplaint.sendKeys("fever");
		driver.findElement(By.xpath("//strong[normalize-space()='Fever']")).click();
		Template.click();
	    Thread.sleep(800);
		Template.sendKeys("fe");
		SelectTemplate.click();
		Ok.click();
	    Thread.sleep(1000);
//////Enter the physical examinations
	    
		ClickonPhysicalExamination.click();
	    Thread.sleep(1000);
		Drawline.click();
		driver.findElement(By.xpath("//div[@id='canvaselement_drawing-tool-canvas-1']//canvas[contains(@class,'upper-canvas')]")).click();
		driver.findElement(By.xpath("//div[@id='canvaselement_drawing-tool-canvas-2']//canvas[contains(@class,'upper-canvas')]")).click();
	    Thread.sleep(1000);
		Actions builder=new Actions(driver);
		Thread.sleep(1000);
		Action drawAction=builder.moveToElement(driver.findElement(By.cssSelector("body.app-windows.ng-tns-0-5:nth-child(2) app-layout.ng-star-inserted:nth-child(4) main.page-body app-emr-homescreen.ng-star-inserted:nth-child(3) div.page-container:nth-child(3) div.ng-star-inserted:nth-child(1) div.note-layout.action-locked:nth-child(2) div.notelayoutcontainer:nth-child(1) app-emrtemplateloader.ng-star-inserted:nth-child(2) div.pat-note-entry:nth-child(1) div.pat-current-temp div.temp-container div.note-right-region div.loadersection.ng-star-inserted.active:nth-child(6) div.row div.col-md-12 div.card.dynamic-template-card:nth-child(1) div.card-body div.temploader div.ng-star-inserted form.mainheadform div.templatetable.justify.elementcontainertable.testtable div.element-container.d-flex.justify.removespace div.handlerdrawing div.head div.drawing-container div.drawarea-container.m-0 div.right-draw-row lib-drawing-tool.ng-star-inserted:nth-child(1) div.drawing-layout.ng-star-inserted.active:nth-child(1) div.column.left.ng-star-inserted:nth-child(1) div.bottom div.drawloader div.canvaselement.emrdrawing div.canvas-container > canvas.upper-canvas")))		             
				       .clickAndHold()
		               .moveByOffset(-50,60)
		               .moveByOffset(-60,70)	             
		               .moveByOffset(150,60)
	               	   .moveByOffset(-60,-70)
		               .doubleClick()
	            	   .build();
		Thread.sleep(1000);
		drawAction.perform();
	    Thread.sleep(5000);
	    Skeleton.click();
	    Thread.sleep(600);
	    Circle.click();
	    Thread.sleep(1000);
		Actions builders=new Actions(driver);
		Action drawActon=builders.moveToElement(driver.findElement(By.cssSelector("body.app-windows.ng-tns-0-5:nth-child(2) app-layout.ng-star-inserted:nth-child(4) main.page-body app-emr-homescreen.ng-star-inserted:nth-child(3) div.page-container:nth-child(3) div.ng-star-inserted:nth-child(1) div.note-layout:nth-child(2) div.notelayoutcontainer:nth-child(1) app-emrtemplateloader.ng-star-inserted:nth-child(2) div.pat-note-entry:nth-child(1) div.pat-current-temp div.temp-container div.note-right-region div.loadersection.ng-star-inserted.active:nth-child(6) div.row div.col-md-12 div.card.dynamic-template-card:nth-child(1) div.card-body div.temploader div.ng-star-inserted form.mainheadform div.templatetable.justify.elementcontainertable.testtable div.element-container.d-flex.justify.removespace div.handlerdrawing div.head div.drawing-container div.drawarea-container.m-0 div.right-draw-row lib-drawing-tool.ng-star-inserted:nth-child(3) div.drawing-layout.ng-star-inserted.active:nth-child(1) div.column.left.ng-star-inserted:nth-child(1) div.bottom div.drawloader div.canvaselement.emrdrawing div.canvas-container > canvas.upper-canvas")))
		               .clickAndHold()
		               .moveByOffset(-50,60)
		               .moveByOffset(-60,70)
		               .moveByOffset(150,60)
	               	   .moveByOffset(-60,-70)
		               .doubleClick()
	            	   .build();
		drawActon.perform();
	    Thread.sleep(6000);
	    Preview.click();
	    Thread.sleep(600);
	    Save.click();
	    
	    
	    
	}
}
