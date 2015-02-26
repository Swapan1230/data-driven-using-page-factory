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

	@FindBy(how = How.ID, using = "tab-rtmedia-display")
	public WebElement rtMedia_display;

	@FindBy(how = How.ID, using = "tab-rtmedia-wordpress")
	public WebElement rtMedia_wordpress;

	@FindBy(how = How.ID, using = "tab-rtmedia-bbpress")
	public WebElement rtMedia_bbpress;

	@FindBy(how = How.ID, using = "tab-rtmedia-bp")
	public WebElement rtMedia_buddypress;
	
	@FindBy(how = How.ID, using = "tab-rtmedia-global-albums")
	public WebElement rtMedia_defaultalabums;
	
	@FindBy(how = How.ID, using = "tab-rtmedia-types")
	public WebElement rtMedia_types;
	
	@FindBy(how = How.ID, using = "tab-rtmedia-sizes")
	public WebElement rtMedia_imagesizes;
	
	@FindBy(how = How.ID, using = "tab-rtmedia-privacy")
	public WebElement rtMedia_privacy;
	
	@FindBy(how = How.ID, using = "tab-rtmedia-custom-css-settings")
	public WebElement rtMedia_customcss;
	
	@FindBy(how = How.ID, using = "tab-rtmedia-reward-points")
	public WebElement rtMedia_rewardpoints;
	
	@FindBy(how = How.ID, using = "tab-rtmedia-moderation")
	public WebElement rtMedia_moderation;
	
	@FindBy(how = How.ID, using = "tab-rtmedia-general")
	public WebElement rtMedia_othersettings;
	


	public void NavigateToDisplayTab_Action() {
		rtMedia_display.click();
	}

	public void NavigateToWordpressTab_Action() {
		rtMedia_wordpress.click();
	}
	
	public void NavigateTobbressTab_Action() {
		rtMedia_bbpress.click();
	}
	
	public void NavigateTobuddyressTab_Action() {
		rtMedia_buddypress.click();
	}
	
	public void NavigateToDefaultAlbumsTab_Action() {
		rtMedia_defaultalabums.click();
	}
	
	public void NavigateToTypesTab_Action() {
		rtMedia_types.click();
	}
	
	public void NavigateToImageSizesTab_Action() {
		rtMedia_imagesizes.click();
	}
	
	public void NavigateToPrivacyTab_Action() {
		rtMedia_privacy.click();
	}
	
	public void NavigateToCustomCSSTab_Action() {
		rtMedia_customcss.click();
	}
	
	public void NavigateToRewardPointsTab_Action() {
		rtMedia_rewardpoints.click();
	}
	
	public void NavigateToModerationTab_Action() {
		rtMedia_moderation.click();
	}
	
	public void NavigateToOtherSettingsTab_Action() {
		rtMedia_othersettings.click();
	}
}
