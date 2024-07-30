package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckboxForm extends Base {
	public void checkBox() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkbox=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/div/input"));
	    checkbox.click();
	}
	public void radiobutton() {
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radiobutton=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/div[2]/input"));
		radiobutton.click();
		WebElement shows=driver.findElement(By.xpath("//*[@id=\"button-one\"]"));
		shows.click();
		System.out.println(radiobutton.isSelected());
		
	}

	public static void main(String[] args) {
		CheckboxForm obj=new CheckboxForm();
		obj.initialiseBrowser();
		obj.checkBox();
		obj.radiobutton();

	}

}
