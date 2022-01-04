package com.calc.controller;

import java.util.*;

public class CalcController implements CalcInterface {
	public void calcTotal() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int x = sc.nextInt();

		System.out.print("Enter the second number: ");
		int y = sc.nextInt();
		int result = x + y;
		
		System.out.print("Result: "+result);
	}
	public void multiplication() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int a = sc.nextInt();

		System.out.print("Enter the second number: ");
		int b = sc.nextInt();
		int result = a * b;
		
		System.out.print("Result: "+result);
	}

}
