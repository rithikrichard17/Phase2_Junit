package com.app.junitDemo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class ParametrizedEnumMethod {
	
	enum Level{
	
	Steff,
	Mags,
	Rick
	}
	
	@ParameterizedTest(name = "Enum Values{arguments}")
	@EnumSource(Level.class)
	public void passlevelEnumSouce(Object value) {
		System.out.println(value.toString());
	}
	
		
}


