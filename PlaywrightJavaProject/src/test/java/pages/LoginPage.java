package pages;

import com.microsoft.playwright.Page;

public class LoginPage {
	
    private Page page;
	private String userNameTextbox="#mat-input-0";
	private String submitButton="//span[contains(text(),'Submit')]";
	private String passWordtextbox="#mat-input-1";
	private String loginButton="//span[contains(text(),'Login')]";
	private String academySelector="//div[@class='uk-width-medium-1-1']//h4[contains(text(),'Talentserv Badminton Academy')]";	
	
	
	public LoginPage(Page page) {
		
		this.page=page;
		
		
	}
	
	
	public void addUsername(String username) {
		
		page.fill(userNameTextbox, username);;
		
		
	}
	
   
	
    public void submitButton() {
    	
    	page.click(submitButton);
    	
    }
    
    
	
    public void addPassword(String password) {
    	
    	page.fill(passWordtextbox,password);
    	
    }
    
    public void loginButton() {
    	
    	page.click(loginButton);
    	
    }
    
    public void academySelector() {
    	
    	page.click(academySelector);
    }
    
    
}
