package com.douglashdezt.lambdas;

import java.util.function.Consumer;

public class Example03 {

	public static void main(String[] args) {
		add(5, 8, (n)-> {
			System.out.println("La suma da: " + n);
		});
		
		add(10, 15, Example03::printResult);
		add(1, 	5, 	Example03::printResult);
		add(4, 	16, Example03::printResult);
		add(10, 20, Example03::printResult);
		add(11, 9, 	Example03::printResult);
	}
	
	private static void add(int a, int b, Consumer<Integer> onResult) {
		int result = a + b;
		
		//Long process
		
		onResult.accept(result);
	}
	
	private static void printResult(int n) {
		System.out.println("Result: " + n);
	}

}
