package testClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pomClasses.MenClothList;

public class MyntraMenTest {

	Base base = new Base();
	WebDriver driver;
	MenClothList cloth;
	@BeforeMethod
	public void prerequisite()
	{
		driver=Base.driverInitialization();
		cloth=base.url();
	}
	
	@Test
	public void getMenClothList()
	{
		
		cloth.mensGarments();
		cloth.subModulList();
		cloth.footwearList();
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
