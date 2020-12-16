package de.uulm.sp.swt.profcalculator;

public class Multiplication extends Expression {

	public Expression left;
	public Expression right;

	public Multiplication(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	public String toString() {
		return left.toString() + " * " + right.toString();
	}

	public int evaluate() {
		return left.evaluate() * right.evaluate();
	}
	
}
