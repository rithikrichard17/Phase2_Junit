package com.app.junitDemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class ExtensionsDemoConditions {
	
	@Test
	@EnabledOnOs(OS.WINDOWS)
	public void conditionOSWindows() {
		System.out.println("Execute test cases on Windows");
	}
	
	@Test
	@EnabledOnOs(OS.MAC)
	public void conditionOSMac() {
		System.out.println("Execute test cases on MAC");
	}
	
	@Test
	@EnabledOnJre(JRE.JAVA_17)
	public void conditionJre() {
		System.out.println("Execute test cases as per given java version only");
		
	}
	
	@Test
	@EnabledForJreRange(min=JRE.JAVA_10, max=JRE.JAVA_20)
	public void conditonJre() {
		
		System.out.println("Execute test cases with java version 11 to 20");
		
		
		
	}

}
