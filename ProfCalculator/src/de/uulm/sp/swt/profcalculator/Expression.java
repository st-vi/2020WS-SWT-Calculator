package de.uulm.sp.swt.profcalculator;

public abstract class Expression {

	public abstract int evaluate();

	public String computeEquation() {
		return toString() + " = " + evaluate();
	}

}