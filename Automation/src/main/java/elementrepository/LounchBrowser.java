package elementrepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LounchBrowser {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
//WebDriver driver=new EdgeDriver();
 //WebDriver driver=new FirefoxDriver();
driver.get("https://selenium.qabible.in/index.php");
	}

}