package com.app.junitDemo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BeforeAfterEachAnnotation {

	// BeforeEach & afterEach
	@BeforeEach
	public void init() { // Pre-condition method

		System.out.println("start db conn");

		System.out.println("initialzie done");
	}
	
	@AfterEach //execute tear down after each method
	public void TearDown() {
		
		System.out.println("close db  conn ...tear down");
	}
    
	@Test
	public void test1() {

		System.out.println("execution of test method 1");

	}

	@Test 
	public void test2() {

		System.out.println("execution of test method 2");

	}
}
