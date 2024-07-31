package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertOne extends Base {
	public void alert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement clickme =driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		clickme.click();
		driver.switchTo().alert().accept();
	}
	public void alertTwo() {
		WebElement clickButtons=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		clickButtons.click();
		driver.switchTo().alert().dismiss();
	}
	public void alertFill() {
		WebElement clickandInput=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		clickandInput.click();
		driver.switchTo().alert().sendKeys("confirm");
		driver.switchTo().alert().accept();
		
	}

	public static void main(String[] args) {
		AlertOne obj=new AlertOne();
	obj.initialiseBrowser();
	obj.alert();
	obj.alertTwo();
	obj.alertFill();
	
	}

}
