package de.uulm.sp.swt.profcalculator;

public class Value extends Expression {

	Integer value;

	public Value(int value) {
		this.value = value;
	}

	public String toString() {
		return value.toString();
	}

	@Override
	public int evaluate() {
		return value.intValue();
	}

}
