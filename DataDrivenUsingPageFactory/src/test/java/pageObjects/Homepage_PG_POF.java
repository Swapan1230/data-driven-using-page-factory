package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Homepage_PG_POF {
	final WebDriver driver;

	public Homepage_PG_POF(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(how=How.CSS, using="li#wp-admin-bar-bp-login > a.ab-item")
	public WebElement Homepage_loginlink;
	
	public void LoginLinkClick_Action(){
		Homepage_loginlink.click();
	}
}
