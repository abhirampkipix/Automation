package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base{
	public void id() {
		WebElement elementid=driver.findElement(By.id("single-input-field"));
		WebElement elementradio_show=driver.findElement(By.id("button-one"));
		WebElement elementradio_age=driver.findElement(By.id("button-two"));
//"button-two"
	}
	public void classelements() {
		WebElement elementclass_state=driver.findElement(By.className("select2-selection select2-selection--multiple"));
		WebElement elementclass_checkbox=driver.findElement(By.className("form-check-input"));
		WebElement elementclass_selectall=driver.findElement(By.className("btn btn-primary"));
	}
    public void name() {
    	WebElement elementname=driver.findElement(By.name("daterange"));//datepicker> bootstap>enter date
    	WebElement elementname_datepicker=driver.findElement(By.name("from"));//datepicker> jqyuery datepicker> daterange
    	
    }
    public void linkelement() {
    	WebElement elementlink=driver.findElement(By.linkText("https://selenium.qabible.in/check-box-demo.php"));
    	
    }
    public void partiallink() {
    	WebElement partiallink=driver.findElement(By.partialLinkText("radio-button"));
    }
    public void cssselector() {
    	//tag and id(tag#id)
    	WebElement tagid=driver.findElement(By.cssSelector("input#gridCheck"));
    	//tag and class(tag.class)
    	WebElement tagclass=driver.findElement(By.cssSelector("input.form-check-input"));
    	//tag and attribute (tagname[attribute type=value])
    	WebElement tagattribut=driver.findElement(By.cssSelector("input[class=form-check-input]"));
    	//tag.class value[attributetype=value]
    	WebElement tagattribute=driver.findElement(By.cssSelector("input.form-check-input[type=checkbox]"));
    }
    public void xpath() {
    	//full xpath absolute xpath
    	WebElement xpath=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/div/input"));
    	//relative xpath
    	//syntax : //tagname[@attribute='value']
    	WebElement relaxpath=driver.findElement(By.xpath("//input[@class='form-check-input']"));
    }
    public void dynamicXpath() {
    	//contains syntax= //tag[contains(@type,'partial value')]
    	WebElement dynamicxpath=driver.findElement(By.xpath("//button[contains(@id,'one')]"));
    	WebElement dynamicxpathx=driver.findElement(By.xpath("//button[contains(@id,'first')]")) ;//input form > input demo>get first button
    	
    	//text    syntax = //tagname[text()='textmessage']
    	WebElement dynamicxpath2=driver.findElement(By.xpath("//button[text()='Show Message']"));
    	WebElement dynamixxpathtext=driver.findElement(By.xpath("//button[text()='Get First Selected']"));//input form > input demo>get first button
    	
    	//Xpath axes methoud childsyntax=  //tagname[@type='value']//child::tagname[@type='value']
    	WebElement axesMethoud=driver.findElement(By.xpath("//button[@class='navbar-toggler']//child::span[@class='navbar-toggler-icon']"));
    	WebElement child=driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--multiple']//child::ul[@class='select2-selection__rendered']"));//inputform > jquery > states dropdown
    
    	//Xpath axes methoud parent syntax=  //tagname[@type='value']//parent::tagname
        WebElement parentxpath=driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));
        
      //following   syntax = //tagname[@type='value']//following::tagname[@type='value']
       WebElement following=driver.findElement(By.xpath("//button[@id='button-one']//following::message-one"));
       WebElement following2=driver.findElement(By.xpath("//button[@id='button-two']//following::message-two"));//input form >simple form >get button

        
        //index synatx =    (//tagname[@type='value'])[number of index]
        WebElement index=driver.findElement(By.xpath("(//form[@method='POST'])[1]"));
        WebElement index2=driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));//input form>simple form
        

        
        
    }
	public static void main(String[] args) {

	}

}
