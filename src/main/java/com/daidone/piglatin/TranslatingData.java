package com.daidone.piglatin;

import java.util.ArrayList;

public class TranslatingData {
	
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
	
	public static String pigLatinVowel(String startingStr, String endingStr) {
		
		if (CheckingData.checkingAllUpperCase(startingStr)) {
			endingStr = endingStr.toUpperCase();
		} else if (CheckingData.checkingFirstUpperCase(startingStr)) {
			char[] charArray = endingStr.toCharArray();
			charArray[0] = Character.toUpperCase(charArray[0]);
			endingStr = new String(charArray);
		} else {
			endingStr = endingStr.toLowerCase();
		}
		
		return endingStr;
	}
	
	public static String pigLatinConsonant(String startingStr, String endingStr) {
		
		if (CheckingData.checkingAllUpperCase(startingStr)) {
			endingStr = endingStr.toUpperCase();
		} else if (CheckingData.checkingFirstUpperCase(startingStr)) {
			char[] charArray2 = endingStr.toCharArray();
			for (int k = 0; k < charArray2.length; k++) {
				if (charArray2[k] == '-') {
					
				} else {
					charArray2[k] = Character.toUpperCase(charArray2[k]);
					break;
				}
			}
			endingStr = new String(charArray2);
		} else {
			endingStr = endingStr.toLowerCase();
		}
		
		return endingStr;
	}

}
