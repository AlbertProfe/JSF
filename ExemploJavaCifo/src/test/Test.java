package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		System.out.println("Hello java class, java is nice, isn't it?");

		//int number = 55;
		String hello = "Hello world!!!";
		boolean isThisClassNice = true;
		double iva = 21.00;

		System.out.println("Tell me your name");
		Scanner reader = new Scanner(System.in);
		String name = reader.next();
		
		
		//test to reader
		System.out.println(hello + ", " + name);
		System.out.println("Tell me a number");
		int number = reader.nextInt();
		
		if (number != 0) {
			System.out.println("The number is not equal to 0");
		}

		if (number >= 1000) {
			System.out.println("The number is at least 1000");
		}

		System.out.println("Thank you very much to colaborate wiht us .. see you soon ..");
	}

}
