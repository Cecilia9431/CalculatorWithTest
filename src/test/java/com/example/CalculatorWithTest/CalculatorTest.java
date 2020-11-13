package com.example.CalculatorWithTest;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
	
	private Calculator calculator ;
	private double firstNumber ;
	private double secondNumber ;
	private double result;
	
	public CalculatorTest() {
		super();
		calculator = new Calculator();
		firstNumber = 10;
		secondNumber = 0;
	}

	public void testAddition() {
		result = calculator.addition(firstNumber, secondNumber);
		assertEquals(new Double(firstNumber+secondNumber), new Double(result));
	}

	public void testSubtraction() {
		result = calculator.subtraction(firstNumber, secondNumber);
		assertEquals(new Double(firstNumber-secondNumber), new Double(result));
	}

	public void testMultiplication() {
		result = calculator.multiplication(firstNumber, secondNumber);
		assertEquals(new Double(firstNumber*secondNumber), new Double(result));
	}

	public void testDivition() {
		result = calculator.divition(firstNumber, secondNumber);
		assertEquals(new Double(firstNumber/secondNumber), new Double(result));
	}

}
