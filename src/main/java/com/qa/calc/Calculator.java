package com.qa.calc;

public class Calculator {

	private Adder adder;
	private Subtractor subtractor;
	private Multiplier multiplier;
	private Divider divider;
	
	public Calculator(Adder adder, Subtractor subtractor, Multiplier multiplier, Divider divider) {
		this.adder = adder;
		this.subtractor = subtractor;
		this.multiplier = multiplier;
		this.divider = divider;
	}
	
	public int add(int i, int j) {
		return adder.add(i, j);
	}
	
	public int sub(int i, int j) {
		return subtractor.sub(i, j);
	}
	
	public int mul(int i, int j) {
		return multiplier.mul(i, j);
	}
	
	public double div(int i, int j) {
		return divider.div(i, j);
	}

	// Getters and Setters
	public Adder getAdder() {
		return adder;
	}

	public void setAdder(Adder adder) {
		this.adder = adder;
	}

	public Subtractor getSubtractor() {
		return subtractor;
	}

	public void setSubtractor(Subtractor subtractor) {
		this.subtractor = subtractor;
	}
}
