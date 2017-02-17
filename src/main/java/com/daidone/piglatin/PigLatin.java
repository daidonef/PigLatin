package com.daidone.piglatin;

import java.util.ArrayList;

public class PigLatin {

	public static ArrayList<String> translate(String english) {

		String[] englishArray = english.trim().split(" ");
		ArrayList<String> pigLatin = toPigLatin(
				TranslatingData.removingSpaces(TranslatingData.toArrayList(englishArray)));

		return pigLatin;
	}

	public static ArrayList<String> toPigLatin(ArrayList<String> english) {

		for (int i = 0; i < english.size(); i++) {

			String str1 = english.get(i);

			if (str1.matches(".*\\d+.*") || CheckingData.checkingSpecialChar(str1)) {

			} else if (CheckingData.checkingForVowels(str1)) {

				english.remove(i);
				String str3 = str1 + "way";
				if (CheckingData.checkingAllUpperCase(str1)) {
					str3 = str3.toUpperCase();
				} else if (CheckingData.checkingFirstUpperCase(str1)) {
					char[] charArray = str3.toCharArray();
					charArray[0] = Character.toUpperCase(charArray[0]);
					str3 = new String(charArray);
				} else {
					str3 = str3.toLowerCase();
				}
				english.add(i, str3);

			} else {

				english.remove(i);
				char[] charArray = str1.toCharArray();
				boolean checkCase = false;
				
				//if (Character.isUpperCase(charArray[0])) {
				//	checkCase = true;
				//}
				
				int count = 0;

				for (int j = 0; j < charArray.length; j++) {
					if (CheckingData.checkingForVowels(charArray[j])) {
						break;
					} else {
						if (j == 0) {
							charArray[j] = ' ';
						} else {
							charArray[j] = '-';
						}
						count++;
					}
				}
				
				String str2 = new String(charArray);
				String str3 = str2.trim() + str1.substring(0, count).toLowerCase() + "ay";
				
				if (CheckingData.checkingAllUpperCase(str1)) {
					str3 = str3.toUpperCase();
				} else if (CheckingData.checkingFirstUpperCase(str1)) {
					char[] charArray2 = str3.toCharArray();
					for (int k = 0; k < charArray2.length; k++) {
						if (charArray2[k] == '-') {
							
						} else {
							charArray2[k] = Character.toUpperCase(charArray2[k]);
							break;
						}
					}
					str3 = new String(charArray2);
				} else {
					str3 = str3.toLowerCase();
				}
				
				//if (checkCase) {
				//	charArray[count] = Character.toUpperCase(charArray[count]);
				//}
				
				english.add(i, str3);

			}
			
		}

		return english;
	}

}
