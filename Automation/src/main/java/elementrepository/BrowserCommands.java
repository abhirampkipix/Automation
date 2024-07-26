package elementrepository;

public class BrowserCommands extends Base {
	public void browserCommands() {
		String title=driver.getTitle();
		System.out.println(title);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
	}

	public static void main(String[] args) {
		BrowserCommands obj=new BrowserCommands();
		obj.initialiseBrowser();
		obj.browserCommands();
	}

}
