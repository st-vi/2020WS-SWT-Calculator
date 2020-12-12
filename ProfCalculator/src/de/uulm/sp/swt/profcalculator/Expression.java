package de.uulm.sp.swt.profcalculator;

public abstract class Expression {

	// TODO rename l and r to left and right
	public Value l;
	public Value r;

	public abstract int evaluate();

	public String computeEquation() {
		return toString() + " = " + evaluate();
	}

}