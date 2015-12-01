package ca.jbrains.math.test;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class AddFractionsTest {
    @Test
    public void zeroPlusZero() throws Exception {
        Fraction sum = new Fraction(0).plus(new Fraction(0));

        Assert.assertEquals(0, sum.intValue());
        Assert.assertEquals(0, sum.getNumerator());
        Assert.assertEquals(1, sum.getDenominator());
    }

    @Test
    public void notZeroPlusZero() throws Exception {
        Fraction sum = new Fraction(7).plus(new Fraction(0));

        Assert.assertEquals(7, sum.intValue());
    }

    @Test
    public void zeroPlusNotZero() throws Exception {
        Fraction sum = new Fraction(0).plus(new Fraction(-4));

        Assert.assertEquals(-4, sum.intValue());
    }

    @Test
    public void notZeroPlusNotZero() throws Exception {
        Fraction sum = new Fraction(1).plus(new Fraction(-4));

        Assert.assertEquals(-3, sum.intValue());
    }

    @Test
    public void sameDenominatorWithoutReducing() throws Exception {
        Fraction sum = new Fraction(1, 5).plus(new Fraction(3, 5));

        Assert.assertEquals(4, sum.getNumerator());
        Assert.assertEquals(5, sum.getDenominator());
    }

    @Test
    public void differentDenominatorsWithoutReducing() throws Exception {
        Fraction sum = new Fraction(3, 8).plus(new Fraction(2, 7));

        Assert.assertEquals(37, sum.getNumerator());
        Assert.assertEquals(56, sum.getDenominator());
    }

    @Test
    public void moreDifferentDenominatorsWithoutReducing() throws Exception {
        Fraction sum = new Fraction(-4, 5).plus(new Fraction(6, 11));

        Assert.assertEquals(-14, sum.getNumerator());
        Assert.assertEquals(55, sum.getDenominator());
    }

    @Test
    public void denominatorsOfOne() throws Exception {
        Fraction sum = new Fraction(5, 1).plus(new Fraction(2, 1));

        Assert.assertEquals(7, sum.getNumerator());
        Assert.assertEquals(1, sum.getDenominator());
    }
}
