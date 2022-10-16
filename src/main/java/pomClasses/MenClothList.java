package pomClasses;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.Utility;

public class MenClothList extends Utility{

	WebDriver driver;
	@FindBy(xpath="(//a[text()='Men'])[1]")
	WebElement men;
	
	@FindBy(xpath="//a[@style='color:#ee5f73;']")
	List<WebElement> submodul;
	public MenClothList(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void mensGarments()
	{
		 visibilityOfElement(men,driver);
        Actions ac = new Actions(driver);
       
		ac.moveToElement(men).perform();
		
	}
	public List<String> subModulList()
	{
		List<String>list= new ArrayList<>();
		for(WebElement ele:submodul)
		{
			list.add(ele.getText());
		
		}
		return list;
	}
	
	public void footwearList()
	{
		List<String>list=new ArrayList<>();
		int []a= {94,96,98,100,102,104};
		for(int i=0;i<a.length-1;i++)
		{
			String name=driver.findElement(By.xpath("//a[@data-reactid='"+a[i]+"']")).getText();
			list.add(name);
			if(name.equals("Sneakers"))
			{
				driver.findElement(By.xpath("//a[text()='"+name+"']")).click();			}
			
		}
		System.out.println(list);
	}
}
