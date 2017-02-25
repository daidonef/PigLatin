package com.daidone.piglatin;

import java.util.ArrayList;

public class TranslatingData {
	
	//Method that takes an array of Strings and makes it into an array list of Strings.
	public static ArrayList<String> toArrayList (String[] stringArrays) {
		
		ArrayList<String> arrayList = new ArrayList();
		for (String stringArray : stringArrays) {
			arrayList.add(stringArray);
		}
		
		return arrayList;
	}
	
	public static ArrayList<String> removingSpaces (ArrayList<String> spaces) {
		
		for (int i = 0; i < spaces.size(); i++) {
			if (spaces.get(i).equals("")) {
				spaces.remove(i);
				i--;
			}
		}
		
		return spaces;
	}
	
	//For the words that start with a vowel, this method saves the cases of the english words.
	public static String pigLatinVowel(String startingStr, String endingStr) {
		
		if (CheckingData.checkingAllUpperCase(startingStr)) {
			endingStr = endingStr.toUpperCase();
		} else if (CheckingData.checkingFirstUpperCase(startingStr)) {
			//Changes the first letter of the word to upper case if english word started with
			//an upper case.
			char[] charArrayES = endingStr.toCharArray();
			charArrayES[0] = Character.toUpperCase(charArrayES[0]);
			endingStr = new String(charArrayES);
		} else {
			endingStr = endingStr.toLowerCase();
		}
		
		return endingStr;
	}
	
	//For the words that start with a consonant, this method saves the cases of the english 
	//words.
	public static String pigLatinConsonant(String startingStr, String endingStr) {
		
		if (CheckingData.checkingAllUpperCase(startingStr)) {
			endingStr = endingStr.toUpperCase();
		} else if (CheckingData.checkingFirstUpperCase(startingStr)) {
			//Changes the first letter of the word to upper case if english word started with
			//an upper case.
			char[] charArrayES = endingStr.toCharArray();
			//'-' is used for removing characters earlier and will be removed in the JSP.
			for (int i = 0; i < charArrayES.length; i++) {
				if (charArrayES[i] == '-') {
					
				} else {
					charArrayES[i] = Character.toUpperCase(charArrayES[i]);
					break;
				}
			}
			endingStr = new String(charArrayES);
		} else {
			endingStr = endingStr.toLowerCase();
		}
		
		return endingStr;
	}
	
	//Changes the punctuation to the end of the pig latin word.
	public static String pigLatinPunctuation(String startingStr, String endingStr) {
		
		if (startingStr.endsWith(".") || startingStr.endsWith("?") || startingStr.endsWith("!")
				|| startingStr.endsWith(",")) {
			
			char[] charArray = new char [endingStr.length() + 1]; 
			for (int i = 0; i < endingStr.length(); i++) {
				charArray[i] = endingStr.charAt(i);
				if (charArray[i] == '.' || charArray[i] == '?' || charArray[i] == '!' || 
						charArray[i] == ',') {
					charArray[i] = '-';
				}
			}
			charArray[endingStr.length()] = startingStr.charAt(startingStr.length() - 1);
			endingStr = new String(charArray);
			
		}
		
		return endingStr;
	}

}
