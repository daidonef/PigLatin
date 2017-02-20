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

			String startingStr = english.get(i);

			if (startingStr.matches(".*\\d+.*") || CheckingData.checkingSpecialChar(startingStr)) {

			} else if (CheckingData.checkingForVowels(startingStr)) {

				english.remove(i);
				String endingStr = startingStr + "way";
				english.add(i, TranslatingData.pigLatinPunctuation(startingStr, 
						TranslatingData.pigLatinVowel(startingStr, endingStr)));

			} else {

				english.remove(i);
				char[] charArray = startingStr.toCharArray();
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
				
				String endingStr = new String(charArray).trim() + startingStr.substring(
						0, count).toLowerCase() + "ay";
				english.add(i, TranslatingData.pigLatinPunctuation(startingStr, 
						TranslatingData.pigLatinConsonant(startingStr, endingStr)));

			}
			
		}

		return english;
	}

}
