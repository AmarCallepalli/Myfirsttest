package Teamcityint;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.WebDriver;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

@Test
public void chrometest()
{
	System.out.println("This is my first");
	//C:\Users\CLV Prasad\Downloads\CA\chrome
	System.setProperty("webdriver.ie.driver","C:\\Users\\CLV Prasad\\Downloads\\CA\\IEDriver\\IEDriverServer.exe");
	WebDriver driver = new InternetExplorerDriver();
	driver.get("http://google.co.za");
	driver.get("http://google.co.in");
	System.out.println(driver.getTitle());
	
}


}
