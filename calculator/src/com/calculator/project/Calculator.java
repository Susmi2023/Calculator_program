package com.calculator.project;
import java.util.Scanner;

public class Calculator {

		public static int add(int a, int b) {
			return a + b;
		}

		public static int sub(int a, int b) {
			return (a - b);

		}

		public static int mul(int a, int b) {
			return a * b;
		}

		public static double div(double a, double b) {
			if (b == 0) {
				throw new IllegalArgumentException("number can't be divide by 0");
			}

			return a / b;
		}

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int input = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Second Number : ");
		int input1 = sc.nextInt();
		
		int add = add(input,input1);
		int mul = mul(input,input1);
		int sub = sub(input,input1);
		double div = div(input,input1);
		
		System.out.println("Addition of two numbers:"+add);
		System.out.println("Substraction of two numbers:"+sub);
		System.out.println("Multiplication of two numbers:"+mul);
		System.out.println("Division of two numbers:"+div);
		
	}
}


