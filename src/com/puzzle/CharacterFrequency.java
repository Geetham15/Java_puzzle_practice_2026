package com.puzzle;

import java.util.LinkedHashMap;
import java.util.Map;

//How do you count the frequency of each character in a string?
public class CharacterFrequency {

	public static void main(String[] args) {
		
		String input = "programming";
		
		Map<Character, Integer> frequency = new LinkedHashMap<>();
		
		for(char ch: input.toCharArray()) {
			frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
		}

		System.out.println("The frequency of each character in a string : ");
		System.out.println(frequency);
	}

}
