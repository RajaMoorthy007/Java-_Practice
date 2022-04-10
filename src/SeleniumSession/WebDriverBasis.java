package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasis {

	public static void main(String[] args) {

		//1.FF Browser
		//Geckodriver----Class
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Rajamuthu.S\\eclipse-workspace\\Java Practice\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	}

}
