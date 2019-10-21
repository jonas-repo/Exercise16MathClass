package com.exercise16math.app;

import java.util.Scanner;

public class MathClassApp {

	public static void main(String[] args) {
		
		//variables
		int num1 =3;
		int num2 =5;
		double numInput = 0.0;
	
		//objects
		Scanner input = new Scanner(System.in);
		//output
		
		System.out.println("Value of e: "+Math.E);
		System.out.println("Value of PI: "+Math.PI);
		System.out.println("Absolute value of -2.15: "+Math.abs(-2.15));
		System.out.println("Cube root of 27: "+Math.cbrt(27));
		System.out.println("Round of  3.76: "+Math.round(3.76));
		System.out.println("Ceil of 3.76: "+Math.ceil(3.76));
		System.out.println("Floor of 3.76: "+Math.floor(3.76));
		System.out.println("Decrement of 5: "+ Math.decrementExact(5));
		System.out.println("Increment of 5: "+Math.incrementExact(5));
		System.out.println("Power value of 3 Euler is: "+Math.exp(3));
		System.out.println("Which is bigger? "+num1 +" or "+num2 +": "+Math.max(num1, num2));
		System.out.println("Which is smaller? "+num1 +" or "+num2 +": "+Math.min(num1, num2));
		System.out.println("Sin of 0 degrees is: "+Math.sin(0));
		System.out.println("Sin of PI/2 degrees is: "+Math.sin(Math.PI/2));
		System.out.println("Cos of 0 degrees is: "+Math.cos(0));
		System.out.println("Cos of PI/2 degrees is: "+Math.cos(Math.PI/2));
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Input Number");
			numInput = input.nextDouble();
			System.out.println("The square of number " + numInput + " is " + Math.sqrt(numInput));			
		}
		int count=0;
		do {
			
			count++;
		}while(count<5);
		
	}
	
	

}
