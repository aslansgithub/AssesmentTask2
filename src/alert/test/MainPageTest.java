package alert.test;


import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import alert.pages.AlertsPageUsingPageFactory;
import alert.pages.MainPageUsingPageFactory;
import alert.utils.BaseClass;

public class MainPageTest extends BaseClass {
	
public static void main(String[] args) throws InterruptedException {

//Task 2: 
//1.	Navigate to https://.demoqa.com/
//2.	Select “Alerts, Frame, & Windows” tile
//3.	Select the “Alerts” option from the side menu
//4.	Click on the “On button click, alert will appear after 5 seconds” button
//5.	Verify the alert pop up has appeared.
//6.	Close the alert.

	
	
	
	
	
	// 1. open the browser and Navigate to https://.demoqa.com/
	
	setUp();

	
	//Using Page Object Model with Page Factory
	MainPageUsingPageFactory  main = new MainPageUsingPageFactory ();
	AlertsPageUsingPageFactory alertFrame = new AlertsPageUsingPageFactory(); 
	
	//2.	Select “Alerts, Frame, & Windows” tile
	
	main.alerts.click();
	Thread.sleep(5);
   

	//3.Select the “Alerts” option from the side menu
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click()", alertFrame.al);
	
	
	
	//4.Click on the “On button click, alert will appear after 5 seconds” button
	
	alertFrame.timerbutton.click();
	WebDriverWait wait= new WebDriverWait(driver,6);
	wait.until(ExpectedConditions.alertIsPresent());
	
	
	
	//5.	Verify the alert pop up has appeared.
	
	Alert obj =driver.switchTo().alert();
	
    if(obj.getText().isEmpty()) { System.out.println("No alert pop up!");}
	else {System.out.println("Alert pop up has appeared and text is--->  " + obj.getText());}
	
	
	//6.Close the alert.
	obj.accept();
	Thread.sleep(3);
	tearDown();
	
	
	
	
	
	
}

}
