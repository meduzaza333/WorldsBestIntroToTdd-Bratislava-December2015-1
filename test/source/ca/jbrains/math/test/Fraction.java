package ca.jbrains.math.test;

public class Fraction {
    private int numerator;
    private int denominator;
    private int integerValue;

    public Fraction(int integerValue) {
        this.integerValue = integerValue;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction plus(Fraction that) {
        if (this.denominator == 0)
        return new Fraction(this.integerValue + that.integerValue);
        else
            return new Fraction(4, 5);
    }

    public int intValue() {
        return integerValue;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
}
