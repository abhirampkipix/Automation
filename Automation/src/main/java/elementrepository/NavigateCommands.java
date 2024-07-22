package elementrepository;

public class NavigateCommands extends Base {
public void navigate() {
	driver.navigate().to("https://www.amazon.in/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
}
	public static void main(String[] args) {
		NavigateCommands obj=new NavigateCommands();
		obj.initialiseBrowser();
		obj.navigate();
		obj.driverQuitClose();
		
	}

}
