package com.app.junitDemo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestMethodOrder(MethodOrderer.Random.class)
public class DisplayNameOrderAnnotation {
	@Order(3)
	@Test
	public void Method1() {
		
		System.out.println("click on sign in button");
	}
@Order(1)	
@DisplayName("1. Test usernmae field")
@Test	
public void Method2() {
		
		System.out.println("Enter the username");
	}
@Order(4)
@Test
public void Method3() {
	
	System.out.println("Enter the username in Forgot Password");
}

@Order(2)
@Test
public void Method4() {
	
	System.out.println("Enter the password");
}

}
