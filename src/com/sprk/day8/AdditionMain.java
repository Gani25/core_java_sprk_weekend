package com.sprk.day8;

public class AdditionMain {

	public static void main(String[] args) {
		// We can directly override Functional Interface Method.
//		Addition addition = (a, b) -> {
//			// More than 1 line of code logic
//			int result = a + b;
//
//			System.out.printf("Addition of %d, %d = %d\n", a, b, result);
//		};
//
//		addition.sum(5, 50);

		// Whenever we have single line of code
		// we can directly write without braces{}
		// and if its return statement we can skip
		// return keyword by default it will return

		Addition addition = (a, b) -> System.out.printf("Addition of %d, %d = %d\n", a, b, (a+b));
		

		addition.sum(5, 50);
		
	}

}
