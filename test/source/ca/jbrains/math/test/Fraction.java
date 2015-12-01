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
        final boolean addingIntegers = this.denominator == 0;
        if (addingIntegers)
            return new Fraction(this.integerValue + that.integerValue);
        else
            return new Fraction(
                    this.numerator + that.numerator,
                    this.denominator);
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
