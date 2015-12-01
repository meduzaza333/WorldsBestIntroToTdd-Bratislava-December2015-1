package ca.jbrains.math.test;

import org.junit.Assert;
import org.junit.Test;

public class AddFractionsTest {
    @Test
    public void zeroPlusZero() throws Exception {
        Assert.assertEquals(
                new Fraction(0),
                new Fraction(0).plus(new Fraction(0)));
    }

    @Test
    public void notZeroPlusZero() throws Exception {
        Assert.assertEquals(
                new Fraction(7),
                new Fraction(7).plus(new Fraction(0)));
    }

    @Test
    public void zeroPlusNotZero() throws Exception {
        Assert.assertEquals(
                new Fraction(-4),
                new Fraction(0).plus(new Fraction(-4)));
    }

    @Test
    public void notZeroPlusNotZero() throws Exception {
        Assert.assertEquals(
                new Fraction(-3),
                new Fraction(1).plus(new Fraction(-4)));
    }

    @Test
    public void sameDenominatorWithoutReducing() throws Exception {
        Assert.assertEquals(
                new Fraction(4, 5),
                new Fraction(1, 5).plus(new Fraction(3, 5)));
    }

    @Test
    public void differentDenominatorsWithoutReducing() throws Exception {
        Assert.assertEquals(
                new Fraction(37, 56),
                new Fraction(3, 8).plus(new Fraction(2, 7)));
    }

    @Test
    public void moreDifferentDenominatorsWithoutReducing() throws Exception {
        Assert.assertEquals(
                new Fraction(-14, 55),
                new Fraction(-4, 5).plus(new Fraction(6, 11)));
    }

    @Test
    public void denominatorsOfOne() throws Exception {
        Assert.assertEquals(
                new Fraction(7, 1),
                new Fraction(5, 1).plus(new Fraction(2, 1)));
    }
}
