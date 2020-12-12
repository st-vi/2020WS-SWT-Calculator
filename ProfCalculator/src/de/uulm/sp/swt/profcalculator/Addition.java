package de.uulm.sp.swt.profcalculator;

public class Addition extends Expression {
	
	public Value left;
	public Value right;

	public Addition(Value left, Value right) {
		this.left = left;
		this.right = right;
	}

	public String toString() {
		return left.toString() + " + " + right.toString();
	}

	public int evaluate() {
		return left.getValue() + right.getValue();
	}
	
}
