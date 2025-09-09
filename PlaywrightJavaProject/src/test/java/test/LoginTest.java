package test;

import org.testng.SkipException;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test
	public void Logintest1() {

		LoginPage loginpage = new LoginPage(page);

		test.info("Navigating to Loginpage");
		page.navigate("https://acadware.net/aw-admin/#/login");

		test.info("Entering Username");
		loginpage.addUsername("renuka.avhad@talentserv.co.in");
		loginpage.submitButton();

		test.info("Entering Password");
		loginpage.addPassword("talent@123");
		loginpage.loginButton();

		test.info("Academy Selection page");
		loginpage.academySelector();

		test.info("All Tests are completed");

	}

	@Test
	public void Logintest2() {

		test.info("skipping this test");
		throw new SkipException("Skipping this test");

	}

	@Test
	public void Logintest3() {

		LoginPage loginpage = new LoginPage(page);

		test.info("Navigating to Loginpage");
		page.navigate("https://acadware.net/aw-admin/#/login");

		test.info("Entering Username");
		loginpage.addUsername("renuka.avhad@talentserv.co.in");
		loginpage.submitButton();

		test.info("Entering Password");
		loginpage.addPassword("talent@123");
		loginpage.loginButton();

		test.info("Academy Selection page");
		loginpage.academySelector();

		test.info("All Tests are completed");

	}

}
