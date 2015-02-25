package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login_PG_POF {
	final WebDriver driver;
	@FindBy(how = How.ID, using = "user_login")
	public WebElement login_username;
	@FindBy(how = How.ID, using = "user_pass")
	public WebElement login_userpass;
	@FindBy(how = How.ID, using = "wp-submit")
	public WebElement login_submitbtn;
	
	public Login_PG_POF(WebDriver driver){
		this.driver=driver;
	}
	
	public void Login_Action(String username, String password){
		login_username.click();
		login_username.clear();
		login_username.sendKeys(username);
		login_userpass.click();
		login_userpass.clear();
		login_userpass.sendKeys(password);
		login_submitbtn.click();
	}
	
}
