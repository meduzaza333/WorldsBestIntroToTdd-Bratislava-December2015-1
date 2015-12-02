using System;
using NUnit.Framework;

namespace MathTests
{
	[TestFixture]
	public class AddFractions
	{
		public class Fraction
		{
			public Fraction (int intValue)
			{
				this.IntValue = intValue;
			}

			public Fraction Plus (Fraction fraction)
			{
				return this;
			}

			public int IntValue
			{
				get;
			}
		}

		[Test]
		public void ZeroPlusZero ()
		{
			Assert.AreEqual (0, new Fraction (0).Plus (new Fraction (0)).IntValue);
		}
	}
}

