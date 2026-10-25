package com.puzzle;
//How do you reverse a string without using reverse()
public class ReverseString {

	public static void main(String[] args) {
		String input = "My name is Geetha";
		String result = "";
		for(int i = input.length() - 1; i >= 0; i--) {
			result += input.charAt(i);
		}
		System.out.println("The reverse String is : " + result);
	}

}
