package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Homepage_PG_POF {
	final WebDriver driver;

	public Homepage_PG_POF(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(how=How.CSS, using="li#wp-admin-bar-bp-login > a.ab-item")
	public WebElement Homepage_loginlink;
	
	@FindBy(how=How.CSS, using="#wp-admin-bar-site-name > a.ab-item")
	public WebElement Homepage_sitelink;
	
	@FindBy(how=How.CSS, using="li#wp-admin-bar-dashboard > a.ab-item")
	public WebElement Homepage_dashboardlink;
	
	public void LoginLinkClick_Action(){
		Homepage_loginlink.click();
	}
	
	public void NavigateToDashboard_Action(){
		new Actions(driver).moveToElement(Homepage_sitelink).build().perform();
		Homepage_dashboardlink.click();	
			
	}
}
