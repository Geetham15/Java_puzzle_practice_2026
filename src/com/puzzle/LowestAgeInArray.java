package com.puzzle;

public class LowestAgeInArray {

	public static void main(String[] args) {
		int[] ages = {18, 20, 1,25, 35,45,55,67};
		int lowestAge = ages[0];
		
		for(int age : ages) {
			if(lowestAge > age) {
				lowestAge = age;
			}
		}
		System.out.println("The lowest age in the array is : " + lowestAge);

	}

}
