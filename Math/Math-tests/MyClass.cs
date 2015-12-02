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

			public int IntValue {
				get;
			}
		}

		[Test]
		public void AddIntegerValues(
			[Values(0, 7)] int sum, 
			[Values(0, 7)] int addend, 
			[Values(0, 0)] int augend)
		{
			Assert.AreEqual (sum, new Fraction (addend).Plus (new Fraction (augend)).IntValue);
		}
	}
}

