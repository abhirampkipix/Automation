package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop extends Base{
	public void dragAction1() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement dragging=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		Actions action=new Actions(driver);
		action.moveToElement(dragging).click();
		action.doubleClick(dragging).perform();
		WebElement box=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		action.dragAndDrop(dragging, box).build().perform();
		
		
	}
	public void dragAction2() {
		WebElement drag2=driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
		Actions action=new Actions(driver);
		action.moveToElement(drag2).click();
		action.doubleClick(drag2).perform();
		WebElement box2=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		action.dragAndDrop(drag2, box2).build().perform();
		
	}
	public void dragAction3() {
		WebElement drag3=driver.findElement(By.xpath("//span[text()='Draggable n°3']"));
		Actions action=new Actions(driver);
		action.moveToElement(drag3).click();
		action.doubleClick(drag3).perform();
		WebElement box3=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		action.dragAndDrop(drag3, box3).build().perform();
		
	}
	public void dragAction4() {
	WebElement drag4=driver.findElement(By.xpath("//span[text()='Draggable n°4']"));
	Actions action=new Actions(driver);
	action.moveToElement(drag4).click();
	action.doubleClick(drag4).perform();
	WebElement box3=driver.findElement(By.xpath("//div[@id='mydropzone']"));
	action.dragAndDrop(drag4, box3).build().perform();
	
	
	}

	public static void main(String[] args) {
DragAndDrop obj=new DragAndDrop();
obj.initialiseBrowser();
obj.dragAction1();
obj.dragAction2();
obj.dragAction3();
obj.dragAction4();
	}

}
