package com.calc.view;

import com.calc.controller.CalcController;
import com.calc.controller.CalcInterface;

public class Calculate {
	public static void main(String args[]) {
		System.out.println("Edited by prameela");
		CalcInterface ec = new CalcController();
		
		ec.calcTotal();
	}

}
