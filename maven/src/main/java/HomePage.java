import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class HomePage {
	
	WebDriver driver;
    
	public   HomePage(WebDriver driver)
    {
         this.driver=driver;
    }
    
	public void openUrl()
    {
         driver.get("http://www.flipkart.com/");    
    }
    
	public void selectProduct()
    {
         driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/div/ul/li[1]/div/div[2]/div[1]/ul[2]/li[5]/a")).click();     
    }
}
