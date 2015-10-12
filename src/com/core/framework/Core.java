package com.core.framework;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.core.utils.Logger;
import com.page.objects.Homepage;
import com.page.objects.PageObject;

public class Core{
	Logger log;
	PageObject pgObject;
	
	public Integer i;
	
	@BeforeSuite
	public void beforeSuiteSetup(){
		log = new Logger();
		log.debugPrint();
		
	}
	
	@BeforeTest
	public void preTestSetup(){
		System.out.println("preTest");
		i=0;
	}
	
}
