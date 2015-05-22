import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import java.util.List;
import java.util.Iterator;

public class Products {

    WebDriver driver;
    
    public   Products(WebDriver driver)
    {
         this.driver=driver;
    }
    
    public void addcart()
    {
         driver.findElement(By.linkText("HP 15-g049AU Notebook (APU Quad Core A8/ 4GB/ 500GB/ Win8.1) (K5B45PA)")).click();
         driver.findElement(By.xpath("//[@input class = 'btn-buy-now btn-big current']")).click();
         driver.navigate().back();
         driver.findElement(By.linkText("HP Compaq 15-s008TU Notebook (4th Gen Ci3/ 4GB/ 500GB/ Free DOS) (J8C07PA)")).click();
         driver.findElement(By.xpath("//[@input class = 'btn-buy-now btn-big current']")).click();
         
         
    }
    
    public void checkcart()
    {
    	driver.findElement(By.xpath("//[@span id = 'item_count_in_cart_top_displayed']")).click();
    	//WebElement fd1 = driver.findElement(By.xpath("//[@span-class = 'title fk-font-14']/HP 15-g049AU Notebook (APU Quad Core A8/ 4GB/ 500GB/ Win8.1) (K5B45PA)"));
    	//WebElement fd2 = driver.findElement(By.xpath("//[@span-class = 'title fk-font-14']/HP Compaq 15-s008TU Notebook (4th Gen Ci3/ 4GB/ 500GB/ Free DOS) (J8C07PA)"));
    	List<WebElement> fdlist = driver.findElements(By.xpath("//[@span-class = 'title fk-font-14']"));
    	Iterator<WebElement> iter = fdlist.iterator();
    	String[] string = new String[2];
    	int cnt = 0;
    	while((iter.hasNext()) && (cnt<2))
    	{
    		string[cnt] = iter.next().getText();
    		cnt++;
    	}
    	if(string[0].equals(string[1]))
    	{
    		System.out.println("They are the same");
    	}
    	else
    	{
    		System.out.println("They are different");
    	}
    }
}
