package ca.jbrains.math.test;

import org.junit.Assert;
import org.junit.Test;

public class CreatingFractionsWithInvalidValues {
    @Test
    public void zeroDenominator() throws Exception {
        try {
            new Fraction(1, 0);
            Assert.fail("How did you create a fraction with a 0 denominator?!");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Zero denominator", expected.getMessage());
        }
    }
}
