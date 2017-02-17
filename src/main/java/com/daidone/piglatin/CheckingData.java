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

}
