package alert.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import alert.utils.BaseClass;

public class AlertsPageUsingPageFactory {

	
	
	
	
	@FindBy(xpath = "//span[text()='Alerts']")
	public WebElement al;
	
	@FindBy(id="timerAlertButton")
	public WebElement timerbutton;
	

	
	
	
	
	public AlertsPageUsingPageFactory() {
		PageFactory.initElements(BaseClass.driver, this);
}
}
