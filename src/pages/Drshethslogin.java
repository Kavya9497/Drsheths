package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Drshethslogin {
	WebDriver driver;
	By account =By.xpath("//a[@href='/account']");
	/*By createbutton =By.xpath("//button[@class='btn-button bordered']");
	By firstname =By.xpath("//input[@class='input-full']");
	By lastname =By.xpath("//input[@id='LastName']");
	By email =By.xpath("//input[@type='email']");
	By password =By.xpath("//input[@type='password']");
	By submit =By.xpath("//input[@type='submit']");*/
	By emailid=By.xpath("//input[@type='email']");
	By password1=By.xpath("//input[@type='password']");
	By loginbtn=By.xpath("//input[@value='Log in']");
	By searchbar=By.xpath("//input[@name='s']");
	By product=By.xpath("//*[@id=\"searchModal\"]/div/div/div[1]/div[1]/div[2]/div[3]/div[1]/div/div[1]/a/img");
	By addcart=By.xpath("//button[@name='add']");
	
	 
public Drshethslogin(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	}


public void account()
{
	driver.findElement(account).click();
}
/*public void button()
{
	driver.findElement(createbutton).click();
}
public void setvalues()
{
	driver.findElement(firstname).sendKeys("kavya");
	driver.findElement(lastname).sendKeys("rahul");
	driver.findElement(email).sendKeys("kmkavya19@gmail.com");
	driver.findElement(password).sendKeys("Kavya@7890");
}
public void submit()
{
	driver.findElement(submit).click();
}*/
public void input()
{
	driver.findElement(emailid).sendKeys("kmkavya19@gmail.com");
	driver.findElement(password1).sendKeys("Kavya@7890");
}
public void login()
{
	driver.findElement(loginbtn).click();
}
public void search(String item)
{
	driver.findElement(searchbar).sendKeys(item,Keys.ENTER);
}
public void product()
{
	driver.findElement(product).click();
}
public void addcart()
{
	driver.findElement(addcart).click();
}
}
