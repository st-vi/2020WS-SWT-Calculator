package de.uulm.sp.swt.profcalculator;

// TODO rename class Add into Addition
public class Add extends Expression {
	
	public Add(Value l, Value r) {
		this.l = l;
		this.r = r;
	}

	public String toString() {
		return l.toString() + " + " + r.toString();
	}

	public int evaluate() {
		return l.getValue() + r.getValue();
	}
	
}
