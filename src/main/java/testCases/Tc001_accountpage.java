package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.Registerpage;
import pageObjects.Registerpage;
import testBase.BaseClass;

public class Tc001_accountpage extends BaseClass

{
	@Test
 public void test()
 {
	logger.info("***** Starting test ******");
		//Thread.sleep(2000);
		HomePage hp=new HomePage(driver);
		hp.clickregister();
		logger.info("clicked on home register");
		//String act=hp.checktextmsg();
		//System.out.println(act);
		//logger.info("entering register details");
		Registerpage rp=new Registerpage(driver);
		rp.setusername(randomstring());
		rp.setlastname(randomnumeric());
		rp.setemail(randomstring()+"@gmail.com");
		String pwd=alphanumeric();
		rp.setpassword(pwd);
		rp.setconfirmpassword(pwd);
		rp.clickregister();
		logger.info("clicked on register page");
		logger.info("Test finished");
		
	
		
		//Assert.assertEquals(act,"Your registration completed");
		
	}

}
