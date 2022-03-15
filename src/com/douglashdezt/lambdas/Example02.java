package com.douglashdezt.lambdas;

import java.util.ArrayList;
import java.util.List;

public class Example02 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(5);
		numbers.add(3);
		numbers.add(6);
		numbers.add(34);
		numbers.add(7);
		numbers.add(9);
		numbers.add(0);
		
		System.out.println("----- For Each -----");
		
		numbers.forEach(System.out::println);
		
		System.out.println("----- Map -----");
		
		List <Integer> doublenumbers = 
			numbers
				.stream()
				.filter(Example02::nGT6)
				.map(Example02::numberTimesTwo)
				.toList();
		
		System.out.println(doublenumbers);
	}
	
	private static Integer numberTimesTwo(int n) {
		return n * 2;
	}
	
	private static boolean nGT6(int n) {
		return n > 6;
	}

}
