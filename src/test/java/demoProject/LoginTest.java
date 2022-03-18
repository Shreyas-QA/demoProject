package demoProject;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import demoProject_TestBase.TestBase;
import demoProject_pages.LoginPage;

public class LoginTest extends TestBase {

	LoginPage loginPage;

	public LoginTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		// initialization();
		loginPage = new LoginPage();
	}

	@Test(priority = 1)
	public void loginPageTitleTest() {
		System.out.println(loginPage);
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title,
				"Free CRM software for customer relationship management, sales, marketing campaigns and support.");
	}

	@Test(priority = 2)
	public void crmLogoImageTest() {
		boolean flag = loginPage.validateCRMImage();
		Assert.assertTrue(flag);
	}

}
