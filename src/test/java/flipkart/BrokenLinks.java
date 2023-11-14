package flipkart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {
	
	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		List<WebElement> hed = driver.findElements(By.tagName("a"));

		for (WebElement show : hed) {

			System.out.println(show.getText());

			System.out.println(show.getAttribute("href"));
	}
	

}}
