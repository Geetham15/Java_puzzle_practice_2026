package com.puzzle;
// How do you check whether a string is a palindrome
public class Palindrome {
	//Palindrome reads the same forward and backward
	public static void main(String[] args) {
		String input = "madam";
		boolean isPalindrome = true;
		
		int left = 0;
		int right = input.length() - 1;
		//loop the input by increment 1 from left and also decrement 1 from right
		while(left < right) {
			//check the equality of the character
			if(input.charAt(left) != input.charAt(right)) {
				isPalindrome = false;
				break;
			}
			left++;
			right--;
		}
		System.out.println("The Palindrome of the input \"" + input + "\" is : " +isPalindrome);
	}

}
