package com.test.runner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestNG testNG = new TestNG();
		testNG.setSuiteThreadPoolSize(3);
		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		
		XmlSuite suite = new XmlSuite();
		suite.setName("Test");
		suite.setParallel(XmlSuite.PARALLEL_NONE);
		XmlTest test = new XmlTest(suite);
		test.setName("demo");
		 
	}

}
