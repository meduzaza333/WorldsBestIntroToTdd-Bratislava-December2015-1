package ca.jbrains.math.test;

import org.junit.Assert;
import org.junit.Assume;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

public class FractionsEqualityTest {
    @RunWith(Theories.class)
    public static class AllDifferentValues {
        @DataPoints
        public static Fraction[] fractions = {
                new Fraction(0),
                new Fraction(5),
                new Fraction(-8),
                new Fraction(1, 2),
                new Fraction(3, 4),
                new Fraction(-9, 17),
        };

        @Theory
        public void reflexivePropertyIsSatisfied(Fraction fraction) throws Exception {
            Assume.assumeTrue(fraction == fraction);
            Assert.assertEquals(fraction, fraction);
        }

        @Theory
        public void differentValuesAreNotEqual(Fraction one, Fraction theOther) throws Exception {
            Assume.assumeFalse(one == theOther);
            Assert.assertNotEquals(one, theOther);
        }
    }

    @RunWith(Theories.class)
    public static class NotAllValuesDifferent {
        @DataPoints
        public static Fraction[] fractions = {
                new Fraction(0),
                new Fraction(5),
                new Fraction(-8),
                new Fraction(1, 2),
                new Fraction(3, 4),
                new Fraction(-9, 17),
                new Fraction(0, 1),
                new Fraction(10, 2),
                new Fraction(32, -4),
                new Fraction(-9, -18),
                new Fraction(3 * 2178, 4 * 2178),
                new Fraction(-9 * 382312, 17 * 382312),
                new Fraction(0, 181),
                new Fraction(5 * 78, 1 * 78),
                new Fraction(-8 * 118, 1 * 118),
                new Fraction(1 * (-42), 2 * (-42)),
                new Fraction(3 * (-217), 4 * (-217)),
                new Fraction(-9 * (-231), 17 * (-231))
        };

        @Theory
        public void symmetricPropertyIsSatisfied(Fraction a, Fraction b) throws Exception {
            Assume.assumeTrue(a.equals(b));

            Assert.assertEquals(a, b);
            Assert.assertEquals(b, a);
        }

        @Theory
        public void antiSymmetricPropertyIsSatisfied(Fraction a, Fraction b) throws Exception {
            Assume.assumeFalse(a.equals(b));

            Assert.assertNotEquals(a, b);
            Assert.assertNotEquals(b, a);
        }

        @Theory
        public void transitivePropertyIsSatisfied(Fraction a, Fraction b, Fraction c) throws Exception {
            Assume.assumeTrue(a.equals(b));
            Assume.assumeTrue(b.equals(c));

            Assert.assertEquals(a, c);
        }

        @Theory
        public void transitivePropertyIsViolatedDueToC(Fraction a, Fraction b, Fraction notEqualToB) throws Exception {
            Assume.assumeTrue(a.equals(b));
            Assume.assumeFalse(b.equals(notEqualToB));

            Assert.assertNotEquals(a, notEqualToB);
        }

        @Theory
        public void transitivePropertyIsViolatedDueToB(Fraction a, Fraction notEqualToA, Fraction c) throws Exception {
            Assume.assumeFalse(a.equals(notEqualToA));
            Assume.assumeTrue(notEqualToA.equals(c));

            Assert.assertNotEquals(a, c);
        }
    }

    @RunWith(Theories.class)
    public static class TheVariousFormsOfZero {
        @DataPoints
        public static Fraction[] zeroes = {
                new Fraction(0),
                new Fraction(0, 1),
                new Fraction(0, 1123),
                new Fraction(0, 9387),
                new Fraction(0, 3),
                new Fraction(0, -87346),
                new Fraction(0, -38292),
        };

        @Theory
        public void allZeroesAreEqual(Fraction oneForm, Fraction theOtherForm) throws Exception {
            Assume.assumeTrue(oneForm.getNumerator() == 0);
            Assume.assumeTrue(theOtherForm.getNumerator() == 0);
            
            Assert.assertEquals(oneForm, theOtherForm);
        }
    }
}
