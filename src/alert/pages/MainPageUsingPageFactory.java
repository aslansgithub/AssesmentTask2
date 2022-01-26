package alert.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import alert.utils.BaseClass;

public class MainPageUsingPageFactory {
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[3]")
	public WebElement alerts;

	public MainPageUsingPageFactory() {
		PageFactory.initElements(BaseClass.driver, this);
	
	
	
}
}
