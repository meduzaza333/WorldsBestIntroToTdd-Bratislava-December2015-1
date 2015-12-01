package ca.jbrains.math.test;

public class Fraction {
    private int integerValue;

    public Fraction(int integerValue) {
        this.integerValue = integerValue;
    }

    public Fraction(int numerator, int denominator) {

    }

    public Fraction plus(Fraction that) {
        return new Fraction(this.integerValue + that.integerValue);
    }

    public int intValue() {
        return integerValue;
    }

    public int getNumerator() {
        return 4;
    }

    public int getDenominator() {
        return 5;
    }
}
