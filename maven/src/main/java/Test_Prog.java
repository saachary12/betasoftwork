import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Test_Prog {
	
	@Test
    public void testing()
    {
       FirefoxDriver driver=new FirefoxDriver();
      
       HomePage  hp=new HomePage(driver);
       hp.openUrl();
       hp.selectProduct();

       Products prod=new Products(driver);
       prod.addcart();
       prod.checkcart();
    }
}
