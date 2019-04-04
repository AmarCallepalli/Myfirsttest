package Teamcityint;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teamcitytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("This is my first");
//C:\Users\CLV Prasad\Downloads\CA\chrome
System.setProperty("webdriver.chrome.driver","C:\\Users\\CLV Prasad\\Downloads\\CA\\chrome\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://google.co.za");
driver.get("http://yahoo.co.in");
System.out.println(driver.getTitle());
	}

}
