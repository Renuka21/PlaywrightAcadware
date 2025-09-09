package test;

import org.testng.annotations.Test;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import base.BaseTest;

public class LocatorsDemo extends BaseTest
{

	@Test
	
	public void testAllLocators() {
		
		page.navigate("https://acadware.net/aw-admin/#/login");
		
		page.locator("#mat-input-0").fill("renuka.avhad@talentserv.co.in");
		
		
		
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit")).click();

		
		page.locator("#mat-input-1").fill("talent@123");
		
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
		
		page.locator("//div[@class='uk-width-medium-1-1']//h4[contains(text(),'Talentserv Badminton Academy')]").click();
		
		page.pause();
		
		
		
		
		
		
		
	}
	
	
}
