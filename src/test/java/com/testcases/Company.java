package com.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Companyfn;
import com.pageobjects.Loginfunctionality;

public class Company extends Basetest {

	Loginfunctionality lf;
	Companyfn cfunctionality;

	public Company() {
		super();
	}

	@BeforeTest
	public void setup() {

		initialization();

		lf = new Loginfunctionality();
		lf.verifylogin();

		cfunctionality = new Companyfn();

	}

	@Test
	public void editcompanyvalidation() throws Throwable {

		cfunctionality.verifyeditcompany();

		List<WebElement> rows = driver.findElements(By.xpath(".//td[normalize-space()='Sundar Pichai']"));

		if (rows.isEmpty()) {

			Assert.fail("No rows found");
		} else {

			String expectedTest = "Sundar Pichai";

		}
		for (WebElement row : rows) {
			String actualText = row.getText();
			System.out.println(actualText);

		}}}

