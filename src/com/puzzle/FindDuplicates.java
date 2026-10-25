package com.puzzle;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//How do you find duplicates in a list
public class FindDuplicates {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(1,2,3,2,2,3,4,5,2,2);
		Set<Integer> seen = new HashSet<>();
		Set<Integer> duplicates = new LinkedHashSet<>();
		
		for(int number : numbers) {
			if(!seen.add(number)) {
				duplicates.add(number);
			}
		}
		System.out.println("The duplicates in the list");
		System.out.println(duplicates);

	}

}
