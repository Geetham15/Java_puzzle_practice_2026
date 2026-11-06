package com.puzzle;
//Find the highest and lowest value in an array
public class HighestLowestValueInArray {

	public static void main(String[] args) {

		int numbers[] = {1,23,34,56,78,98,0,12};
		int max = numbers[0];
		int min = numbers[0];
		
		for(int n : numbers) {
			if(n>max) {
				max = n;
			}
			if(n<min) {
				min = n;
			}
		}

		System.out.println("The Lowest value in an array is : " + min);
		System.out.println("The highest value in an array is: " + max);
	}

}
