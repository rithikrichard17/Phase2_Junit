package com.app.junitDemo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
public class ParameterizesDemoWithCsv {
	
	@ParameterizedTest( name = "Csv source{arguments}")
	@CsvSource({
		"Audi, 25",
		"BMW, 24",
		"Volvo,45",
		"Mercedes, 50"
	})
	public void dataform_CSVsource(String car, String price) {
		System.out.println(car+":"+price);
	}

}
