package elementrepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class FindElements extends Base{
	public void allElemnts() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		List<WebElement> elements=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement webElement: elements) {
			webElement.click();
			
		}
	}

	public static void main(String[] args) {
   FindElements obj=new FindElements();
   obj.initialiseBrowser();
   obj.allElemnts();
	}

}
