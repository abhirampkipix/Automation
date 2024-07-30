//i printing in multiple textinput fields
package elementrepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InputFillTwo extends Base {
	public void textField() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		List<WebElement> inputs=driver.findElements(By.xpath("//input[@class='form-control']"));
		//((WebElement) inputs).sendKeys("hi");
		for(WebElement text:inputs) {
		text.sendKeys("Hi");
			
		}
	
	}
	

	public static void main(String[] args) {
InputFillTwo obj=new InputFillTwo();
obj.initialiseBrowser();
obj.textField();
	}

}
