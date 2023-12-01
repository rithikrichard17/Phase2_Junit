package com.app.junitDemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

//@Disabled("Functionaity is not working, ignoring the test")
public class DisabledTests {
	
	@Test
	public void Method1() {
		System.out.println("Executing Method 1");
	}
	
	@Test
	public void Method2() {
		System.out.println("Executing Method 2");
	}
	
	@Test
	@Disabled
	public void Method3() {
		System.out.println("Executing Method 3");
	}
	
	@Test
	public void Method4() {
		System.out.println("Executing Method 4");
	}


}
