package elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver; // to call the driver publically
	public void initialiseBrowser() {
		driver =new ChromeDriver();
		driver.get("https://selenium.qabible.in/index.php");
		driver.manage().window().maximize(); //To maximize the window
		
	}
public void driverQuitClose() { // Create a method to Close and quit
	driver.quit();             //To Quit the Chrome
	//driver.close();         //To close the Chrome tab
}
	public static void main(String[] args) {
Base obj=new Base();
obj.initialiseBrowser();
obj.driverQuitClose();
	}

}
