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
				return (that.IntValue == 0) ? this : that;
			}

			public int IntValue {
				get;
			}
		}

		[Test, Sequential]
		public void AddIntegerValues (
			[Values (0, 7, 4)] int sum, 
			[Values (0, 7, 0)] int addend, 
			[Values (0, 0, 4)] int augend)
		{
			Assert.AreEqual (sum, new Fraction (addend).Plus (new Fraction (augend)).IntValue);
		}
	}
}

