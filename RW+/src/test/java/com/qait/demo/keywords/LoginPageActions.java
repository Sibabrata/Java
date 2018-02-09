package com.qait.demo.keywords;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.io.IOException;
import java.sql.ResultSet;

import org.json.JSONException;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.Assert;
import org.openqa.selenium.support.ui.Select;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gargoylesoftware.htmlunit.javascript.host.Element;
import com.gargoylesoftware.htmlunit.javascript.host.Window;
import com.google.gson.JsonObject;
import com.qait.automation.domain.PostParameters;
import com.qait.automation.getpageobjects.GetPage;
import com.qait.automation.utils.DataBaseConnecter;
import com.qait.automation.utils.RestAPITester;
import com.qait.automation.utils.YamlReader;
import com.thoughtworks.selenium.webdriven.Windows;

public class LoginPageActions extends GetPage {

	WebDriver driver;
	RestAPITester service = new RestAPITester();

	public LoginPageActions(WebDriver driver) {
		super(driver, "Loginpage");
		this.driver = driver;
	}

	public void clickOnLogin() {
		element("inp_emailid").sendKeys(YamlReader.getYamlValue("loginUser"));
		element("nxt_btn").click();
		wait.hardWait(3);
		// String winHandleBefore = driver.getWindowHandle();
		element("inp_pswrd").sendKeys(YamlReader.getYamlValue("loginPassword"));
		element("nxt_btn").click();
		wait.hardWait(3);
		element("icon").click();
		//String a = element("text").getText();
		//System.out.println(a);
		
		/*-------------------Page Title---------/*
		/*String actualTitle = driver.getTitle();
		String expectedTitle = "Gmail";
		Assert.assertEquals(expectedTitle,actualTitle);*/
		
		//string un : element("").getText();
		Assert.assertEquals(element("text").getText(), YamlReader.getYamlValue("loginUser"));
		wait.hardWait(3);
		element("compose").click();
        isElementDisplayed("to");
        element("to").sendKeys("roysibabrata1@gmail.com");
        //sendKeys("roysibabrata1@gmail.com");
        element("send").click();
		
	}
	
	public void WindowHandle(){
		String handle= driver.getWindowHandle();
		System.out.println(handle);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 250);");
		element("button").click();
		Set handles= driver.getWindowHandles();
		System.out.println(handles);
		for (String handle1:driver.getWindowHandles()){
			System.out.println(handle1);
			driver.switchTo().window(handle1);	
		}
	}//end of window method

	public void BrowserWindowHandle(){
	//String handle = driver.getWindowHandle();
		element("browserwindow").click();
		//driver.switchTo().window("QA Automation Tools Tutorial");
		driver.manage().window().maximize();
		isElementDisplayed("dynamicSpan");
		element("dynamicSpan").click();
	
	}
	
	public void Practice(){
		driver.manage().window().maximize();
		element("firstname").sendKeys("Siba");
		element("lastname").sendKeys("Roy");
		element("gender","1").click();
		element("expyears","1").click();
		element("alltext","Date").sendKeys("11.09.2017");
		element("profession").click();
		element("choosefile").sendKeys("C:/Users/choudharysibabrata/Desktop/error.jpg");
		element("selenium").click();	
//Select from drop-down:
		/*WebElement element = driver.findElement(By.name("continents"));
		Select a= new Select(element);
		a.selectByIndex(2);*/
	}
	
	
	public void Alert(){
		
	selectProvidedTextFromDropDown(element ("Continents"),"Africa");
	selectProvidedTextFromDropDown(element("selcommands"),"WebElement Commands");
	element("btn").click();
	driver.switchTo().alert().dismiss();
	//handleAlert();
	element("dyn_color").click();

//Actions Class:-	
Actions action = new Actions(driver);
WebElement Start = driver.findElement(By.name("continents"));
WebElement End = driver.findElement(By.name("Africa"));
action.dragAndDrop(Start, End).perform();


	
//List <WebElement> list = driver.findElements(By.name(""));
	
	//Assert.assertEquals("Google",driver.getTitle() );
		}//end of method
	
	
	
 public void Phptravels(){
 driver.manage().window().maximize();
 wait.waitForElementToBeClickable(element ("Home_lnk") );
 wait.waitForElementToBeClickable(element("Hotels_lnk")); 
 
 
 
 
 }	
	
	
		
		
	
	
	
	
	
}//end of class
