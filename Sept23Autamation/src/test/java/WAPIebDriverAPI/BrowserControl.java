package WAPIebDriverAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserControl {

	public static void main(String[] args) {
		//set up the properties(optional)
		System.setProperty("WebDriver.chrome.driver", "..\\Sept23Autamation\\Drivers\\chromedriver.exe");
		//launch the browser
		WebDriver driver=new ChromeDriver();//logic to launch empty and light browser
		//maximize the browser
		driver.manage().window().maximize();
		
		//hit the url
		driver.get("https://www.irctc.co.in/nget/train-search");
		//navigate to another web page by preserving the history
		driver.navigate().to("https://www.amazon.in/");
		// go Backward in to the web page
		driver.navigate().back();
		String Currenturl = driver.getCurrentUrl();
		System.out.println("Currenturl:"+Currenturl);
		if(Currenturl.contains("irctc")) {
			System.out.println("User is on Irctc Webpage") ;
			} else {
				System.out.println("User is not on Irctc Webpage");
			}

}
}