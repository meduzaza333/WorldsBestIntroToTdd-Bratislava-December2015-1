package ca.jbrains.math.test;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int integerValue) {
        this(integerValue, 1);
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction plus(Fraction that) {
        final boolean addingIntegers = this.denominator == 0;
        if (addingIntegers)
            return new Fraction(this.numerator + that.numerator, 1);
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

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
}
