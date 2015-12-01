package ca.jbrains.math.test;

public class Fraction {
    private int numerator;
    private int denominator;
    private int integerValue;

    public Fraction(int integerValue) {
        this.integerValue = integerValue;
        this.numerator = integerValue;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        this.integerValue = numerator;
    }

    public Fraction plus(Fraction that) {
        final boolean addingIntegers = this.denominator == 0;
        if (addingIntegers)
            return new Fraction(this.integerValue + that.integerValue, 1);
        else if (this.denominator == that.denominator)
            return new Fraction(
                    this.numerator + that.numerator,
                    this.denominator);
        else
            return new Fraction(
                    this.getNumerator() * that.getDenominator()
                            + that.getNumerator() * this.getDenominator(),
                    this.getDenominator() * that.getDenominator());
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
