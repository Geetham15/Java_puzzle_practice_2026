package com.puzzle;
//Use recursion to add a range of numbers together by breaking it down into the simple task of adding two numbers.
public class Recursion {

	public static int sum(int k) {
		if(k > 0)
			return k + sum(k-1);
		else
			return 0; // halting condition k becomes 0
	}
	public static void main(String[] args) {
		int result = sum(10);
		System.out.println(result);

	}

}
