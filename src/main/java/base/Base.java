package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomClasses.MenClothList;

public class Base {
	static WebDriver driver;
	
	public static WebDriver driverInitialization()
	{
		WebDriverManager.chromedriver().setup();;
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		return driver;
		
	}
	public MenClothList  url()
	{
		driver.get("https://www.myntra.com/");
		return new MenClothList(driver);
	}

}
