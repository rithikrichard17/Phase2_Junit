package com.app.junitDemo;

public class JavaUtils {
	
	public static boolean isPalindrome(String inputText) {
		
		int i = inputText.length()-1;
		int j = 0;
		
		while(i>j) {
			if (inputText.charAt(i) != inputText.charAt(i)) {
				
				return false;
				
			}
			i--;
			j++;
		}
		return true;
	}

    

	}

