package de.uulm.sp.swt.profcalculator;

public class Multiplication extends Expression {

	public Multiplication(Value l, Value r) {
		this.l = l;
		this.r = r;
	}

	public String toString() {
		return l.toString() + " * " + r.toString();
	}

	public int evaluate() {
		return l.getValue() * r.getValue();
	}
	
}
