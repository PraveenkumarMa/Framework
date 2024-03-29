package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.AddProductPage;
import com.pageobjects.Loginfunctionality;
import com.utils.AddDataPro;

public class AddProductTest extends Basetest{
	private final String sheetname="sheet1";
	Loginfunctionality lp;
	AddProductPage product;
	public AddProductTest() {
		super();
	}
    @DataProvider
    public  String[][] dataload() throws Exception {
    return AddDataPro.addPro(sheetname);
    }
    @BeforeMethod
    public void setup() {
    initialization();
  	lp = new Loginfunctionality();
  	lp.verifylogin();
    product = new AddProductPage();
  	
  	
    }
     
     @Test(dataProvider = "dataload", dataProviderClass = AddProductTest.class)
     public void addp(String modelnumber, String itemtitle, String ItemDescription, String height, String width, String breadth, String colorname, String actualprice, String quantity ) throws Exception {
     product.verifyaddproduct(modelnumber, itemtitle, ItemDescription, height, width, breadth, colorname, actualprice, quantity); 
  	   String urltest = driver.getCurrentUrl();
  	  Assert.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/Inventory/All");
     }
     
		// TODO Auto-generated method stub
		
	
	@AfterMethod
     public void teardown() {
  	 //driver.close();
  	  }


}
