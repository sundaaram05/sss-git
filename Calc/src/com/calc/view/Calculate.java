package com.calc.view;

import com.calc.controller.CalcController;
import com.calc.controller.CalcInterface;

public class Calculate {
	public static void main(String args[]) {
		CalcInterface ec = new CalcController();
		
		ec.calcTotal();
	}

}
