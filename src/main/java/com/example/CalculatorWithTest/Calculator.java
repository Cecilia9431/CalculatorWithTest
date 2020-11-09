package com.example.CalculatorWithTest;

public class Calculator {

	public double addition(double firstNumber, double secondNumber) {
			return firstNumber + secondNumber;
		}
	
	public double subtraction(double firstNumber, double secondNumber) {
		return firstNumber - secondNumber;
	}

	public double multiplication(double firstNumber, double secondNumber) {
		return firstNumber * secondNumber;
	}
	
	public double divition(double firstNumber, double secondNumber) {
		if (secondNumber == 0) {
			throw new ArithmeticException("divition by zero");
		}
		return firstNumber / secondNumber;
	}
	
}