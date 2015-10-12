package com.page.objects;

import org.testng.annotations.Test;

import com.core.framework.Core;

public class Homepage extends PageObject{
	
	
	
	@Test
	public void doSearch(){
		System.out.println("SearchOperation");
		i++;
		System.out.println(i);	
	}
	
	@Test
	public void doSalesEvent(){
		System.out.println("SalesEvent");
		i++;
		System.out.println(i);
	}
	
}
