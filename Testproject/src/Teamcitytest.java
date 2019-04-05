
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Teamcitytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("This is my first");
//C:\Users\CLV Prasad\Downloads\CA\chrome
System.setProperty("webdriver.IternetExplorer.driver","C:\\Users\\CLV Prasad\\Downloads\\CA\\IEDriver\\IEDriverServer.exe");
WebDriver driver = new InternetExplorerDriver();
driver.get("http://google.co.za");
driver.get("http://google.co.za");
System.out.println(driver.getTitle());
	}

}
