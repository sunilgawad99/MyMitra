package util;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {
	
	public static void visibilityOfElement(WebElement element,WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public static void visibilityOfElement(List<WebElement> element,WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfAllElements(element));
	}

	public static void visibilityOfElement(By by,WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	public static void javaExecutorClick(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].Click();",element );
	}
	public static void javaExecutorScrollByXY(int x,int y,WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(x,y)");
	}
	
	public static void javaExecutorScrollByElementView(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true);",element);
	}
	public static void javaExecutorSendkeys(WebDriver driver,String values)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementByID('element id ').value = 'values';");
	}
	
	public static void movetoElement(WebElement element,WebDriver driver)
	{
		Actions ac = new Actions(driver);
		
		ac.moveToElement(element).perform();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
