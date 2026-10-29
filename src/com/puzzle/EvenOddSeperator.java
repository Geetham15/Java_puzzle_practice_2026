package com.puzzle;

import java.util.Arrays;

public class EvenOddSeperator {

	public static void main(String[] args) {
		
		int[] arr= {2,5,8,7,1,3,6,4,5,9};
		int left = 0, right = arr.length - 1;
		
		while(left < right) {
			//Move left pointer until an odd number is found
			while(left<right && arr[left] %2 ==0) {
				left++;
			}
		
			// Move right pointer until an even number is found
			while(left<right && arr[right] %2 !=0) {
				right--;
			}
			// Swap odd number on the left with the even number on the right
			if(left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		//Print modified array
		System.out.println("Separated Even and Odd numbers: " + Arrays.toString(arr));

	}

}
