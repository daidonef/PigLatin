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
		
		//Will go through each word in a sentence or paragraph and translate it into pig latin.
		for (int i = 0; i < english.size(); i++) {

			String startingStr = english.get(i);
			
			//If the word has a number or a special character listed then it will not translate.
			if (startingStr.matches(".*\\d+.*") || CheckingData.checkingSpecialChar(startingStr)) {

			} else if (CheckingData.checkingForVowels(startingStr)) {
				//For words that start with a vowel.
				english.remove(i);
				String endingStr = startingStr + "way";
				english.add(i, TranslatingData.pigLatinPunctuation(startingStr, 
						TranslatingData.pigLatinVowel(startingStr, endingStr)));

			} else {
				//For words that start with a consonant.
				english.remove(i);
				char[] charArray = startingStr.toCharArray();
				int count = 0;

				for (int j = 0; j < charArray.length; j++) {
					if (CheckingData.checkingForVowels(charArray[j])) {
						break;
					} else {
						if (j == 0) {
							//Adds the ' ' between the words.
							charArray[j] = ' ';
						} else {
							//Adds '-' for characters to be removed in the JSP.
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
