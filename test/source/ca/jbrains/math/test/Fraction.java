package ca.jbrains.math.test;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int integerValue) {
        this(integerValue, 1);
    }

    public Fraction(int numerator, int denominator) {
        if (denominator == 0)
            throw new IllegalArgumentException("Zero denominator");

        this.numerator = numerator;
        this.denominator = denominator;
    }

    private static int gcd(int numerator, int denominator) {
        return 0;
    }

    public Fraction plus(Fraction that) {
        if (this.denominator == that.denominator)
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

    @Override
    public boolean equals(Object other) {
        if (other instanceof Fraction) {
            final Fraction that = (Fraction) other;
            return this.numerator * that.denominator
                    == that.numerator * this.denominator;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("%d/%d", numerator, denominator);
    }
}
