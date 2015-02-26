package testscripts.bbPress;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.Homepage_PG_POF;
import pageObjects.LeftSideNavigation_PG_POF;
import pageObjects.Login_PG_POF;
import pageObjects.rtMedia.rtMedia_PG_POF;
import utility.Constants;

public class bbPressSettingsTest {
	static WebDriver wd;
	static Homepage_PG_POF HomePage;
	static Login_PG_POF LoginPage;
	static LeftSideNavigation_PG_POF LeftSideNavigation;
	static rtMedia_PG_POF rtMedia;

	@BeforeMethod
	public void setUp() throws Exception {
		Capabilities caps = new DesiredCapabilities();
		((DesiredCapabilities) caps).setJavascriptEnabled(true);
		((DesiredCapabilities) caps).setCapability("takesScreenshot", true);

		wd = new FirefoxDriver(caps);
		wd.manage().window().setSize(new Dimension(1920, 1080));

		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get(Constants.WP_SERVER);
		HomePage = PageFactory.initElements(wd, Homepage_PG_POF.class);
		LoginPage = PageFactory.initElements(wd, Login_PG_POF.class);
		LeftSideNavigation= PageFactory.initElements(wd, LeftSideNavigation_PG_POF.class);
		rtMedia=PageFactory.initElements(wd, rtMedia_PG_POF.class);
	}

	@Test
	public static void bbPressSettings() throws Exception {
		HomePage.LoginLinkClick_Action();
		LoginPage.Login_Action(Constants.USERNAME1, Constants.UPASSWORD1);
		HomePage.NavigateToDashboard_Action();
		LeftSideNavigation.NavigateTortMedia_Action();
		rtMedia.NavigateToWordpressTab_Action();

	}

	@AfterMethod
	public void afterMethod() {

//		wd.quit();

	}
}
