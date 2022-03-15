package com.douglashdezt.lambdas;

import java.util.ArrayList;
import java.util.List;

public class Example01 {

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
		
		numbers.forEach((n) -> {
			System.out.println("Element: " + (n));
		});
		
		System.out.println("----- Map -----");
		
		List <Integer> doublenumbers = 
			numbers
				.stream()
				.filter((n) -> {
					return n > 6;
				})
				.map((n)-> {
					return n * 2;
				})
				.toList();
		
		System.out.println(doublenumbers);
	}

}
