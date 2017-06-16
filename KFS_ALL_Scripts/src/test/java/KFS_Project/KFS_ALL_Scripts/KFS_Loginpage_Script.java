package KFS_Project.KFS_ALL_Scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class KFS_Loginpage_Script {
 WebDriver driver;
	@Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver=new FirefoxDriver();
	  driver.get("http://www.embteltestdomain.com/");  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
