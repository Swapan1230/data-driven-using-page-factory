package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LeftSideNavigation_PG_POF {

	final WebDriver driver;

	public LeftSideNavigation_PG_POF(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how=How.CSS, using="li#toplevel_page_rtmedia-settings > "
			+ "a.wp-has-submenu.wp-not-current-submenu.menu-top.toplevel_page_rtmedia-settings.menu-top-last >"
			+ " div.wp-menu-name")
	public WebElement LeftSideNavigation_rtMediaTab;
	
	public void NavigateTortMedia_Action(){
		LeftSideNavigation_rtMediaTab.click();
	}
	
}
