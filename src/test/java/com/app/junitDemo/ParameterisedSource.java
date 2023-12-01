package com.app.junitDemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.util.StringUtils;

public class ParameterisedSource {
	
	@ParameterizedTest(name ="checkblanks")
	@ValueSource(strings = {"abc","ddf","ffh"})
	@EmptySource
	public void checkblanks(String value) {
		
		Assertions.assertTrue(StringUtils.isBlank(value));
		System.out.println(value);
	}

}
