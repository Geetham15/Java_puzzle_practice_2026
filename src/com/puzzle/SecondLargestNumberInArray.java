package com.puzzle;

import java.util.List;

//How do you find the second largest distinct number in an array
public class SecondLargestNumberInArray {

	public static void main(String[] args) {
	
		Integer largest = null;
		Integer second = null;
		
		List<Integer> numbers = List.of(1,2,3,4,5,6,98,99,67,100,100,23,101);
		
		for(int number: numbers) {
			// if the number greater than largest
			if(largest == null || number > largest) {
				second = largest;
				largest = number;
			} else if( number != largest &&			  // if number is not largest and second largest is null 
				(second == null || number > second)){ // and the number is greater than second largest
				second = number;
			}
			
			if(second == null) {
				System.out.println("No second-largest distinct value");
			} else {
				System.out.println(second);
			}
		}

	}

}
