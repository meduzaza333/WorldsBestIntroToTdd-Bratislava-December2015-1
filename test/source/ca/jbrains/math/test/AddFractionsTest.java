package ca.jbrains.math.test;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class AddFractionsTest {
    @Test
    public void zeroPlusZero() throws Exception {
        Fraction sum = new Fraction(0).plus(new Fraction(0));

        Assert.assertEquals(0, sum.intValue());
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
}
