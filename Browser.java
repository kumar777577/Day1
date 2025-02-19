package week1.day2;

public class Browser {
	public void launchBrowser() {
		System.out.println("Browser launched successfully");
		
		// TODO Auto-generated method stub

	}
	public void loadUrl () {
		System.out.println("Application URL loaded successfully");	
	}
	
	public static void main(String[] args) {
		Browser browser=new Browser(); 
		browser.launchBrowser(); 
		browser.loadUrl();
		
	}

}
