package com.app.junitDemo;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;


public class RepeatedTestDemo {

	@RepeatedTest(2)
	@DisplayName("Repeated test methods")
	public void repeatmessage() {
		
		System.out.println("learning");
	}
	
	@Test
	public void AssumptionDemo() {
		
		boolean isDBServerUp = true;
		
		Assumptions.assumeTrue(isDBServerUp,"DB not up");
		System.out.println("Create the table and insert the data");
		
	}

}
