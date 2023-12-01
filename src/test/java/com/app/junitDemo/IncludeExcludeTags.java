package com.app.junitDemo;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;

@IncludeTags({"Development"})
@ExcludeTags({"Prod"})
public class IncludeExcludeTags {
	
	@Test
	@Tag("Development")
	public void devtest1() {
		
		System.out.println("test case development1");
	}
	
	@Test
	@Tag("Development")
	public void devtest2() {
		
		System.out.println("test case development2");
		
	}
	
	@Test
	@Tag("Prod")
	public void proTest1() {
		
		System.out.println("test case  for production 1");
	}
	
	@Test
	@Tag("QA")
	public void qatest1() {
		
		System.out.println("test case for QA 1");
	}
	
	@Test
	@Tag("QA")
public void qatest2() {
		
		System.out.println("test case for QA 2");
	}
	

}
