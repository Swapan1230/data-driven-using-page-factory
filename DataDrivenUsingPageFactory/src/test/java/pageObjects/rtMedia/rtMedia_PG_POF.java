package pageObjects.rtMedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class rtMedia_PG_POF {
	final WebDriver driver;

	public rtMedia_PG_POF(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(how=How.ID, using="tab-rtmedia-display")
	public WebElement rtMedia_display;
	
	@FindBy(how=How.ID, using="tab-rtmedia-wordpress")
	public WebElement rtMedia_wordpress;
	
	public void NavigateToDisplayTab_Action(){
		rtMedia_display.click();
	}
	public void NavigateToWordpressTab_Action(){
		rtMedia_wordpress.click();
	}
}
