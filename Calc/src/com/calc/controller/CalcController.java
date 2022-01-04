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

}
