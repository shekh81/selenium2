import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revoke_Chrome_Dr {

	public static void main(String[] args) {
		// Invoking Browser
		//Chrome - ChromeDriver->Methods close get
		//Firefox-FirefoxDriver->Methods close get
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saayem\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.walmart.com/");
		
		
		 

	}

}
