package com.daidone.piglatin;

import java.util.ArrayList;

public class PigLatin {

	public static ArrayList<String> translate(String english) {

		String[] englishArray = english.trim().toLowerCase().split(" ");
		ArrayList<String> pigLatin = toPigLatin(
				TranslatingData.removingSpaces(TranslatingData.toArrayList(englishArray)));

		return pigLatin;
	}

	public static ArrayList<String> toPigLatin(ArrayList<String> english) {

		for (int i = 0; i < english.size(); i++) {

			String str1 = english.get(i);
			
			if (str1.matches(".*\\d+.*") || CheckingData.checkingSpecialChar(str1)) {
			
			} else if (str1.startsWith("a") || str1.startsWith("e") || str1.startsWith("i") || 
					str1.startsWith("o") || str1.startsWith("u")) {

				english.remove(i);
				english.add(i, str1 + "way");
				
			} else {

				english.remove(i);
				char[] charArray = str1.toCharArray();
				int count = 0;

				for (int j = 0; j < charArray.length; j++)
					if (charArray[j] == 'a' || charArray[j] == 'e' || charArray[j] == 'i' || 
							charArray[j] == 'o' || charArray[j] == 'u') {
						break;
					} else {
						if (j == 0) {
							charArray[j] = ' ';
						} else {
							charArray[j] = '-';
						}
						count++;
					}
				String str2 = new String(charArray);

				english.add(i, str2.trim() + str1.substring(0, count) + "ay");

			}
		}

		return english;
	}

}
