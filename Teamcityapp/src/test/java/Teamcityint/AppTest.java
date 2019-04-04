package Teamcityint;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebDriver;
import org.junit.Test;

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
	System.out.println("This is chrome test");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\CLV Prasad\\Downloads\\CA\\chrome\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://google.co.za");
	System.out.println(driver.getTitle());
}


}
