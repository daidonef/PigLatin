package com.daidone.piglatin;

public class CheckingData {

	public static boolean checkingSpecialChar(String str1) {

		String specialChars = "/*!@#$%^&*()\"{}_[]|\\?/<>,.";

		for (int i = 0; i < str1.length(); i++) {
			if (specialChars.contains(str1.substring(i, i + 1))) {
				return true;
			}
		}

		return false;
	}
	
	public static boolean checkingAllUpperCase(String str1) {
		
		char[] charArray = str1.toCharArray();
		
		if (Character.isUpperCase(charArray[1])){
			return true;
		}
		
		return false;
	}
	
	public static boolean checkingFirstUpperCase(String str1) {
		
		char[] charArray = str1.toCharArray();
		
		if (Character.isUpperCase(charArray[0])){
			return true;
		}
		
		return false;
		
	}
	
	public static boolean checkingForVowels(String str1) {
		
		if (str1.startsWith("a") || str1.startsWith("e") || str1.startsWith("i") || 
				str1.startsWith("o") || str1.startsWith("u") || str1.startsWith("A") || 
				str1.startsWith("E") || str1.startsWith("I") || str1.startsWith("O") || 
				str1.startsWith("U")) {
			return true;
		}
		
		return false;
	}
	
	public static boolean checkingForVowels(char char1) {
		
		if (char1 == 'a' || char1 == 'e' || char1 == 'i' || char1 == 'o' || char1 == 'u' || 
				char1 == 'A' || char1 == 'E' || char1 == 'I' || char1 == 'O' || char1 == 'U') {
			return true;
		}
		
		return false;
	}

}
