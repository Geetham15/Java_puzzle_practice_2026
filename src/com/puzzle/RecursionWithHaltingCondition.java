package com.puzzle;
//Use recursion to add all numbers from 5 to 10 ( 5+6+7+8+9+10)
public class RecursionWithHaltingCondition {

	public static int sum(int start, int end) {
		if(end > start) { //halting condition
			return end + sum(start, end - 1);
		}else {
			return end;
		}
	}
	
	public static void main(String[] args) {
		int result = sum(5, 10); 
		System.out.println(result); //45
	}

}
