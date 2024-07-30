package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InputFill extends Base{
	public void input() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement message=driver.findElement(By.id("single-input-field"));
		message.sendKeys("Goodmorning");
		WebElement clickbutton=driver.findElement(By.id("button-one"));
		clickbutton.click();
		}
public void secodInput() {
WebElement inputA=driver.findElement(By.id("value-a"));
inputA.sendKeys("20");
WebElement inputB=driver.findElement(By.id("value-b"));
inputB.sendKeys("10");
WebElement gettotal=driver.findElement(By.id("button-two"));
gettotal.click();
System.out.println(gettotal.getText());


}
	public static void main(String[] args) {
		InputFill obj=new InputFill();
		obj.initialiseBrowser();
		obj.input();
		obj.secodInput();

	}

}
