package com.app.junitDemo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BeforeAfterAllAnnotation {
	
	@BeforeAll // will be executed before all methods
	public void init() {
		
		System.out.println("start the database");
		System.out.println("initialize done...");
		
	}
	
	@AfterAll
	public void teardown() {
		
    System.out.println("stop db");
	}
	
	@Test
	public void Method1() {
		
		System.out.println("Executing method 1 of code class");
	}

	@Test
public void Method2() {
		
		System.out.println("Executing method 2 of code class");

}
}
