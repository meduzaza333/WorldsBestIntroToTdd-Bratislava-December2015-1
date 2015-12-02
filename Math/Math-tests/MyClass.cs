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

			public Fraction Plus (Fraction that)
			{
				return new Fraction (this.IntValue + that.IntValue);
			}

			public int IntValue {
				get;
			}
		}

		[Test, Sequential]
		public void AddIntegerValues (
			[Values (0, 7, 4, -9)] int sum, 
			[Values (0, 7, 0, -12)] int addend, 
			[Values (0, 0, 4, 3)] int augend)
		{
			Assert.AreEqual (sum, new Fraction (addend).Plus (new Fraction (augend)).IntValue);
		}
	}
}

