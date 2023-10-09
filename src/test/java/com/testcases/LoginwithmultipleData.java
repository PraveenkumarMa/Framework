package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Loginfunctionality;
import com.pageobjects.Loginwithdataprovider;
import com.utils.Datasource;

public class LoginwithmultipleData extends Basetest {
	Loginwithdataprovider If;
	private final String sheet = "login";
	public  LoginwithmultipleData() {
		super();
	}
	@DataProvider
	public String[][] dataload() throws Throwable{
		return Datasource.Customerdata(sheet);
		
	}
	@BeforeMethod
	public void setup() {
		initialization();
		If = new Loginwithdataprovider(driver);
		
	}
	@Test(dataProvider = "dataload",dataProviderClass = LoginwithmultipleData.class)
	public void loginvalidation(String Username,String Password) {
		If.verifylogin(Username, Password);
		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/EmpireHome/Dashboard");
	}
	
	

}