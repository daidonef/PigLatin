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

}
