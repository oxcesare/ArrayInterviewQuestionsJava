package com.mx.interview.question8;

public class Test5 {

	public static void main(String[] args) {
		
		fizzBuzz(15);

	}

	public static void fizzBuzz(int n) {

		for (int i = 1; i < n+1; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0 && i % 5 != 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0 && i % 3 != 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}

	}

}
