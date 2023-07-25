package test;

import org.testng.annotations.Test;

import base.Baseclass;
import pages.Drshethslogin;

public class Drshethstest extends Baseclass {
	@Test
	public void testing() throws InterruptedException
	{
		Drshethslogin l =new Drshethslogin(driver);
		l.account();
		/*l.button();
		l.setvalues();
		l.submit();*/
		l.input();
		Thread.sleep(3000);
		l.login();
		Thread.sleep(3000);
		l.search("sunscreen");
		Thread.sleep(3000);
		l.product();
		Thread.sleep(3000);
		l.addcart();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
