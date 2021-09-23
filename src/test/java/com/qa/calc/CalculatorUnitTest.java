package com.qa.calc;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorUnitTest {

	private Adder adder;
	private Subtractor subtractor;
	private Multiplier multiplier;
	private Divider divider;
	
	private Calculator calculator;
	
	@Before
	public void init() {
		adder = new Adder();
		subtractor = new Subtractor();
		multiplier = new Multiplier();
		divider = new Divider();
		calculator = new Calculator(adder, subtractor, multiplier, divider);
	}
	
	@Test
	public void addTest() {
		assertEquals(10, calculator.add(5, 5));
	}
	
	@Test
	public void subTest() {
		assertEquals(5, calculator.sub(10, 5));
	}
	
	@Test
	public void mulTest() {
		assertEquals(25, calculator.mul(5, 5));
	}
	
	@Test
	public void divTest() {
		assertEquals(5.5, calculator.div(11, 2), 0);
	}
}
