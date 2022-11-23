package testpackage;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericpackage.BaseTest;
import genericpackage.CustomListner;
import genericpackage.Flib;
import pagepackage.LoginPage;
@Listeners(CustomListner.class)
public class TestActiTimeValidLogin extends BaseTest{
	
	@Test
	public void testValidLogin() throws IOException, InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		lp.validLoginToActiTime(flib.readPropertyData(PROP_PATH,"username"),flib.readPropertyData(PROP_PATH,"password"));
		
	}

}
